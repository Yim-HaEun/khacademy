import java.util.Scanner;

public class forstar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int num = sc.nextInt();
		
		//�簢��
		for(int i =1 ;i<=num; i++) { //�� ����
			for(int j =1;j<=num;j++) { //�� ����
				//���� 1�� ��� (���� ����)
				//���� �࿡�� ����ϴ� ���� ù ��° ���� ��� (j==1)
				//���� �࿡�� ���� �������� ���� ���(j==num)
				//���� �������� ��� ���� �Ʒ���
				if(i==1||i==num||j==1||j==num) {
					System.out.print("*");
				}else{
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		
			

	}

}
