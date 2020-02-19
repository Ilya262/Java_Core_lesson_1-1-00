package Leson4_1;

public class Main {



	public static void main(String[] args) {
		Robot robot =new Robot();
		CoffeRobot CoffeRobot=new CoffeRobot();
		RobotDancer RobotDancer=new RobotDancer ();
		RobotCoocker RobotCoocker=new RobotCoocker();
		robot.work();
		CoffeRobot.work();
		RobotDancer.work();
		RobotCoocker.work();
		
		System.out.println("Array");
		 Robot []arr={robot,CoffeRobot,RobotDancer,RobotCoocker}; 
		for(Robot Arr:arr) {
			Arr.work();
		}
		
	}

}
