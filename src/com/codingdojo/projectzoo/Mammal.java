package com.codingdojo.projectzoo;

public class Mammal {
	public int energy;
	public Mammal() {
		this.energy = 100;
	}
	
	public void displayEnergy() {
		System.out.println("current energy is: " + this.energy);
	}
}
