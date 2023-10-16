package com.kh.gettersetter.goodExam;


public class GoodPlayer {
	private String name; //ĳ���� �̸�
	private int health; //ü��
	private int attackPower; // �����Ŀ�

	public void setName(String name) {//�̸��� ����Ǹ� ����� set
		this.name = name;
	}
	//�����ϴ� valid
	public void ValidName() {//ĳ���� �̸��� ������ ������ ����!
		if(this.name == "") {
			this.name = "No Name";
			
		}
	}
	public String getName() { //ĳ���� �̸��� ��ȯ
	return name;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public void isValidHealth() { //ü���� 0���ϸ� ĳ���� ���
		if(health <= 0) {
			this.health = 0;
		}
	}
	public int getHealth() {
		return health;
	}
	//0 �̸��� ���� �־ 0 ������ ���� ��µ��� ����
	public void setAttackPower(int attackPower){
		this.attackPower = attackPower;
	}
	public void ValidAttackPower() {//���Ἲ�ǰ� ����
		if(attackPower <= 0) {
			attackPower = 0;
		}
	}
		
	public int getAttackPower() {
		return attackPower;
	}

	//ĳ���� ���� ��� �޼ҵ� �ۼ�
	public void displayInfo() {
		System.out.println("ĳ���� ���� :"+ this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���� �Ŀ� : "+ this.attackPower);
	}
	
	//ĳ���� �����ϴ� ��� �޼���
	public void attack(GoodPlayer target) {
		System.out.println("["+ name + "]" + "�� �����߽��ϴ�." +"["+ target.getName() +"]"+ "-" + attackPower);
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("���� �޾ҽ��ϴ�.");
	}
	
	
}
