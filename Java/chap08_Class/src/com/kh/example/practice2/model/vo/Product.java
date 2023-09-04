package com.kh.example.practice2.model.vo;

public class Product {
	
	//1.멤버변수 생성
	String pName;
	int price;
	String brand;

	//생성자 this를 활용해서 만들어야함
	public Product(String pName, int price, String brand) {
		this.pName =pName;
		this.price = price;
		this.brand = brand;
	}
	
	//정보 출력 메소드 만들기
	// information(): void
	public void information() {
		System.out.println("상품명 : " + pName);
		System.out.println("가격 : " + price + "원");
		System.out.println("브랜드 : " + brand);
	}
}
