package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// �Ǽ���(�Ҽ���)���� ����,����,���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
				//�� �� ������ ����� ���������� ó���ϼ���.
				Scanner sc = new Scanner(System.in);
				double korean, english, math;
				
				System.out.print("�������� : ");
				korean = sc.nextDouble();
				

				System.out.print("��������  : ");
				english = sc.nextDouble();
				
				System.out.print("�������� : ");
				math = sc.nextDouble();
			
				System.out.println("");
				int avg = (int) (korean+english+math);
				int totalScore = (int)(korean+english+math)/3;
				System.out.println("���� : " +avg);
				System.out.println("���  : " + totalScore);

	}

}
