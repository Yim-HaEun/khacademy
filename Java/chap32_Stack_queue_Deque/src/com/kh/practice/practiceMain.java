package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class practiceMain {

	public static void main(String[] args) {
		//stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		practiceMain pm = new practiceMain();
		//pm.PracticeStack();
		pm.PracticeQueue();
	}
	public void PracticeStack() {
		Stack<String> stack = new Stack<>();
			//�� ����
		stack.push("chocolate");
		stack.push("candy");
		stack.push("jellyBean");			
		stack.push("iceCream");
			
			//�� ����
		System.out.println(stack.pop());
		System.out.println(stack.pop());
			
			//�� �ʱ�ȭ
		stack.clear();
	}
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����ϱ�
		
		queue.offer("��ƾ Ÿ��Ƽ��");
		queue.offer("ũ�������� ���");
		queue.offer("�հ���");
		queue.offer("��Ƽ�� ���ʹ���");
		queue.offer("��Ʃ ��");
		
		
		String removedElement = queue.poll();
		System.out.println(removedElement);
		
		removedElement = queue.poll(); //��� ���� ����
		String frontElement = queue.peek();
		System.out.println(frontElement); //�������� �ʰ� Ȯ�θ�
		
		int size = queue.size(); //������ Ȯ��
		System.out.println("size : "+ size );
	}
		

}


