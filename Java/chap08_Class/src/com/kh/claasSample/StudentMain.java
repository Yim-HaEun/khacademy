package com.kh.claasSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		Student student1 = new Student("������",20,"1�г�");
		Student student2 = new Student("���¿�",20,"1�г�");
		Student student3 = new Student("����ȣ",20,"1�г�");
		Student student4 = new Student("���븸",22,"3�г�");
		//�л� ���� ���
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
		//�л��� 3�� ���� 3�� ����ϱ�
		//student2, student3, student4
		//������ �̸��� ���̿� �г��� displayInfo();�� ����ؼ� ����ϼ���.

	}

}
