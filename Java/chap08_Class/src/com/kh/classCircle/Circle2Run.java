package com.kh.classCircle;

public class Circle2Run {

	public static void main(String[] args) {
		// �⺻������ ��ü ����!
		Circle2 circle = new Circle2();
		//�ʱ� ���� �ѷ��� ���̸� ����ϰ� ����غ���!'
		
		//final double PI = 3.14;
		//private final double PI = 3.14;
		
		System.out.println("�ʱ⿡ ���� ������ �˰�ʹ�");
		//inRadius
		circle.AreaCircle();
		circle.SizeofCircle();
		//AreaCircle
		//SizeOfCircle
		
		//�������� 1�� ������Ų��.
		circle.inRadius();
		//���� �ѷ��� ���̰� ������ 1�� ������ ���� ��� ����ϱ�
		System.out.println("�������� 1�� ������Ų �� ���� ����");
		circle.AreaCircle();
		circle.SizeofCircle();

	}

}
