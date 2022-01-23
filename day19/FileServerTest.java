package com.day19;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServerTest {
	
	class WorkThread extends Thread {
		
		private Socket sc = null;
		
		public WorkThread(Socket sc) {
			this.sc = sc;
		}
		
		@Override
		public void run() { //스레드를 상속 했으니 런 오버라이드
			
			try {
				
				ObjectInputStream ois = new ObjectInputStream(sc.getInputStream()); //sc가 넘어옴.
				
				System.out.println(sc.getInetAddress().getAddress()+"접속!");
				
				FileOutputStream fos = null;
				Object ob = null;
				//넘어오는 데이터 sc가 어느정도 크기인지 모르니깐 와일문으로 받는다 
				while((ob = ois.readObject())!=null) {
					
					if(ob instanceof FileInfo) { //넘어오는 데이터가 파일인포냐?
						
						FileInfo info = (FileInfo)ob; //오브젝트를 파일인포로 다운캐스팅.
						
						if(info.getCode()==100) { //파일 전송 시작
							
							String str = new String(info.getData()); //info의 데이터를 받아서 문자화해서 str에 넣어라
							
							fos = new FileOutputStream(str);//받아서 파일아웃풋스트림에 넣어서 fos에 넣어 파일 생성
							
							System.out.println(str + " 파일 전송 시작!");
							
						}else if (info.getCode()==110) { //파일 전송중.
							
							if(fos==null)
								break; //만약 fos가 널이면 while문을 빠져나가라.
							
							fos.write(info.getData(),0,info.getSize()); //info의 데이터 사이즈만큼 0부터 받는다.
							
							System.out.println(info.getSize() + "bytes 받는중!");//받는중임을 출력.
							
							
						}else if (info.getCode()==200) { //파일 전송 종료
							
							if(fos==null)
								break; //만약 fos가 널이면 while문을 빠져나가라.
							
							String str = new String(info.getData());//파일 받아오는거
							
							fos.close(); //fos종료
							
							System.out.println(str + "파일 전송 끝!");
							
							break; //파일전송 다끝났으면 while문 빠져 나가라.
						}
						
					}
					
					
				}//end..while // 괄호를 잃어버리지 않기위해 와일문이 끝났다는 주석을 달아준다.
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}

	public void serverStart() {
		
		try {
			ServerSocket ss = new ServerSocket(7777); //서버열기
			System.out.println("클라이언트 접속 대기중!");
			
			Socket sc = ss.accept(); //클라이언트 연결
			
			WorkThread wt = new WorkThread(sc);//sc를 wt에
			wt.start(); //
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		
		new FileServerTest().serverStart(); //파일서버테스트의 파일서버를 객체생성.
	}

}
