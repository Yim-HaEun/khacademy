package com.kh.claasSample;

public class Car {
	//1.상태 필드 멤버변수
	String brand;	//브랜드
	String model;	//모델
	int speed;		//속도
	boolean engineOn;//엔진상태
	//-----------------------------------------
	//멤버변수 밑에는 모두 메소드로 정의
	
	//2. 생성자는 메소드의 한가지 종류
	public Car(String brand, String model) { // 차를 볼 때 필수로 넣을 파라미터는 브랜드와 모델입니다.
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;
	}
	//엔진 시작 메소드
	public void startEngine() {
		//만약에 엔진이 true 엔진 시동
		if(engineOn) {
			System.out.println("엔진을 시동합니다.");//출력 메서드 작성
		}else {//엔진이 false이면 이미 엔진이 켜져있다.
			System.out.println("이미 엔진이 켜져있습니다.");
		}
		
	}
	//가속 메서드
	public void accelerate(int amount) {
		if(engineOn) {
			System.out.println("속도 얼마입니다.");//엔진이 true면 지금 속도가 얼마다.
		}else {
			System.out.println("속도르 알 수 없다.");//엔진이 false면 엔진이 꺼져있어 속도를 낼 수 없다.
		}
		
		
		
	}
}	
