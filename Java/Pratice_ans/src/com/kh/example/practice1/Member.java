package com.kh.example.practice1;

public class Member {

	public static void main(String[] args) {
		//1.�������
		String memberId; 
		String memberPwd;
		String memberName;
		int age;
		char gender;
		String phone;
		String email;
		//2.������ + Member()*
	}
	private String memberName;

	public Member (String memberName) {
		
	}

	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	public void printName() {
		System.out.println("�̸� : "+ memberName);
		
	}

}
