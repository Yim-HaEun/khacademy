package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 { //실습문제 1번

	public static void main(String[] args) {
		//사용자로부터 한 개의 값을 입력받아 1 부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단 입력한 수는 1보다 크거나 같아야합니다.
		//만일 1 미만의 숫자가 입력됐다면 "1이상의 숫자를 입력해주세요"를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		}else {
			for(int i = 1; i <= num; i++) {
				System.out.println(i);
				
			}
		}
		

	}

}
