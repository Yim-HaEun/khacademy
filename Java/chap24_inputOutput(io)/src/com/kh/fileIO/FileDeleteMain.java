package com.kh.fileIO;

import java.io.File;

public class FileDeleteMain {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\DeskTop\\";
		String originFile = mainPath + "RealCute.jpg";
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		
		//���� ����
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �����ϴµ� �����߽��ϴ�.");
		}

	}

}
