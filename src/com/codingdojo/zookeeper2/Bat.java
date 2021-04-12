package com.codingdojo.zookeeper2;

public class Bat extends Mammal {	
	public void fly() {
		System.out.println("Bat taking off.");
		energyLevel -= 50;
	}
	public void eatHumans() {
		energyLevel += 25;
	}
	public void attactTown() {
		System.out.println("Town attacked and on fire.");
		energyLevel -= 100;
	}
}
