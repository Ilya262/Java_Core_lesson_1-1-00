package Lesson7;

public class PlaneDrive {

	void up() {
		System.out.println("Рух вверх зі швидкістю = "+(int) (1 + ((Math.random()) * 260))+" км/год");
	}

	void down() {
		System.out.println("Рух вниз зі швидкістю = "+(int) (1 + ((Math.random()) * 260))+" км/год");

	}

	void left() {
		System.out.println("Рух ліворуч зі швидкістю = "+(int) (1 + ((Math.random()) * 260))+" км/год");

	}

	void right() {
		System.out.println("Рух праворуч зі швидкістю = "+(int) (1 + ((Math.random()) * 260))+" км/год");

	}
}
