package chap37_TodoList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TodoList {
	//private ArrayList<String> tasks;
	private Map<Integer,String> tasks;
	private int nextId;
	
	public TodoList() {
		//tasks = new ArrayList<>();
		tasks = new HashMap<>();
		nextId = 1;
	}
	public void addTask(String task) {
		//tasks.add(numb,task);
		
		tasks.put(nextId,task);
		nextId++;
		
		
		
		//tasks.add(task);
	}
	/*public void removetask(int index) {
		if(index >= 0 && index< tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("�߸��� �ε����Դϴ�.");
		}
	}
	*/
	public void removetask(int Id) {
		if(tasks.containsKey(Id)) {
			tasks.remove(Id);
		}else {
			System.out.println("��ȿ���� ����");
		}
	}
	public void displayTasks(int numb, String task) {
		System.out.println("my TodoList");
		//for(int i =0; i < tasks.size(); i++) {
			//System.out.println((i+1) + "."+ tasks.get(i));
		for(Map.Entry<Integer, String> entry : tasks.entrySet()) {
			System.out.println(entry.getClass() + "-" + entry.getValue());
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
