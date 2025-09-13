package com.dto;

public class DbtestDTO {
	private String name;
	private int age;
	private double height;
	private String logtime;
	
	public DbtestDTO() {
		
	}
	
	public DbtestDTO(String name, int age, double height, String logtime) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.logtime = logtime;
	}
	
	@Override
	public String toString() {
		return "Dbtest 테이블 데이터의 name=" + name + ", age=" + age + ", height=" + height + ", logtime=" + logtime + "입니다.";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getLogtime() {
		return logtime;
	}

	public void setLogtime(String logtime) {
		this.logtime = logtime;
	}
	
}
