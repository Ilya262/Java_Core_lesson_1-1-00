package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	private int a = 20;
	private int b = 3;

	@Override
	public void multiply() {
		System.out.println("�������� 20 * 3: " + a * b);

	}

	@Override
	public void plus() {
		System.out.println("��������� 20 + 3: " + a + b);

	}

	@Override
	public void minus() {
		System.out.println("³������� 20 - 3: " + (a - b));

	}

	@Override
	public void devide() {
		System.out.println("ĳ����� 20 / 3: " + a / b);

	}

}
