package com.kh.practice_arrayhard;

import java.util.Scanner;

public class ArrayHard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("���� ũ�� : ");
		int numRows = scan.nextInt();
		scan.nextLine(); //���๮�� ����
		
		int[][] charArray = new int[numRows][];
		//�� ����ŭ�� �ݺ��� ����
		for(int i=0; i< numRows; i++) {
			//���� ũ�⵵ �޾�
			System.out.println(i + " ���� ũ�� �ޱ� : ");
			int numCols = scan.nextInt();
			charArray[i] = new int[numCols];
			
			int StartValue = i *numCols +1;
			for(int j =0; j < numCols; j++) {
				charArray[i][j] = StartValue;
			}
			//����ϼ���.
			//�迭 ���
			for(int a =0; a<numRows; a++) {
				for(int b = 0; b<charArray[a].length; b++) {
					System.out.println((char)('a'+ charArray[a][b]-1));
				}
				System.out.println();
			}
			scan.close();
		}
	}

}
