package com.kh.iAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		PracticeAddress inetPractice = new PracticeAddress();
		inetPractice.InetPractice();
	
	}
	public void InetPractice() {
		try {
			//ȣ��Ʈ�� �̸� �̿��ؼ� ��ü ����
			InetAddress address = InetAddress.getByName("www.naver.com");
			
			//IP �ּ� ���
			System.out.println("Host Name : "+ address.getHostName());
			System.out.println("Host Name : "+ address.getHostAddress());
			
			//�� ��ǻ���� InetAddress ��ü ���
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : "+ localHost.getHostName());
			System.out.println("Local IP Address : "+ localHost.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
