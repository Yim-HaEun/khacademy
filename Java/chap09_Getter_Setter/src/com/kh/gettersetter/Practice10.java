package com.kh.gettersetter;

public class Practice10 {

	public static void main(String[] args) {
		// �ֹι�ȣ ���� ���� *�� ���
		
		//1.�ֹι�ȣ �����
		String jumin = "123456-1234567"; //14�ڸ�
		
		//2.�����ڸ� ���� ��ǥ ����°� �����
		String makeStar = "*";
		//�ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ���
		//to char Array�� ����ؼ� String > char Array�� ����
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4','5','6','7'}
		for(int i = 8; i<juminStar.length; i++ ){//�ֹι�ȣ 9�ڸ����� ���ڸ����� *ǥ ó���ϱ�
			juminStar[i] = '*';
			//juminStar 9�ڸ��� �����ϸ� *�� �ٲ���.
			
		}System.out.println(juminStar);
			
		
	}

}
