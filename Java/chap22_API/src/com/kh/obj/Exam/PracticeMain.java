package com.kh.obj.Exam;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		
		p.practice1();
		p.practice2();
		p.practice3();

	}
	public void practice1() {
		//���ڿ� ���� isert()
		String str = "���� ������ ������";
		StringBuffer st = new StringBuffer(str);
		st.insert(10,"�Ұ��");
		System.out.println(st.toString());
	}
	public void practice2() {
		//���ڿ� ��ü replace
		String str = "���� ������ ������";
		StringBuffer st = new StringBuffer(str);
		st.replace(3,5,"����");
		System.out.println(st.toString());
		
		
	}
	public void practice3() {
		//���ڿ� ���� delete()
		String str = "���� ������ ������";
		StringBuffer st = new StringBuffer(str);
		st.delete(0,2);
		System.out.println(st.toString());
		
	}

}
