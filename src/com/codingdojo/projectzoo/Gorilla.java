package com.codingdojo.projectzoo;

public class Gorilla extends Mammal {
	
	public Gorilla eatBanana() {
		this.energy += 10;
		System.out.println("Yum! that banana was good");
		return this;
	}
	
	public Gorilla throwThings() {
		this.energy -= 5;
		System.out.println("gorilla just threw something");
		return this;
	}
	
	public Gorilla climb() {
		this.energy -= 10;
		System.out.println("gorilla is climbing");
		return this;
	}
	
	
}
