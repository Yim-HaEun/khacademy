import java.util.Scanner;

public class practice_for_hard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = scan.nextInt();
		int count =0;
		
		//2�� 3�� ����� ��� ���
		for(int i = 1; i<=num; i++) { //1���� �Է¹��� �� ���� �ݺ��ؼ� 2�� 3�� ����� ��� 
			if(i%2 ==0 || i%3 ==0) { //���� 2�Ǵ� 3���� �������� ����Դϴ�.
				System.out.print(i + " "); // 2�� 3�� ��� ���
			}
			
		}
		for(int i = 1; i<=num; i++) {
			if(i%2==0 && i%3 ==0) {// 2�� �������鼭 3���ε� �������ٸ�(�����)
				count ++; //������ ���ϴ�.
				
			}
		}
		System.out.println(); //�ٹٲ�
		System.out.println("count : "+ count); //����� ���� ���
	}
}



