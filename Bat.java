package com.codingdojo.zookeeper;

public class Bat extends Mammal  {
	public Bat(int energy) {
		super(energy);
	}
	public void fly() {
		super.energy -= 50;
		System.out.println("WHOOSH! The bat just took off and lost 50 Energy! He now has " + super.energy + " Energy Left!");
	}
	public void eatHumans() {
		super.energy += 25;
		System.out.println("Well...Uhhh...The bat just had a meal...He got 25 Energy from it though! He now has " + super.energy + " Energy left!");
	}
	public void attackTown() {
		super.energy -= 100;
		System.out.println("The bat just attacked the town...Whoops. He lost 100 Energy and now has " + super.energy + " Energy left!");
	}
}
