import java.util.Scanner;

public class PacticeHard_ver {

	public static void main(String[] args) {
		// ������ �Է¹ް� ���� ������Ű�� ����ϼ���.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int num = scan.nextInt();// num�� ������ �Է¹޴´�.
		
		//�ݺ����� ����� ��(*)�� ������Ű�� ���
		for(int i = 1; i<=num; i++) {
			for(int a = num; a>=i;a--) {
				System.out.print(" ");
			}
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			for(int k =2; k <=i; k++) {
				System.out.print("*");
			}
			System.out.println("");//�ٹٲ�
		}

	}
}


