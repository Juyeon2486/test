package com.day14;

import java.util.Scanner;

//����ó��
//Exception

public class Test2 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try { //try ~ catch��
			System.out.print("�ΰ��� ��?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("������?");
			oper = sc.next();

			result = 0; // ����Ʈ���� 0���� �ʱ�ȭ

			if (oper.equals("+")) {
				result = num1 + num2;
			} else if (oper.equals("-")) {
				result = num1 - num2;
			} else if (oper.equals("*")) {
				result = num1 * num2;
			} else if (oper.equals("/")) {
				result = num1 / num2;
			}

			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);

		/*} catch (Exception e) {//������ catch�� Exception�� ������ ����(s)�� ó���Ѵ�
			System.out.println("�� �װ� ���ڷ� ���̳�~~?");
			System.out.println(e.toString());//Exception e �� ������ش�.
			e.printStackTrace();*/ //Exception�� ���� ���� ���� �Ʒ��͵� �� ����ó���� �ϱ⶧���� ������ ����.

		} catch (NumberFormatException e) {
			System.out.println("������ �Է��ض�");
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");

			//���� ó���� ����
		} catch (Exception e) {//������ catch�� Exception�� ������ ����(s)�� ó���Ѵ�
			System.out.println("�� �װ� ���ڷ� ���̳�~~?");
			System.out.println(e.toString());//Exception e �� String���� ������ش�.
			e.printStackTrace();
		}finally {//������ �����ϱ⶧���� ������ ������ �����.
			System.out.println("�������� ����ȴ�.");
		}

		System.out.println("catch�� ��....");
	}
}
