package com.itheima.reflect;

public class Person {
	private String name;
	private Integer age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void run() {
		System.out.println("run.....");
	}
	public String sayHello(String name) {
		return "hello"+name;
	}
}
