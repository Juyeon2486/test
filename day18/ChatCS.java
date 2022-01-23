package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ChatCS extends Frame implements Runnable,ActionListener {

	private static final long serialVersionUID = 1L;
	//다중채팅
	private MulticastSocket ms = null; //내부에서 사용할 멀티캐스트소켓
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.1"; 
	private int port = 7777; //포트는 7777로 
	private String userName = "주연";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagramSocket : UDP로 데이타그램 패킷을 전송하거나 수신함
	//DatagramPacket : UDP를 이용하여 전송될 수 있는 데이터.
	//MulticastSocket : 다수의 클라이언트에 데이터그램을 전송한다. //브로드캐스트소켓이라고도 함.
	//D class의 범위 : 244.0.0.0 ~239.255.255.255 
	//UDP는 근거리 통신망 TCP/IP보다 빠르다 속도가
	//TCP/IP는 원거리 통신망 신중하게 데이터를 전송.

	public ChatCS() {
		
		ta.setEditable(false); //시작할때 ta를 비활성화
		add(ta,BorderLayout.CENTER);
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
		});
		
		setTitle("그룹채팅[" + host + "]");
		setSize(400,400);
		setVisible(true);
		tf.requestFocus();
		//화면 만들어두고 종료버튼 활성화, 화면제목 화면사이즈 설정.
	}
	
	public void setup() {//처음 시작할때 연결 
		
		try {
			//고민할빠엔 다되는것 써라
			xGroup = InetAddress.getByName(host); //x그룹에 아이피가 들어감 x그룹은 아이넷 어드레스
			ms = new MulticastSocket(port);//포트번호를 가지고있다
			
			//특정 그룹에 포함 위 호스트와포트를 합치는작업.
			ms.joinGroup(xGroup); // ms에 x그룹을 조인 //아이피와 포트번호를 하나로 합치면 하나의 그룹으로 여러사람이 모이게된다.
			
			Thread th = new Thread(this); //나 자체가 스레드라는 뜻
			th.start();  //채팅 시작
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void disConnect() { //연결끊기는 연결과 반대작업 
		
		try {
			
			ms.leaveGroup(xGroup); //ms에서 xGroup을 제외 / 하고 ms를 닫음.
			ms.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		new ChatCS().setup(); //차트cs의 셋업을 실행
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();//사용자가 입력한 문자를 읽어와서 앞뒤 공백을 제외하고 널이면.
		if(str.equals(""))
			return;
							//3개다 String이여서 다이렉트로 넣어줄 수 없다. 바이트의 배열을 만들었기에 .getBytes로 바이트로 변환
		byte[] buffer = (userName + "]" + str).getBytes();
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
					//버퍼에있는 내용을 버퍼에 최대 크기만큼 x그룹에 
			
			ms.send(dp); //ms에 보낸다? 
			
			tf.setText(""); //채팅보내고나서 그채팅창을 공백으로 초기화
			tf.requestFocus();//마우스커서를 처음에 맞춤.
			
		} catch (Exception e2) {
			System.out.println(e2.toString());
			
		}
		
		
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				byte[] buffer = new byte[512]; //한번 받을때 512바이트씩 받겠다. 라는 뜻. 채팅보낼때 512바이트면 충분
				
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				//버퍼에 있는 내용을 버퍼의 크기만큼 받아서 dp에 담는다
				
				ms.receive(dp); //보낼땐 send 받을땐 receive
				
				String str = new String(dp.getData()).trim(); //바이트로받은 데이터를 스트링으로 반환 앞뒤 공백제외. //
				
				ta.append(str + "\r\n");
				
				
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect(); // 에러가 나면 연결을 끊는다.
		}

	}

}
