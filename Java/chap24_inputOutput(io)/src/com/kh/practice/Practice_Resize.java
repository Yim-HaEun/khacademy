package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Practice_Resize {

	public static void main(String[] args) {
		//�̹����ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� ����� mkdir
		//���� ���������� �̹��� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�
		String path = "C:\\Users\\user1\\Desktop\\cute1";
		String inputImg = path + "cutecute.png";
		String outputImg = path + "reSizecute.png";
		
		
		File folder = new File(path);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ �̹� �����մϴ�.");
		}
		folder.mkdir();
		
		//���������� �̹��� ũ�� ����
		int width = 200; //���α���
		int height =150; //���α���
		
		try {
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			
			BufferedImage bufResizeImg = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
			bufResizeImg.getGraphics().drawImage(resizeImg,0,0,null);
			
			ImageIO.write(bufResizeImg, "png" , new File(outputImg));
			System.out.println("�̹��� �������� �Ϸ�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�̹��� �������� ����"+ e.getMessage());
			e.printStackTrace();
		}
				

	}

}
