package com.day18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<>();
	// 컬렉션 리스트를 만듬. 그안엔 소켓만 들어갈 수 있다.

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 시작.");

			while (true) {

				Socket sc = ss.accept(); // 클라이언트 접속까지 대기한다.

				WorkThread wt = new WorkThread(sc); // 워크스레드는 스레드가 필수이다.
				wt.start();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	class WorkThread extends Thread {

		private Socket sc; // 워크스레드엔 반드시 필요하니깐 필수값을 넣고 객체생성하고 초기화.

		public WorkThread(Socket sc) {
			this.sc = sc;

		}

		@Override
		public void run() {

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));

				ip = sc.getInetAddress().getHostAddress();

				// 접속한 소켓을 클라이언트에 넣어둔다
				clients.add(sc); // a가접속하면 소켓은 a가되고 c가접속하면 소켓은 c가된다.

				// 다른 클라이언트에게 접속사실을 알린다. (나를 제외한)
				msg = ip + "]가 입장했습니다.";

				for (Socket s : clients) {

					if (s == sc)
						continue;// 컨티뉴: s가 현재의 sc(나)면 패스 나를 제외한 나머지에게 출력.
					// OutputStream os =s.getOutputStream();를 합쳐서 아래에 써줌 true는 flush와 같다.
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg); //거름망
				}

				System.out.println(msg); // 서버에 보임.

				while ((msg = br.readLine()) != null) {//진짜 수다

					for (Socket s : clients) {
						if (s == sc)
							continue;//이번 한번만 생략. 겹치면.
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);//서버에 띄움

				}

			} catch (Exception e) {
				msg = ip + "]가 퇴장했습니다."; 

				try {

					for (Socket s : clients) {
						if (s == sc)
							continue;
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg); //서버에서 보이기 위해.
					sc = null;

				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) {
		new ServerTest2().serverStart();
	}

}
