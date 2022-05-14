package com.codingdojo.zookeeper;

public class ZooKeeperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla g = new Gorilla(100);
		g.throwSomething("Stick");
		g.throwSomething("dirt");
		g.throwSomething("another stick");
		g.eatBananas();
		g.eatBananas();
		g.climb();
		System.out.println(g.displayEnergy());
		Bat b = new Bat(300);
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		System.out.println(b.displayEnergy());
		
		
	}

}
