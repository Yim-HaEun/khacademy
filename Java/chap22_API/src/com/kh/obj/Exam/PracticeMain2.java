package com.kh.obj.Exam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2  st = new PracticeMain2();
		st.practice1();
		st.practice2();

	}
	public void practice1() {
		//���ڿ� �����̱� ��� append()
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");
		sb.append("������ ������ ?");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		//���ڿ� ������ reverse()
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.reverse();
		System.out.println(str.toString());
	}

}
