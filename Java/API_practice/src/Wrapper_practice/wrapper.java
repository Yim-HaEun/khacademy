package Wrapper_practice;

import java.nio.charset.Charset;

public class wrapper {

	public static void main(String[] args) {
		//String�� �⺻ �ڷ������� �ٲٱ�
		Byte b = Byte.parseByte("1");

		Short s = Short.parseShort("2");

		Integer i = Integer.parseInt("3");

		Long l = Long.parseLong("4");

		Float f = Float.parseFloat("0.1");

		Double d = Double.parseDouble("0.2");

		Boolean bool = Boolean.parseBoolean("true");

		char c = "abc".charAt(0);
		
		
		//�⺻ �ڷ����� String���� �ٲٱ�
		String b1 = Byte.valueOf((byte)1).toString();

		String s1 = Short.valueOf((short)2).toString();

		String i1 = Integer.valueOf(3).toString();

		String l1 = Long.valueOf(4L).toString();

		String f1 = Float.valueOf(0.1f).toString();

		String d1 = Double.valueOf(0.2).toString();

		String bool1 = Boolean.valueOf(true).toString();

		String ch1 = Character.valueOf('a').toString();
		
		
		System.out.println(".\t.");//������ ������ŭ ����
		System.out.println("��\n �ٲ�");//����ϰ� ���� �������� �ű�
		//Ư������ ��� �� �� ������(\)�� �ְ� Ư�����ڸ� �־�� ��
		System.out.println("\\");
		System.out.println("\'");
		System.out.println("\"");

	}

}
