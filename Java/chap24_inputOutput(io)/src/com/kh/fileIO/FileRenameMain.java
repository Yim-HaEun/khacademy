package com.kh.fileIO;

import java.io.File;

public class FileRenameMain {

	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "cute.png";
		String newFile = "C:\\Users\\user1\\Desktop\\cutecute.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//���� �̸� �����ϱ�
		//���� ������ �ִٸ�
		if(currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ����!");
		}else {
			System.out.println("���� �̸� ���� ���� ��");
		}

	}

}