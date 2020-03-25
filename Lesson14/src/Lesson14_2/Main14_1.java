package Lesson14_2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main14_1 {

	public static void main(String[] args) {
		Set<Person> p = new HashSet<Person>();
		p.add(new Person("Andriy", 23));
		p.add(new Person("Andriy", 24));
		p.add(new Person("Vasya", 23));
		p.add(new Person("Dima", 27));
		p.add(new Person("Oleg", 29));
		System.out.println("Before sorting");

		for (Person person : p) {
			System.out.println(person);
		}

		System.out.println();
		System.out.println("After sorting Comparable");
		Set<Person> p1 = new TreeSet<>();
		p1.addAll(p);
		for (Person person : p1) {
			System.out.println(person);
		}
		System.out.println();
		System.out.println("After sorting Comparator");
		Set<Person> p2 = new TreeSet<>(new ComparatorPerson());
		p2.addAll(p);
		for (Person person : p2) {
			System.out.println(person);
		}
	}

}
