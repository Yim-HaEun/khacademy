package com.kh.obj.Exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	
		public void practice1() {
			Scanner sc = new Scanner(System.in);
			String name = "KH";
			int age = 25;
			String formatString = String.format("�̸�: %s, ����: %d",name,age);
			System.out.println(formatString);

		}
		public void practice2() {
			//��¥ ���� ���
			Date currentDate = new Date();
			SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String formatstr = String.format("���� ��¥ : %s", smDateFormat.format(currentDate));
			System.out.println(formatstr);
		}
		public void practice3() {
			int num1 =123;
			int num2 = 7;
			
			String s = String.format("����1: %d, ����2: %d ",num1,num2);
			System.out.println(s);
		
		}public void practice4() {
			String text1 = "hello";
			String text2 = "world";
			//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
			//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
			//���� ���ڿ��� 10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
			//'����ǥ�� �ѷ��׾ƾ���
			String formatStr = String.format("'%-10s'  '%10s'",text1, text2);
			System.out.println(formatStr);
					
		}
		
		public static void main(String[] args) {
			PracticeMain4 p =new PracticeMain4();
			p.practice1();
			p.practice2();
			p.practice3();
			p.practice4();
			
		
	}

}
