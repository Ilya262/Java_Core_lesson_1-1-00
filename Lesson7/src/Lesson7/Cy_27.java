package Lesson7;

public class Cy_27 extends Plane implements SpecialFeatures {

	

	
	

	PlaneDrive planedrive = new PlaneDrive();
	int max_speed;
	String color;
	
	
	 
	
	public Cy_27(double weidth, double length, double weight, int max_speed, String color) {
		super(20, 30, 25);
		this.max_speed = max_speed;
		this.color = color;
	}
	


	
	
	@Override
	public void TurboSpeed() {

		System.out.println("����� �������� ����� = " + (int) ( 260+(Math.random() * 100)));
	}

	@Override
	public void Stealth() {

		System.out.println("˳��� ���������� � ����� \"�����\" �� " + (int) (1 + (Math.random() * 99)) + " c�����");
	}

	@Override
	public void NuclearImpact() {

		System.out.println("ʳ������ �������� ���� =" + (int) (1 + (Math.random() * 10)));

	}

}
