package Lesson11_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] material = { "leather", "alcantara" };
		Car[][] auto = new Car[random(1, 20)][random(1, 20)];
		menu();

		while (true) {
			switch (sc.nextInt()) {

			case 1:{
		for (int i = 0; i < auto.length; i++) {
			for (int j = 0; j < auto.length; j++) {
				
				auto[i][j] = new Car(random(1, 10), 
						(random(2004, 2020)),
						new Helm(random(10, 15), 
								material[random(0, 1)]), 
						new Motor(random(4, 8)));
			}
		}
		System.out.println(Arrays.deepToString(auto));
		
			
break;}

			case 2:{
				
				Car auto1=new Car(random(1, 10), 
						(random(2004, 2020)),
						new Helm(random(10, 15), 
								material[random(0, 1)]), 
						new Motor(random(4, 8)));
				Car array[] = new Car[1];
				Arrays.fill(array, auto1);
				System.out.println(Arrays.deepToString(array));
				
			}
			break;}
		}
	

	}

	public static int random(int min, int max) {

		if (min > max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		Random random = new Random();

		return random.nextInt(max - min + 1) + min;
	}

	public static void menu() {
		System.out.println("Вивести toString() даних елементів масиву на консоль");
		System.out.println("Для всіх обєктів даного масиву засетити одинаковий  обєкт класу Авто");
	}

}
