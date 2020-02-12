package Lesson7;

public class Cy_27 extends Plane implements SpecialFeatures {

	PlaneDrive planedrive;
	private int max_speed;
	private String color;

	public Cy_27(PlaneDrive planedrive, int max_speed, String color) {
		super(20, 25, 30);
		this.planedrive = planedrive;
		this.max_speed = max_speed;
		this.color = color;
	}

	

	@Override
	public void TurboSpeed() {

		System.out.println("Турбо швидкість літака = " + (int) (260 + (Math.random() * 100)));
	}

	@Override
	public void Stealth() {

		System.out.println("Літак переходить в режим \"Стелс\" на " + (int) (1 + (Math.random() * 99)) + " cекунд");
	}

	@Override
	public void NuclearImpact() {

		System.out.println("Кількість скинутих бомб =" + (int) (1 + (Math.random() * 10)));

	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

}
