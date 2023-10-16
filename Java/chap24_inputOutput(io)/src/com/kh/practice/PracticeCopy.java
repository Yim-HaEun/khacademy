package com.kh.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeCopy {

	public static void main(String[] args) {
		PracticeCopy c = new PracticeCopy();
		c.practice1();
		//c.practice2();
	}
	public void practice1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.jpg";
		try(FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("���� ���� �Ϸ�");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		
		newFolder.mkdir();
		
		String outputFile = inputFile + "\\"+"cute1.png";

		// �̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
		//����ȭ�鿡�ٰ� ������ ����
		//���� �ȿ� ������ �̹��� �����ϱ�!
	}

}
