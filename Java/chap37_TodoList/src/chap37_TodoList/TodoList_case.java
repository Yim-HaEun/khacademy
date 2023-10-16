package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		//�� �� ����� ����
		while(true) {
			System.out.println("�� �� ��� : ");
			
			System.out.println("�� ���� �����ϼ��� : ");
			System.out.println("�� �� �߰��� ���� 1�� �־��ּ���");
			System.out.println("�� �� ���Ŵ� ���� 2�� �־��ּ���.");
			System.out.println("�����Ͻ÷��� ���� 3�� �־��ּ���");
			System.out.println("���� ��� ����Ϸ��� ���� 4�� �־��ּ���.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("�߰� �� �� �ۼ�.");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("�� ���� �߰��Ǿ����ϴ�.");
					break;
				
				case 2:
					System.out.println("������ ���� ��ȣ�� �Է��ϼ���.");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("�� ���� ���ŵǾ����ϴ�.");
					}else {
						System.out.println("�ش� ��ȣ�� �� ���� �����ϴ�.(��ȣ �߸��Է�)");
					}
					break;
				
				case 3:
					System.out.println("���α׷� �����.");
					System.out.println("bye~");
					sc.close();
					System.exit(0);
					break;
				case 4: 
					System.out.println("�� �� ��� �����帱�Կ�.");
					for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					
					}
					break;
				
				default:
					System.out.println("�ùٸ� ������ �ƴմϴ�. �ٽ� �������ּ���.");
				
			}
		}
	}

}
