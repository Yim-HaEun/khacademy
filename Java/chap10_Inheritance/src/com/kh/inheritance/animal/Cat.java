package com.kh.inheritance.animal;

public class Cat extends Animal{
	public Cat(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName() + "�����̿ͼ� �޸���!");
	}
	@Override
	
	public void eat() {
		System.out.println(getName() + "�� �Դµ� �߰��� ����Դ´�.");
	}
	//animal�� �����ִ�  eat �� ����� �ȿ����� �ٽ� ���Ǹ� ������.

}
