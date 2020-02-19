package Lesson4_3;

public class Main {

	public static void main(String[] args) {
		Animal animal=new Animal("tiger",16,5);
animal.getName();
animal.getSpeed();
animal.getAge();
System.out.println(animal);

animal.setName("lion");
animal.setSpeed(13);
animal.setAge(6);
System.out.println(animal);
	}

}
