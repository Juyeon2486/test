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
	// �÷��� ����Ʈ�� ����. �׾ȿ� ���ϸ� �� �� �ִ�.

	public void serverStart() {

		try {

			ServerSocket ss = new ServerSocket(7777);
			System.out.println("���� ����.");

			while (true) {

				Socket sc = ss.accept(); // Ŭ���̾�Ʈ ���ӱ��� ����Ѵ�.

				WorkThread wt = new WorkThread(sc); // ��ũ������� �����尡 �ʼ��̴�.
				wt.start();

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	class WorkThread extends Thread {

		private Socket sc; // ��ũ�����忣 �ݵ�� �ʿ��ϴϱ� �ʼ����� �ְ� ��ü�����ϰ� �ʱ�ȭ.

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

				// ������ ������ Ŭ���̾�Ʈ�� �־�д�
				clients.add(sc); // a�������ϸ� ������ a���ǰ� c�������ϸ� ������ c���ȴ�.

				// �ٸ� Ŭ���̾�Ʈ���� ���ӻ���� �˸���. (���� ������)
				msg = ip + "]�� �����߽��ϴ�.";

				for (Socket s : clients) {

					if (s == sc)
						continue;// ��Ƽ��: s�� ������ sc(��)�� �н� ���� ������ ���������� ���.
					// OutputStream os =s.getOutputStream();�� ���ļ� �Ʒ��� ���� true�� flush�� ����.
					PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
					pw.println(msg); //�Ÿ���
				}

				System.out.println(msg); // ������ ����.

				while ((msg = br.readLine()) != null) {//��¥ ����

					for (Socket s : clients) {
						if (s == sc)
							continue;//�̹� �ѹ��� ����. ��ġ��.
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg);//������ ���

				}

			} catch (Exception e) {
				msg = ip + "]�� �����߽��ϴ�."; 

				try {

					for (Socket s : clients) {
						if (s == sc)
							continue;
						PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
						pw.println(msg);
					}
					System.out.println(msg); //�������� ���̱� ����.
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
