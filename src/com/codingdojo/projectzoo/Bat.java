package com.codingdojo.projectzoo;

public class Bat extends Mammal {

	public Bat() {
		this.energy = 300;
	}
	
	public Bat fly() {
		this.energy -= 50;
		System.out.println("The bat took off ZOOOM!!! with a cost of 50 energy" );
		return this;
	}
	
	public Bat eatHumans() {
		this.energy += 25;
		System.out.println("The bat just at a human!! it got 25 energy back");
		return this;
	}

	public Bat attackTown() {
		this.energy -= 100;
		System.out.println("The bat set the town on fire!");
		return this;
	}
}
