package com.kh.gettersetter;

public class PlayerCharacter {
	private String name; //ĳ���� �̸�
	private int health; //ü��
	private int attackPower; // �����Ŀ�

	/*
	 * getter 
	 		������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	 		���������ʹ� ������
	 * */
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
		
	}public int getAttackPower() {
		return attackPower;
	}
	/*
	 * setter
	 		�ܺο��� �޼��带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
	 		�޼���� �Ű���(�Ű�����)�� �����ؼ� ��ȿ�� ���� �����ͷ� ������ �� ����
	 * */
	public void setName(String name) {
		
		this.name = name;
	}
	public void setHealth(int health) {
		
			this.health = health;
	}
	//�߸��� ��
	
	//0 �̸��� ���� �־ 0 ������ ���� ��µ��� ����
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� Ŭ ���
		if(attackPower >= 1) {
			this.attackPower = attackPower;
		}else {
			this.attackPower = 0;
			System.out.println("power�� �������մϴ�.");
		}
		this.attackPower = attackPower;
	}
	//ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ���� :"+ name);
		System.out.println("ü�� ���� : " + health);
		System.out.println("���� �Ŀ� : "+ attackPower);
	}
	
	//ĳ���� �����ϴ� ��� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println("["+ name + "]" + "�� �����߽��ϴ�." +"["+ target.getName() +"]"+ "-" + attackPower);
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
	
	
}
