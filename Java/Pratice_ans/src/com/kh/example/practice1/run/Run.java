package com.kh.example.practice1.run;

import com.kh.example.practice1.Member;

public class Run {
	/*����� �޼ҵ�� �⺻ �����ڸ� ���� Member type��
	��ü�� �����ϰ� changeName()�� �̿��� �� ���� ��
	printName()�� �̿��� ���*/ 
	public static void main(String[] args) {
		//1.Member��ü ����
		Member member = new Member("");
		//2.changeName()�� ���� 
		member.changeName("������");
		//3.printName()�� �̿��� ���
		member.printName();
		

	}

}
