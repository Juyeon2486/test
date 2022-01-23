package com.day15;

import java.util.Random;
import java.util.Scanner;

class MyThread extends Thread{
		
	int cnt = 0;
	String str;
	
	public void run(){
		
		while(true){
						
			System.out.print(".");
						
			try {
				sleep(300);
				
				if(cnt==20)
					break;	
				
				cnt++;				
				
			} catch (Exception e) {
				System.out.println(e.toString());
			}		
			
		}
	}
	
}

public class SelMem{

	//명단만 수정
	private static String[] name = 
		{"전상원","박  범","김찬주","진현주","남승은",
		"박가윤","서동혁","양세리","김창훈","이주현",
		"왕혜민","이종원","장하은","김성제","채현우",
		"이윤재","전성덕","이나영","배승환","이한솔"};
	
	private final static int saram = name.length;//학생 총인원수
		
	public static void main(String[] args) {		
				
		Thread ob = new MyThread();
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num;
		int inwon,i,n;	 		
				
		do{
			System.out.print("발표자 인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>saram);
		
		num = new int[inwon];		
		
		n=0;
		while(n<inwon){
			
			num[n] = rd.nextInt(saram)+1;
			
			for(i=0;i<n;i++){
				
				if(num[i]==num[n]){
					n--;
					break;
				}				
			}			
			
			n++;
		}
				
		
		System.out.print("고민중");
		
				
		ob.start();		
		
		
		try {
			ob.join();
									
		} catch (Exception e) {
			// TODO: handle exception
		}
		
				
		//출력		
		System.out.println();
		System.out.println();	
		System.out.println("축하합니다!!,발표자 입니다");
		System.out.println();
		
		int cnt=1;
		for(int su : num){
			
			System.out.printf(cnt + "번 발표자 : %5s\n",name[su-1]);
					
			cnt++;
		}
		
		System.out.println();			
				
	}

}



