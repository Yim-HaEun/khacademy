package com.kh.claasSample;

public class Car {
	//1.���� �ʵ� �������
	String brand;	//�귣��
	String model;	//��
	int speed;		//�ӵ�
	boolean engineOn;//��������
	//-----------------------------------------
	//������� �ؿ��� ��� �޼ҵ�� ����
	
	//2. �����ڴ� �޼ҵ��� �Ѱ��� ����
	public Car(String brand, String model) { // ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ���Դϴ�.
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	//���� ���� �޼ҵ�
	public void startEngine() {
		//���࿡ ������ true ���� �õ�
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼��� �ۼ�
		}else {//������ false�̸� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ �����ֽ��ϴ�.");
		}
		
	}
	//���� �޼���
	public void accelerate(int amount) {
		if(engineOn) {
			System.out.println("�ӵ� ���Դϴ�.");//������ true�� ���� �ӵ��� �󸶴�.
		}else {
			System.out.println("�ӵ��� �� �� ����.");//������ false�� ������ �����־� �ӵ��� �� �� ����.
		}
		
		
		
	}
}	
