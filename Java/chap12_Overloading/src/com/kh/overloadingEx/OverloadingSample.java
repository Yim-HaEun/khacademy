package com.kh.overloadingEx;

public class OverloadingSample {


	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public double doubleSum(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		// �����ε� 5�� ����� �޼��� 5�� ���
		OverloadingSample obj = new OverloadingSample();
		
		System.out.println("�� ���� �� : "+obj.sum(10, 5));
		System.out.println("�� ���� �� : "+obj.sub(10, 5));
		System.out.println("�� ���� �� : "+obj.mul(10, 5));
		System.out.println("�� ���� ������ : "+obj.div(10, 5));
		System.out.println("�� �Ǽ��� �� : "+obj.doubleSum(10, 5));
		
		
		
		

	}

}
