package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain exp = new PracticeMain();
		exp.ArithException();
		exp.NPException();
		//exp.NumFormatException();
		
	}

	public void ArithException() {
		//int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		try {
			int r = dividend/divisor;
		
		}catch(ArithmeticException a){
			System.out.println("divisor�� 0�Դϴ�."+ a.getMessage());
			
		}
		
	}
	public void NPException() {
		String text = "Hello world";
		String subText = null;

		try {
			//indexOf subtext�� �ִ� null���� ������ ���ڿ� �˻�
			int length = text.indexOf(subText);
		}catch(NullPointerException n){
			System.out.println("���� �����ϴ�." + n.getMessage());
			
		}
	}
	public void NumFormatException(){
		try {
			String text = "123.45";
			int number = Integer.parseInt(text);
			System.out.println(number);
		}catch(NumberFormatException nfe) {
			System.out.println("����"+ nfe.getMessage());
		}

	}
}
