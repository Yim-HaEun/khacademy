package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();

	}
	public void practice1() {//��μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\Filename.txt");
			w.write("�����Դϴ�.");//���� ����
			w.close();//���� �ݱ�
			
			//��⼭ ������ ��ΰ� Ȯ���� ��� = ������
			FileReader reader = new FileReader("C:\\Users\\user1\\Desktop\\Filename.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void practice2() {
		//������ ����� ���� �ȿ� ���� �����
		//���� �ȿ� ���� �ۼ��ϱ�
		String folderPath = "C:\\Users\\user1\\Desktop\\newFolder";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		
		try {
			FileWriter f = new FileWriter("C:\\Users\\user1\\Desktop\\newFolder\\info.txt");
			f.write("�����Դϴ�.");
			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
