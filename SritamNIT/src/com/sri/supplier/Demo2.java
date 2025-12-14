package com.sri.supplier;

import java.util.function.Supplier;

record Player(Integer id, String name) {}

public class Demo2 {

	public static void main(String[] args) {
		Supplier<Player> s2 = () -> new Player(18,"virat");
		Player player = s2.get();
		System.out.println(player);
	}

}
