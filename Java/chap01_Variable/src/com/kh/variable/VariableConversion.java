package com.kh.variable;

public class VariableConversion {
	
	public static void main(String[]args) {
		//1.�ڵ�����ȯ(�Ͻ�������ȯ,����������ȯ)
		int intNum = 100; //���� 100�� �ǹ�
		long longNum = intNum; //int�� long���� �ڵ�����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;//float�� double�� �ڵ�����ȯ
		
		
		
		//int ->long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		int intNum1 = 200;
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum3 = 300;
		long longNum3 = intNum3;
		System.out.println(longNum3);
		
		//short -> int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		short shortNum = 5;
		int intNum2 = shortNum;
		System.out.println(intNum2);
		
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		float floatNum1 = 3.14f;
		double doubleNum1 = floatNum1;
		System.out.println(floatNum1);
		
		//2. ����� ����ȯ(���� ����ȯ)
		//long ->int
		long largeLong = 123456789012345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long�� int�� ��������ȯ �� ��� ���� ���� �ȿ� ���� ������ �Ϻε����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� ���� ���� �κи� �����ȴ�.
		
		//���ڿ� ���ڰ��� ����ȯ 2����� ���ڴ� char charValue = 'Z'; ->int�� ����
		char charValue = 'Z';
		int intValue = (int) charValue;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		int intValue1 = charValue1;
		System.out.println(intValue1);
		
		//double -> int�� ����ȯ
		double largedouble2 = 3.14;
		int intNum4 = (int) largedouble2;
		System.out.println(intNum4);
		
		//int�� short�� ����ȯ
		
		int intNum5 = -1;
		short shortNum5 = (short) intNum5;
		System.out.println(shortNum5);
	}
}
