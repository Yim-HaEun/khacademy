package com.kh.variable;

public class Variable {
	public static void main(String[] args) {
		// 1.������ �̸��� �����ڿ� ���� ������ھ� �޷��� ������ �� �ִ�.
		// 2.������ �̸��� ���ڷ� ������ �� ����.
		// 3.���� �̸� ���̿��� ������ ������ �� ����. ����� ��Ģ���� ����� ���� ���� �����Ҷ� ���⿡ ������� �ʴ´�.
		// 4.�ڹٿ��� �̸� ������ ���� ���� �̸����� ������� ���Ѵ�.
		
		//�Ǽ���(�Ҽ����� �ִ� ����: float, double)
			float pie1 = 3.1413332213f;//float�� f�� �빮�� F�� �ۼ����ش�.
			double pie2 = 3.1413332213;
			System.out.print("float: ");
			System.out.println(pie1);
			System.out.print("double: ");
			System.out.println(pie2);
					
			//byte : -128 ~127���� ��밡��
			//byte bt = -129; int�� �����ϰų� byte+byte�� ǥ���ؾ��Ѵ�.
			byte bt = 127;
			System.out.println(bt);
			//-129�� 128 �̻���� ����� ���� �ʴ� ��
			
			//short = -32,768~ 32,767���� ��밡��
			//short shrt = -32769; -32769�� 32768 ���� ��µ��� ����
			short shrt = -32767;
			System.out.println(shrt);
			
			//int -2,147,483,648 ~ 2147,483,647���� ��� ����
			int nt = -2147483648;
			System.out.println(nt);
			
			//long -9,223,372,036,854,775,808 ~
			long lng = 20000L;//�ڿ�L,l�� �ٿ��ش�.
			
			
			
			//char : ������, ���ڸ� �ѱ��ڸ� ������ �� ���� ''�� ����� �� ����
			char chr1 = 'a';
			System.out.println(chr1);
			
			
			//String�� �⺻���� �ڷ����� ������ ������ �⺻������ ����
			//�⺻���� �ڷ����� ���� �ʱ⶧���� String���� ǥ���� 
			//String�� ""�� ''�ȿ� ���ڸ� �ۼ�
			String name = "�ȳ��ϼ���";
			
			//����
			//boolean�� true�� false�� ǥ���Ѵ�.
			//����� boolean bln = true; false;
			boolean bln = true;
			System.out.println(bln);
			boolean bln2 = false;
			System.out.println(bln2);
			
			
			System.out.println("�ȳ��ϼ���, ���� ȫ�浿�Դϴ�.");
			String name1 = "ȫ�浿";
			System.out.println("�ȳ��ϼ��� ����" + name1 +"�Դϴ�.");
			//�ѹ� Ÿ���� ������ ������ �缱���� �����ʰ� �״�� ����ص� ��
			//�ѹ� ������ Ÿ���� �ٸ� Ÿ������ �缱�� �� �� ����.
			//������ Ÿ���� �ٸ� Ÿ������ �����ؼ� ������ �� ����.
			name1 = "���븸";
			System.out.println("�ȳ��ϼ��� ����"+ name1 +"�Դϴ�.");
			
			int age = 19;
			String basketball = "��";
			System.out.println("�ȳ��ϼ��� ����" + name1 + "�Դϴ�.");
			System.out.println("���� ���̴�" + age + "�� �̰�,");
			System.out.println("���� ��̴�" + basketball+"�Դϴ�.");
			
			char score = 'a';
			System.out.println("���� ������ "+ score + "�Դϴ�.");
			
	}
}
