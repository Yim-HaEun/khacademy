package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TodoList_practice {
	private Map<Integer,String> tasks;
	private int nextId = 1;
	
	public TodoList_practice() {
		tasks = new HashMap<>();
		nextId = 1;//ù��° ��ȣ
	}
	public void addTask(String task) {
		tasks.put(nextId,task);
		nextId++; // ��ȣ�� �ϳ��� ����
	}
	public void removetask(int Id) {
		if(tasks.containsKey(Id)) {//��ȣ�� �Է¹޾�, tasks�ȿ� Id�� �ִٸ�,
			tasks.remove(Id);
		}else {
			System.out.println("��ȣ�� �����.");
			
		}
	}
	public void displayTasks(int numb,String task) {
		System.out.println("To-Do List : ");
		for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
			System.out.println(entry.getClass()+ "-"+entry.getValue());
		}
	}

	public static void main(String[] args) { 
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�� �� �߰�: add, ����:remove, ���� ����:list, ����:exit �� �Է��ϼ���.");
			
			String choice = sc.nextLine(); 
			//���ڰ� �빮������ �ҹ������� ����ʰ� ���ڴ�.
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�켱������ �� ��(spaceBar���)");
				int numb = sc.nextInt();
				String task = sc.nextLine();
				todoList.addTask(task);
				
			}else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("������ �� ��ȣ �Է��ϱ�");
				try {
					int index = Integer.parseInt(sc.nextLine())-1;
					todoList.removetask(index);
				}catch (Exception e){
					System.out.println("��ȿ���� ���� �Է��Դϴ�.");
					
				}
			}else if (choice.equalsIgnoreCase("List")) {
				 todoList.displayTasks(0, null);
	
			}else if(choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("�߸��� ����Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����");
		sc.close(); 
		
	}

}
