package com.kh.fileIO;

import java.io.FileInputStream;
import java.io.FileWriter;

public class InPutStreamMain {
/*
 FileInputStream 
 	������ ���� �� ���Ǵ� Ŭ����
 	���Ϸκ��� �����͸� ����Ʈ ��Ʈ������ �о���� �� �����ϰ� ���
 	int read() : ���Ͽ��� ���� �����͸� �а� ��ȯ
 				 �� �̻� ���� �����Ͱ� ������ -1�� ��ȯ
 	int read(byte[] b): ���Ͽ��� ����Ʈ �迭  'b'�� �����͸� �а� ������ ���� ����Ʈ ���� ��ȯ
 	
 	int read(byre[] b, int off, int len) : 
 				���Ͽ��� ����Ʈ �迭 'b'�� �������� ��ġ���� �ִ� len ����Ʈ ��ŭ �о ������ ���� ����Ʈ ���� ��ȯ
  	void close() : ���� �ݱ�
 	
 * */
	public static void main(String[] args) {
		FileInputStream fis = null;
		//��δ� ���� �ۼ��ϰ� �ִ� ��Ŭ���� ���� �̸� ����
		
		try {
			String fileName = "exam.txt";
			FileWriter w = new FileWriter(fileName);
			fis = new FileInputStream(fileName);
			
			int data; //���Ͽ��� �����͸� �о�鿩�� ���
			System.out.println("���� ����� ��ü���� ����");
			try{
				data = fis.read();
				System.out.println("");
			}catch(){
				
			}
		}catch(FileNotFoundException e) {
			
		}
		
		
		
		
	}

}
