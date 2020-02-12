package Lesson7;

public class Main {

	public static void main(String[] args) {

		Cy_27 cy_27 = new Cy_27( new PlaneDrive(), 260, "Yellow");
		cy_27.startTime();
		cy_27.planeDeparture();
		cy_27.planedrive.up();
		cy_27.planedrive.left();
		cy_27.planedrive.down();
		cy_27.planedrive.right();
		cy_27.Stealth();
		cy_27.NuclearImpact();
		cy_27.TurboSpeed();
		cy_27.landingPlane();
		
	}
}
