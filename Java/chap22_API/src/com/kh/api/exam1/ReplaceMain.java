package com.kh.api.exam1;

public class ReplaceMain {
	

	
	public static void main(String[] args) {
		ReplaceMain rp = new ReplaceMain();
		rp.replace();
		rp.replace2();
		rp.replace3();
		rp.replace4();
		rp.replace5();
		rp.replaceAll();
	}
	public void replace() {		
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	
	}
	public void replace2() {
		String input1 = "Hello World!";
		//World�� Java�� ��ü
		String reinput1 = input1.replace("World", "Java");
		System.out.println("���� : "+ reinput1);
	}
	public void replace3() {
		String originName = "Hello world";
		System.out.println(originName);
		//o�� �����ִ� ���ڿ��� x�� �����ϱ�
		String reOriginName = originName.replace("o","x");
		System.out.println("���� : " + reOriginName);
		
	}
	public void replace4() {
		//fox �� cat���� �ٲٱ�
		String originString = "The quick brown fox jumps over the lazy dog";
		System.out.println(originString);
		String reOriginString = originString.replace("fox", "cat");
		System.out.println("����: " + reOriginString);
		
	}
	public void replace5() {
		//��� ���� ����
		String originString = "The quick brown fox jumps over the lazy dog";
		System.out.println(originString);
		String reOriginString = originString.replace(" ", "");
		System.out.println("���� ���� : "+ reOriginString);
		
	}
	public void replaceAll() {
		String originString = "Hello World";
		//replace��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world","black Cat");
		System.out.println("���ڿ� ġȯ : "+ reAllstr);
	}

}
