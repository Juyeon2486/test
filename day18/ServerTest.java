package com.day18;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest extends Frame implements ActionListener,Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null; //서버 소켓과 소켓은 널로 초기화.
	private Socket sc = null;
	
	public ServerTest() {
		
		add(ta,BorderLayout.CENTER);
		add(tf,BorderLayout.SOUTH);//tf까지만 써도됨 
		tf.addActionListener(this); //cctv
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
			}
		});
		
		setTitle("채팅서버");
		setSize(300,400);
		setVisible(true);
	}
	
	public void serverStart() {
		
		try {
			
			ss = new ServerSocket(7777); //포트로 들어와야함 약속임. 포트번호 7777로 설정한것
			ta.setText("서버시작!"); //서버를 실행시켜야 억셉트가 가능하다.
			//cpu가 블럭상태로 대기한다.
			sc = ss.accept();  //클라이언트와 연결함. 억셉트 전엔 대기중.
			
			Thread th = new Thread(this);//디스자리에 러너블을 적어야하지만 this가 러너블을 받았기때문에 this를 써준다.
			th.start();//수다를 받아옴.
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {// 스레드는 런을 오버라이드
		new ServerTest().serverStart(); //객체생성을 할 필요없이 두번적어준다.

	}

	@Override
	public void run() {
		//데이터를 받을때
		
		String str;
		String ip;
		
		try { //네트워크에는 트라이캐치문을 무조건 써준다 예외처리되어있을 수 있기 때문
			
			if(sc==null)
				return;
			
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			//br에는 클라이언트가 보낸 정보가 담겨있음.
			//clientIP 알아내는법
			ip = sc.getInetAddress().getHostAddress();
			ta.append("\r\n[" + ip + "] 접속!!"); //ta에 계속 누적해서
			
			while((str=br.readLine())!=null) {
				ta.append("\r\n" + str); // str에 뿌려준다.
			}
			
		} catch (Exception e) {//클라이언트가 종료되면 소켓과 서버소켓에 값이 쓰레기값으로 남아있다.
			ta.append("\r\n 클라이언트 연결 종료...");
			sc = null;
			ss = null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//데이터를 보낼때 
		
		String str = tf.getText();
		
		if(str.trim().equals("")) { //양쪽에 공백이 있으면 없애라 trim  양쪽 공백을 없애고도 값이 널이면 종료
			return;
		}
		
		if(sc==null) { //끊기지 않으면.
			return;
			
		}
		
		try {
			//OutputStream os = sc.getOutputStream() 인풋스트림과 아웃풋스트림은 짝. 원래 이렇게 적어주어야하지만
			//true:flush 여기서 true는 flush와 같은 뜻
			PrintWriter pw = new PrintWriter(sc.getOutputStream(),true); //위에서 is값에 넣기때문에 바로 적어준다.
			pw.println("서버]" + str); //클라이언트에 전송
			
			ta.append("\r\n서버]:" + str); // 이건 내창에 띄움.
			
			tf.setText(""); //채팅입력창을 공백으로 초기화하고 초점을 처음에 맞춘다.
			tf.requestFocus();
			
			
		} catch (Exception e2) {
			ta.append("\r\n 클라이언트와 접속이 끊겼습니다.");
			sc = null;
			
		}
	}

}
