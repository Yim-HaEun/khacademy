package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("�����");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("�߿���");
		
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("����");
		
		myMonkey.sleep();
		myMonkey.eat();
		
		Lion myLion = new Lion("������");
		myLion.eat();

	}

}
