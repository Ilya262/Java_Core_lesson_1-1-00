package Lesson7;

public abstract class Plane {

	double weidth;
	double length;
	double weight;

	public Plane(double weidth, double length, double weight) {

		this.weidth = weidth;
		this.length = length;
		this.weight = weight;
	}

	void startTime() {

		System.out.println("Час до початку руху = " + (int) (19 + (Math.random()) * 88 )+ " секунд");
	}

	void planeDeparture() {

		System.out.println((int) ((Math.random())* 1000) +" кілометрів " + "Пролетить лiтак на повному баку");
	}

	void landingPlane() {
		System.out.println("Літак іде на посадку");
	}

}
