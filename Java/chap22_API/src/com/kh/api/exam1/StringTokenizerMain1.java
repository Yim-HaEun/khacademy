package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain1 {

	public static void main(String[] args) {
		stm.st

	}
	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text);
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
	public void stExam3() {
		//-�����ڸ� ����ؼ� text����� �����ڷ� ��� ����ϱ�
		String text3 = "010-9472-3499";
		StringTokenizer tokenizer3 = new StringTokenizer(text3);
		while(tokenizer3.hasMoreTokens()) {
			String phoneNumb = tokenizer3.nextToken();
			System.out.println(phoneNumb);
		}
	
	}
}
