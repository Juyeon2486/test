package com.day16;

import java.io.File;
import java.io.FileFilter;

class MyFileList implements FileFilter	{

	private File f; //파일 탐색기 파일의 구조를 볼 수 있다.
	
	public MyFileList(String filePath) { //생성자를 오버로딩하여 사용
		f = new File(filePath);
	}
	
	public void result(){
		try {
			
			if(!f.exists()){
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("절대경로: " + f.getAbsolutePath());
			System.out.println("파일크기: " + f.length());
													   //user.dir은 문법임. 내맘대로바꾸면 안됌.
			String p = System.getProperty("user.dir"); //외우기 문법. //시스템을 가져오는데 사용자의 디렉토리를 보여달라.
			System.out.println("현재 프로젝트 경로: " + p);
			
			
			if(f.isDirectory()) {//디렉토리가 있으면 읽어라 //폴더가 있으면 읽으라는뜻
				
				//파일,폴더 구조
				File[] lists = f.listFiles(this); //this는 아래 억셉트 내가 지정해준 경로에 파일들을 파일이라는 배열에 넣어준다.
				
				System.out.println("폴더의 내용...");
				for(int i=0;i<lists.length;i++) {
					System.out.print(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			System.out.println("각 파티션 이름...");//하드 디스크의 각 파티션
			File[] root = File.listRoots();
			for(int i=0;i<root.length;i++) {
				System.out.println(root[i].getPath());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public boolean accept(File pathname) {//데이터를 가져와 억셉트에 넣어준다.
		
		return pathname.isFile()||pathname.isDirectory(); //거의 정해져있음.
	}
	
}


public class Test14 {

	public static void main(String[] args) {

		MyFileList m = new MyFileList("e:\\doc");//원하는 경로를 넣으면 숨김폴더까지 다 보여준다.
		m.result();
		
	}

}
