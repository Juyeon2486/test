package com.day7;

public class Test7 {

	int a = 5; //instance����
	
	{//�ʱ�ȭ ��
		System.out.println("�ʱ�ȭ �� a: " + a);//5
		a = 10;
		System.out.println("�ʱ�ȭ �� a: " + a);
	}
	//�޼ҵ�� �޼ҵ� �ۿ� ������ ���� �ٸ� �ڵ��� �Ұ����ϴ�.
	
	static int b;
	static {//static ��
		b = 10;
		System.out.println("static �� b:" + b);
	}
	//����:���ϴ¼�
	//���:�׻� ���� ��
	final int C; //��� Ư¡:�빮�ڷ� ǥ��,����� ������ �ʱ�ȭ�� �������
	
	public Test7(){
		System.out.println("������...");
		C = 100;
		System.out.println("C:" + C);
	}
	public static void main(String[] args) {

		Test7 ob1 = new Test7();
		Test7 ob2 = new Test7();
	}

}
