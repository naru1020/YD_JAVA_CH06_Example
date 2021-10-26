package com.yedam.java.example;

public class Student {

	//필드
	private String StudentName;
	private int money;
	
	//생성자 -> 값 초기화.
	public Student(String studentName, int money) {
		this.StudentName = studentName;
		this.money = money;
	}
	
	//메소드 -> 행동
	public void takeBus(Bus bus) {
	//버스에 요금을 지불.
	bus.take(1000);
	this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
	//지하철에 요금을 지불
	subway.take(1500);
	this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(StudentName + "님의 남은 돈은 : " + money + " 입니다.");
	}
}

