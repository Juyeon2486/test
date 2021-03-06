package com.day14;

import java.util.Scanner;

//예외처리
//Exception

public class Test2 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try { //try ~ catch문
			System.out.print("두개의 수?");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("연산자?");
			oper = sc.next();

			result = 0; // 리절트값을 0으로 초기화

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

		/*} catch (Exception e) {//에러를 catch가 Exception에 보내어 변수(s)에 처리한다
			System.out.println("넌 그게 숫자로 보이냐~~?");
			System.out.println(e.toString());//Exception e 를 출력해준다.
			e.printStackTrace();*/ //Exception을 제일 위에 쓰면 아래것도 다 예외처리를 하기때문에 에러가 난다.

		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해라");
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");

			//예외 처리의 사장
		} catch (Exception e) {//에러를 catch가 Exception에 보내어 변수(s)에 처리한다
			System.out.println("넌 그게 숫자로 보이냐~~?");
			System.out.println(e.toString());//Exception e 를 String으로 출력해준다.
			e.printStackTrace();
		}finally {//무조건 실행하기때문에 에러가 나더라도 실행됨.
			System.out.println("언제든지 실행된다.");
		}

		System.out.println("catch문 밖....");
	}
}
