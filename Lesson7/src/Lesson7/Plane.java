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

		System.out.println("��� �� ������� ���� = " + (int) (19 + (Math.random()) * 88 )+ " ������");
	}

	void planeDeparture() {

		System.out.println((int) ((Math.random())* 1000) +" �������� " + "��������� �i��� �� ������� ����");
	}

	void landingPlane() {
		System.out.println("˳��� ��� �� �������");
	}

}
