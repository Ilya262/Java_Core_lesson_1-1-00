package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private int a = 20;
	private int b = 3;

	@Override
	public void multiply() {
		System.out.println("Множення 20 * 3: " + a * b);

	}

	@Override
	public void plus() {
		System.out.println("Додавання 20 + 3: " + a + b);

	}

	@Override
	public void minus() {
		System.out.println("Віднімання 20 - 3: " + (a - b));

	}

	@Override
	public void devide() {
		System.out.println("Ділення 20 / 3: " + a / b);

	}

}
