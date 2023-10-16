package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���� �� ���
 		java 1.1���ķδ� ������� ����
 			java.time ��Ű�� LocalDate LocalTime LocalDateTime
 * */
	
	public static void main(String[] args) {
		//import java.util.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println("���� �ð� : " + nowTime);
		
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : "+nowDT);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : "+futureDate);
		
		//minus plus
		LocalDate today1 = LocalDate.now();
		LocalDate pastDate =today.minusDays(7);
		System.out.println("7�� �� ��¥ : " + pastDate);
		LocalDate today2 = LocalDate.now();
		LocalDate pastmonth =today.minusMonths(1);
		System.out.println("�Ѵ� �� ��¥ : " + pastmonth);
		
		LocalDate today3 = LocalDate.now();
		LocalDate futureMonth = today.plusMonths(1);
		System.out.println("�Ѵ� �� ��¥ : "+ futureMonth);
		LocalDate today4 = LocalDate.now();
		LocalDate futureWeeks = today.plusWeeks(3);
		System.out.println("3�� �� ��¥ : " + futureWeeks);
		
		LocalTime nowTime1 = LocalTime.now();
		LocalTime laterTime = nowTime1.plusHours(3);
		System.out.println("");
		
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 8, 13);
		//date1.isBefore(date2)
		if(date1.isBefore(date2) == true) {
			System.out.println("date1�� �� �������Դϴ�.");
		}else if(date1.isAfter(date2)== true) {
			System.out.println("date1�� �� �����Դϴ�.");
			//��¸޼ҵ�
		}else {
			//��¸޼ҵ�
			System.out.println("���� ��¥�Դϴ�.");
		}
		
	
	}

}
