package com.day19;

import java.io.Serializable;

public class FileInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	//code
	//100: 파일 전송 시작 (파일명 전송)
	//110: 파일 내용 전송.
	//200: 파일 전송 종료.(파일명 전송)
	//Size: 파일 크기.
	//data: 전송 데이터.
	
	private int code;
	private int size;
	private byte[] data = new byte[1024]; //1024의 배열을 만들어도 데이터는 1바이트씩 전송되기때메 오래걸린다.
	//소스의 겟터셋터.
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	
}
