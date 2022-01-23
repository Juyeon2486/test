package com.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClientText {

	public static void main(String[] args) {

		int port = 7777;
		String host = "127.0.0.1"; //자기 자신걸 먼저테스트해보고 다른사람 ip를 써주면 됌.
		Socket sc = null; //소켓을 널값으로 초기화
		
		ObjectOutputStream oos = null; //서버는 파일을 보내야하니 ObjertInputStream ois 
									   //클라이언트는 파일을 받아야하니 ObjertOutputStream oos
		
		Scanner scn = new Scanner(System.in);
		
		String filePath;
		
		try {
			
			System.out.print("전송할 파일경로 및 파일명?"); //e:\\doc\\a.txt
			filePath = scn.next(); //사용자한테 받은 경로와 파일명을 파일패스에
			
			File f = new File(filePath); //받은 파일패스를 파일에
			
			if(!f.exists()) { //만약 f에 파일이 없냐?라는뜻
				System.out.println("파일이 없습니다.");
				System.exit(0);//파일이 없으므로 실행하면 안됌
			}
			
			sc = new Socket(host, port); //억셉트 하기전까지 데이터 홀딩 (서버연결)
			 
			oos = new ObjectOutputStream(sc.getOutputStream()); // sc의 값을 아웃풋스트림을 받아서 oos에 준다
			oos.flush();
			
			FileInfo info; //파일 인포에 데이터를 받기위해 준비
			//메모리상에서 이루어짐.
			info = new FileInfo(); //파일이 몇개인지 모르니 보낼때마다 하나씩
			info.setCode(100); // 파일 전송 시작(파일이름)
			info.setData(f.getName().getBytes()); //f = 파일에 받은 이름을 바이트로 읽어온다
			info.setSize((int)f.length()); //int로 형변환 String으로 받아왔기에
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일전송 시작.");
			
			Thread.sleep(30); // 메모리상에서 이루어지는게 빠름으로 0.03초씩 쉬어라.
			
			//파일내용전송
			FileInputStream fis = new FileInputStream(f);
			
			int data = 0;
			byte[] buffer = new byte[1024]; //파일인포에서 1024로 만들었으니 1024로 만듬
			
			while((data=fis.read(buffer,0,1024))!=-1) { //아래의 생성한 데이터가 올라옴 와일문이 반복되면서 버퍼가 필요
				
				info = new FileInfo(); //클래스를 만들고 아래의 데이터를 넣음
				
				info.setCode(110);//파일을 보내는중이라는 신호
				info.setSize(data); //인포에 크기는 데이터의 양만큼
				info.setData(buffer);//인포의 데이터는 버퍼의 크기만큼
				
				oos.writeObject(info); //출력을함.
				System.out.println(data + "bytes 전송중..."); 
				
				buffer = new byte[1024]; //버퍼가 와일문 밖을 못가기때문에 배열만큼 객체생성
				
				Thread.sleep(300); //0.3초만큼 쉬어라
			}//end while
			
			fis.close();
			
			//파일 전송 종료
			
			info = new FileInfo(); //파일이 몇개인지 모르니 보낼때마다 하나씩
			info.setCode(200); // 파일 전송 종료(파일이름)
			info.setData(f.getName().getBytes()); //f = 파일에 받은 이름을 바이트로 읽어온다
			info.setSize((int)f.length()); //int로 형변환 String으로 받아왔기에
			
			oos.writeObject(info);
			System.out.println(f.getName() + "파일전송 끝.");
			
			Thread.sleep(30);
			
			oos.close(); //파일전송 종료
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
