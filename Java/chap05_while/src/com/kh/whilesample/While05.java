package com.kh.whilesample;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int sum = 0; //sum�� 0�� ����
		int num = scan.nextInt(); //���� � ���� �������� ��
		System.out.println("5������ ������ �Է����ּ���.");
		while(sum <= 10) {
			sum += num;
			num = num +1;
			System.out.println("num: "+ num);
			System.out.println("sum:"+ sum);
		}
	}

}
