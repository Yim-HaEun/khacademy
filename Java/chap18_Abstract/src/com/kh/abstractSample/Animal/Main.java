package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("�п���","�п�");
		Cat cat = new Cat("�ֿ���", "�ֿ�");
		
		System.out.println("������ �̸� : " + dog.getdisplayName());
		System.out.println("������ �Ҹ� : " + dog.makeSound());
		
		System.out.println("����� �̸� : " + cat.getdisplayName());
		System.out.println("����� �Ҹ� : " + cat.makeSound());
		//1. cat�����
		//Cat cat = new Cat("�����");
		
		//2.��ü�迭�� Animal �����ؼ� ����ϱ�, �������� Ȱ���� ��ü �ٷ��
		//Animal[] animal = new Animal[2];
		
		Animal[] animal = new Animal[2];
		
		animal[0] = new Dog("����", "...");
		animal[1] = new Cat("��ȣ","����");
		
		for(Animal a : animal) {
			a.getdisplayName();
			a.makeSound();
			System.out.println();
		}
		
	}
	

}
