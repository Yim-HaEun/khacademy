package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 * */
public class RandomMain {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		RandomMain rd = new RandomMain();
		//rd.RandomExam();
		rd.Lotto();
		
	}public void Lotto() {
		
		Random rd = new Random(); // ���� ��ü ����
		//ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ��� ���ϱ� ���� set�� ����� �� ����.
		
		//6���� �� ��
		while(lottoNum.size() < 6) { //0,1,2,3,4,5
			//1~45 ������ �����ؼ� ���� ����
			int ranNumber = rd.nextInt(45)+1; //0~44�ڸ��� ���� ��ȣ �ϳ�
			
			//�����ϴ��� ���� �ߺ� x 
			//�ߺ��� ���� list�� ����� �� ����
			
			//�ߺ� ����
			if(!lottoNum.contains(ranNumber)); //!�� ������� ���� �����Ҷ��� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
		}
		System.out.println("�ζ� ��ȣ : " + lottoNum);
		
		
		int ranL = rd.nextInt();
		
	}

	public void RandomExam() {
		Random rd = new Random(); // ���� ��ü ����
		
		//1. ���� ���� ������ ������ ������ �����߰ڴ�.
		int ranInt = rd.nextInt(100); //0~99���̿��� 1�� ����
		System.out.println(ranInt);
		
		//2. �Ǽ� ���� ������ ������ ������ �����߰ڴ�.
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		//3.boolean �� �������� ���� 
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
		
	}

}
