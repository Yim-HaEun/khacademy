package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String name = sc.next();
		System.out.println("나이 입력하세요 :");
		int age = sc.nextInt();
		System.out.println("성별을 입력하세요 (남/여):");
		String gender = sc.next();
		System.out.println("키를 입력하세요 :");
		double height = sc.nextDouble();
		
	
		System.out.println("키 "+ height +"cm인 "+ age +" 살 "+ gender + "자 "+ name+ "님 반갑습니다^^"); 
		
	}

}
