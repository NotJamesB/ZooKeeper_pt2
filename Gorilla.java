package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {
	public Gorilla(int energy) {
		super(energy);
	}
	public void throwSomething(String item) {
		super.energy -= 5;
		System.out.println("The gorilla just threw " + item + ", And lost 5 energy. He now has " + super.energy + " Energy.");
	}
	public void eatBananas() {
		super.energy += 10;
		if(super.energy >= 100) {
			super.energy = 100;
			System.out.println("The gorilla loved that banana and has max energy!");
		}
		else {
			System.out.println("The gorilla loved that banana and has gained 10 energy! He now has " + super.energy + " Energy.");
			}
		}
		
	public void climb() {
		super.energy -= 10;
		System.out.println("The gorilla has climbed a tree and lost 10 energy He now has " + super.energy + " Energy.");
	}
}
