package com.kh.practice;
/*���� �������� 2�� �����C:\Users\\user1\Desktop\�̸�1\�̸�2
//���� �������� 3�� �����C:\Users\\user1\Java_Workspace\chap25_
���� �������� 5�� �����C:\Users\\user1\Desktop\myplace\Music\Korean\KPop\Group
*/
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		//pm.Practice2();
		//pm.Practice3();
	}
	public void Practice1() {
		
		String folderPath = "C:\\Users\\user1\\Desktop\\name1\\name2";
		
		File folder = new File(folderPath);
		boolean success = folder.mkdir();
		if(success) {
			System.out.println("���� ���� ����");
		}else {
			System.out.println("���� ���� ����");
	}
		
		
			
	
	public void Practice2() {
		String fPath = "C:\\Users\\\\user1\\Java_Workspace\\Chap25";
		File folder = new File(fPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		try {
			FileWriter writer = new FileWriter("C:\\Users\\user1\\Java_Workspace\\Chap25\\pr1\\pr2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Practice3() {
String folderPath = "C:\\Users\\user1\\Desktop\\myplace\\Music\\kop";
		
		File folder = new File(folderPath);
		
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\myplace\\Music\\kop\\group.txt");
			w.write("NCT");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}


