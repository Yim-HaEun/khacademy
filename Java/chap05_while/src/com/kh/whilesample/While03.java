package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// �ݺ������� ���
		int i = 1;
		while (i <= 10) { //���ڰ� 5�� �ɶ� ����� ���߰� �;�
							//i�� 5���� ���ų� ���� �� true
			System.out.println(i); // �� �ε�ȣ�� ���� ���
			i = ++i; //2 i++;/ i = i+1;
			//i++ �϶� i�� 1�� ���� ���� �����߱⶧���� ++�� �۵����� �ʾҴ�.(���ѷ��� �߻�)
			//++i�� ���� i�� +1�� ���� ���� 
			//1~10���� ��� ����, ���ѷ��� �߻�X
		}
		
	}

}
