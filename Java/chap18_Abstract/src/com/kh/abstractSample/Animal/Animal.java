package com.kh.abstractSample.Animal;

 abstract class Animal {
	//�ʵ� String name;
	private String name;
	
	
	//������ 
	public Animal(String name) {
		this.name = name;
		
		
	}
	//�Ϲݸ޼��� ���� �̸� ��� void displayName();
	
	public  void setdisplayName(String displayName) {
		this.name = displayName;
	}
	public String getdisplayName() {
		return name;
	}
	
	//�߻�޼��� ���� �Ҹ� ��� void makeSound();
	public	abstract String makeSound();
			
		
	
	

}
