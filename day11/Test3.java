package com.day11;

//Interface 
//�߻�Ŭ������ �������� �����ϰ� ����(����)������.
//������ final ������ ���𰡴��ϴ�.
//�������̽��� ���� �ϱ� ���ؼ��� implements�� ����Ѵ�.
//�������̽��� ���,���������� �������̽��� ��� �޼ҵ带 ������(Override) �ؾ� �Ѵ�.
//������ ���������� ������ ������ ������ ����.
//�������̽��� �ٸ� �������̽��� ��ӹ��� �� �ִ�. �׶��� extends�� ����Ѵ�.
//Ŭ������ ���� ��� ������ �������̽��� ���� ����(implements)�� �����ϴ�.

interface Fruit{
	
	String Won = "��"; //public static final�� �����Ǿ��ִ� ������ �ۺ�. ������ ����ϱ⶧���� �����̺����� ���������
	
	int getPrice();//public abstract ����.
	
	public String getName();
	
	//public void print(); �Ϲݸ޼ҵ�� ���� �� ����.
}

class Fruitimpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	//�������̵�� ����ų�
	public String getItems() {
		return "����";
	}
	//��ü������ �����
}

public class Test3 {

	public static void main(String[] args) {

		Fruitimpl ob1 = new Fruitimpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1;//upcast
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems); //�θ� �پ������� ���⿡ ����Ҽ�����.
		
	}

}
