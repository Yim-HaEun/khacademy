import java.util.Scanner;

public class for02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �����
		Scanner scan = new Scanner(System.in);
		/*System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan.nextInt();
		
		int result = 0; // ���� ���� 0���� �ݴϴ�.
		for (int i = 0; i < num2; i++) {
			//for������ ����ؼ� i ������ 0���� num2 �̸����� �ݺ�
			//�� ������ �ι�° ������ num2��ŭ �ݺ��ȴ�.
			result += num1;
			//result ������ num1 ���� ����
			//num2 ��ŭ num1�� ���ϴ� ȿ���� ��
			System.out.println("�� = " +num1+ "*" + i +"=" +result);
		}
		System.out.println(num1+ "*" + num2 +"=" +result);
		//���� ����� ��� �Է¹��� �� ���ڿ� ��� ���� ���ڿ��� �����ؼ� �����.
		*/
		// for�� ������
		
		
		System.out.println("�������� ����սô�. �� ��?");
		int gugudan;
		int dan = scan.nextInt();
		for(int i =1;i<=9;i++) {
				gugudan = dan *i;
				System.out.println(dan +"*" + i + "=" + gugudan);
			}
		int num1 = scan.nextInt();
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan.nextInt();
		
		int result = 0;
	
	}
	

}
