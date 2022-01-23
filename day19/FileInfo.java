package com.day19;

import java.io.Serializable;

public class FileInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	//code
	//100: ���� ���� ���� (���ϸ� ����)
	//110: ���� ���� ����.
	//200: ���� ���� ����.(���ϸ� ����)
	//Size: ���� ũ��.
	//data: ���� ������.
	
	private int code;
	private int size;
	private byte[] data = new byte[1024]; //1024�� �迭�� ���� �����ʹ� 1����Ʈ�� ���۵Ǳ⶧�� �����ɸ���.
	//�ҽ��� ���ͼ���.
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
