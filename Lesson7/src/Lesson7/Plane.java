package Lesson7;

public abstract class Plane {

	private double weidth;
	private double length;
	private double weight;

	public Plane(double weidth, double length, double weight) {

		this.weidth = weidth;
		this.length = length;
		this.weight = weight;
	}

	void startTime() {

		System.out.println("��� �� ������� ���� = " + (int) (19 + (Math.random()) * 88) + " ������");
	}

	void planeDeparture() {

		System.out.println((int) ((Math.random()) * 1000) + " �������� " + "��������� �i��� �� ������� ����");
	}

	void landingPlane() {
		System.out.println("˳��� ��� �� �������");
	}

	public double getWeidth() {
		return weidth;
	}

	public void setWeidth(double weidth) {
		this.weidth = weidth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	

}
