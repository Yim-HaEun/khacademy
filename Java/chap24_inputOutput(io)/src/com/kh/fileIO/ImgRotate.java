package com.kh.fileIO;


import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImgRotate {
	String path = "C:\\Users\\user1\\Desktop";
	String inputImg = path + "cutecute.png";
	String outputImg = path + "reSizecute.png";
	
	//�̹����� �ε�
	BufferedImage originImg = ImageIO.read(new File(inputImg));
	
	//�̹����� 90�� �ð� ���� ȸ��
	BufferedImage rotateImg = rotateImage(originImg,90);
	
	//ȸ���� �̹��� ����
	ImageIO.write(rotateImg, "jpg", new File(outputImg));

	//�̹����� �־��� ������ ȸ���ϴ� �޼���
	
public static BufferedImage rotateImage(BufferedImage originImg, double ) {
		double radians = Math.toRadians(degrees);
		double sin = Math.abs(Math.sin(radians));
		double cos = Math.abs(Math.cos(radians));
		
		int width = originImg.getWidth();
		int height = originImg.getHeight();
		
		// ���ο� �̹��� ���� ������ �� ũ��
		int newWidth = (int) Math.floorDiv(width*cos+ height*sin);
		int newHeight = (int) Math.floorDiv(height*cos+ Width*sin);
		
		BufferedImage rotateImg = new BufferedImage(newWidth,newHeight,originImg.getType());
		Graphic2D g2d = rotateImg.createGraphics();
		g2d.translate((newWidth -width)/2, (newHeight -height)/2);
		g2d.rotate(radians,width/2,height/2);
		g2d.drawRenderableImage(originImg,null);
		g2d.dispose();
		
		return rotateImg;
	
	}
}
