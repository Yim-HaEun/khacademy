package com.kh.whilesample;

import java.util.Scanner;

public class while02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		
		boolean isChoice = false;
		while (!isChoice) { //!�� ����Ͽ� true�� ǥ��
			System.out.println("������ �������ּ���.");
			
			int month = scan.nextInt();
			
			switch(month){
			
			case 12: case 1: case 2: //case 3�� �� �ϳ��� ���̸� ���
				System.out.println("�ܿ�");
				isChoice = true; // �� !�� ���� ��� ���� �������� ����ǰ�, 
				//������ ������ ����Ǳ� ������ true�� �ۼ����־� !�� ���� false�� ������ while���� �������ش�.
				break; //break�� case������ �����ϰ��� �ϴ°� ����� �� �� ���� ����Ѵ�.
			case 3: case 4: case 5:
				System.out.println("��");
				isChoice = true;
				break;
			case 6: case 7: case 8:
				System.out.println("����");
				isChoice = true;
				break;
			case 9: case 10: case 11:
				System.out.println("����");
				isChoice = true;
				break;
			default:
				System.out.println(month+ "���� �߸��� ���Դϴ�.");
			}
			
		}

	
	
	
	/*���̸� �Է¹޾� ����(19~20) û�ҳ�(14~15) ���(10~13)�� �з��ϰ� ����ϱ�
	 * While switch case �̿��ؼ� ����ϱ�
	 * case ���� 
	 * �̿� ���̴� �ٽ� �Է��ϼ���. ���̰��� ����ǥ�� 9�� �̻� �����Ҽ� �ֱ� ����
	 * */
		boolean choice = false;
		while(!choice) {
			System.out.print("���̰��� ������� �����ϱ� ���� ����� ���̸� �Է����ּ���.");
			int age = scan.nextInt();
			switch(age) {
			case 19: case 20:
				System.out.println("���� ����� �����ϱ�");
				choice = true;
				break;
			case 14: case 15:
				System.out.println("û�ҳ� ����� �����ϱ�");
				choice = true;
				break;
			case 10: case 11: case 12: case 13:
				System.out.println("��� ����� �����ϱ�");
				choice = true;
				break;
			
			default:
				System.out.println("���̸� �ٽ��Է��ϼ���.");
				
			}
	}
	}

}
