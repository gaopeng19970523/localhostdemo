package com.tedu;

public class Work extends Person{
	public Work() {
		System.out.println("i am wok");
	}
	public void study() {
		System.out.println("worker is Studying");
	}
	
	public static void main(String[] args) {
		Person p=new Work();
		p.study();
	}


}
