package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		// Array ����
		int[] intArray = new int[2]; //ũ�Ⱑ 5�� ���� �迭 ����
		intArray[0]=1;
		intArray[1]=2;
		
		//Array ���
		System.out.println("Array ��� : ");
		for(int a = 0; a<intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println();//���๮�� ���ԵǾ��־� enter�� ���� ������ �Ѵ�.
		// List ���� Integer = int
									//�� �迭 ����Ʈ ���� 
		List<Integer> intList = new ArrayList<>();//Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List ���
		System.out.println("List ��� : ");
		for(int num : intList) {
			System.out.print(num + " ");
		}
		//String���� ���� �� Array�� List ����غ���
		List<String> StringList = new ArrayList<>();
		StringList.add("apple");
		StringList.add("banana");
		StringList.add("can");
		System.out.println("String List ��� : ");
		for(String n: StringList) {
			System.out.println(n +" ");
		}
	}
}
