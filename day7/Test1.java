package com.day7;

//this : Ŭ���� �̸�(ME) Cricle.r = this.r ������ 
//Ŭ�������� Ŭ�����ȿ� �ߺ���Ű�� �ʱ� ���� Cricle.r�� �ƴ� this.r�� ǥ���Ѵ�.


class Circle{
	
	private int r; // ������ ����ȭ(ĸ��ȭ)
	//�Ϲ������� ���� ������ set�� ���̾��� �����ö� get�� ���� ����.
	public void setData(int r) { //setData(int r,Circle This
		//private �� ���̷�Ʈ�� ���ٸ��ϹǷ� ��ȸ���θ� ������ش�.
		this.r = r;
	}
	
	public double area() {
		return this.r*this.r*3.14;
	}
	
	public void print(double area) {//result(double area, Cricle this)
		System.out.println("������:" + this.r);
		System.out.println("����: " + area);
		
		
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		ob.setData(10);//�ΰ��� 10�� �������� �ڹٴ� �ּ�(����������)�� �������ִ� ob.setData(10,ob);
		double result = ob.area();//ob.area(ob)
		ob.print(result);//print(result,ob)
		
		ob.setData(100);
		result = ob.area();
		ob.print(result);
		
		
	}

}
