package com.day18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//����ȭ ǥ����
//java.util.regex �� �ִ�.

/*
c[a-z]*: c�� �����ϴ� ���ܾ�(c,ca,can) c�� �����ϴ� �������� �ܾ�
c[a-z]: c�� �����ϴ� ���ܾ�(c,ca,cz) *�̾����� c�� �����ϴ� 2���� �ܾ�
c[a-zA-Z0-9] : ca,cA,c4 ���������� �α����� �ܾ ����.
c. : c�� �����ϴ� �α���(ca,cB,c&)
c.* : c�� �����ϴ� ��� ����.
[b|c].* �Ǵ� [bc].* �Ǵ� [b-c].* : b,c,bbb //b�� c ������ ��� ����.

[\\d]+ �Ǵ� [0-9]+  : �ϳ� �̻��� ����.  //0���� 9������ ���� �����ϸ鼭 + �������� ����
 */
public class Test3 {

	public static void main(String[] args) {

		String[] str = {"a","apple","banana","orange","car","count","b","music","movie","case"} ;
		
		Pattern p;
		
		p = Pattern.compile("c[a-z]*");
			for(String s : str) {
				Matcher m = p.matcher(s); //s���ִ°��� ��ġ�ؼ� Ȯ���ϰ�
				if(m.matches()) {//���� ��ġ�ѰͰ� ������ ���
					System.out.println(s); 
				}
			}
		
			System.out.println("-------------");
			
			p = Pattern.compile("c."); // c. ���ڸ� //��� ������ ���� �����ؼ� ������ �̾Ƴ��Բ� �����.
			for(String s : str) {
				Matcher m = p.matcher(s); //s���ִ°��� ��ġ�ؼ� Ȯ���ϰ�
				if(m.matches()) {//���� ��ġ�ѰͰ� ������ ���
					System.out.println(s); 
				}

			}
			
			System.out.println("-------------");
			//@�ڴ� ������.
			String[] mails = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@aaa"};
			
			// [\\w]+ : �ѱ��� �̻��� �� , ����
			// @ �� ���⿡
			// (\\.[\\w]+) : ��ȣ�ȿ� �ִ� ���� �ݵ�� �ѹ��� ǥ�� �Ǿ����.
			// \\. : \\.�� ���״�� ��Ʈ .abc �̷� ������ �ݵ�� �ѹ��� �;��Ѵٴ� ��.
			
			String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";//�̸����� üũ�ϴ� ����  //it �迭���� ���������� ���Ǵ� �������� 
			//�����ڼ��ڿ����� + @��� ������ ���ڿ����� + .��� ������ ������
			
			for(String s : mails) {
				
				if(Pattern.matches(pat, s)) { //pat�� ���Ͽ� �����ͼ� ��Ʈ�������ؼ� ��ġ�ϸ� s�� ����϶�
					System.out.println(s);//�̸��� ������ �´��� üũ�Ѵ�.
				}
			}
	}
}
