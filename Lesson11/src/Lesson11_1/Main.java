package Lesson11_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Integer[] mass = new Integer[10];

		Random random = new Random();

		for (int i = 0; i < mass.length; i++) {

			mass[i] = random.nextInt();

		}

		System.out.println(Arrays.toString(mass));

		System.out.println("Сортування від найменшого до найбільшого");

		Arrays.sort(mass);

		System.out.println(Arrays.toString(mass));

		System.out.println("Сортування від найбільшого до найменшого");

		Arrays.sort(mass, Collections.reverseOrder());

		System.out.println(Arrays.toString(mass));
	}
}
