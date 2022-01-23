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
	//����ä��
	private MulticastSocket ms = null; //���ο��� ����� ��Ƽĳ��Ʈ����
	private InetAddress xGroup = null;
	
	private String host = "230.0.0.1"; 
	private int port = 7777; //��Ʈ�� 7777�� 
	private String userName = "�ֿ�";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagramSocket : UDP�� ����Ÿ�׷� ��Ŷ�� �����ϰų� ������
	//DatagramPacket : UDP�� �̿��Ͽ� ���۵� �� �ִ� ������.
	//MulticastSocket : �ټ��� Ŭ���̾�Ʈ�� �����ͱ׷��� �����Ѵ�. //��ε�ĳ��Ʈ�����̶�� ��.
	//D class�� ���� : 244.0.0.0 ~239.255.255.255 
	//UDP�� �ٰŸ� ��Ÿ� TCP/IP���� ������ �ӵ���
	//TCP/IP�� ���Ÿ� ��Ÿ� �����ϰ� �����͸� ����.

	public ChatCS() {
		
		ta.setEditable(false); //�����Ҷ� ta�� ��Ȱ��ȭ
		add(ta,BorderLayout.CENTER);
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				
				System.exit(0);
				
			}
		});
		
		setTitle("�׷�ä��[" + host + "]");
		setSize(400,400);
		setVisible(true);
		tf.requestFocus();
		//ȭ�� �����ΰ� �����ư Ȱ��ȭ, ȭ������ ȭ������� ����.
	}
	
	public void setup() {//ó�� �����Ҷ� ���� 
		
		try {
			//����Һ��� �ٵǴ°� ���
			xGroup = InetAddress.getByName(host); //x�׷쿡 �����ǰ� �� x�׷��� ���̳� ��巹��
			ms = new MulticastSocket(port);//��Ʈ��ȣ�� �������ִ�
			
			//Ư�� �׷쿡 ���� �� ȣ��Ʈ����Ʈ�� ��ġ���۾�.
			ms.joinGroup(xGroup); // ms�� x�׷��� ���� //�����ǿ� ��Ʈ��ȣ�� �ϳ��� ��ġ�� �ϳ��� �׷����� ��������� ���̰Եȴ�.
			
			Thread th = new Thread(this); //�� ��ü�� �������� ��
			th.start();  //ä�� ����
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public void disConnect() { //�������� ����� �ݴ��۾� 
		
		try {
			
			ms.leaveGroup(xGroup); //ms���� xGroup�� ���� / �ϰ� ms�� ����.
			ms.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		new ChatCS().setup(); //��Ʈcs�� �¾��� ����
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String str = tf.getText().trim();//����ڰ� �Է��� ���ڸ� �о�ͼ� �յ� ������ �����ϰ� ���̸�.
		if(str.equals(""))
			return;
							//3���� String�̿��� ���̷�Ʈ�� �־��� �� ����. ����Ʈ�� �迭�� ������⿡ .getBytes�� ����Ʈ�� ��ȯ
		byte[] buffer = (userName + "]" + str).getBytes();
		
		try {
			DatagramPacket dp = new DatagramPacket(buffer, buffer.length, xGroup, port);
					//���ۿ��ִ� ������ ���ۿ� �ִ� ũ�⸸ŭ x�׷쿡 
			
			ms.send(dp); //ms�� ������? 
			
			tf.setText(""); //ä�ú������� ��ä��â�� �������� �ʱ�ȭ
			tf.requestFocus();//���콺Ŀ���� ó���� ����.
			
		} catch (Exception e2) {
			System.out.println(e2.toString());
			
		}
		
		
	}

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				byte[] buffer = new byte[512]; //�ѹ� ������ 512����Ʈ�� �ްڴ�. ��� ��. ä�ú����� 512����Ʈ�� ���
				
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				//���ۿ� �ִ� ������ ������ ũ�⸸ŭ �޾Ƽ� dp�� ��´�
				
				ms.receive(dp); //������ send ������ receive
				
				String str = new String(dp.getData()).trim(); //����Ʈ�ι��� �����͸� ��Ʈ������ ��ȯ �յ� ��������. //
				
				ta.append(str + "\r\n");
				
				
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect(); // ������ ���� ������ ���´�.
		}

	}

}
