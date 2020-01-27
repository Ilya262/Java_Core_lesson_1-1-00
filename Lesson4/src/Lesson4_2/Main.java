package Lesson4_2;

public class Main {

	public static void main(String[] args) {
		//Car car=new Car("Ford",new Handlebar(23),new Wheels(16),new Body("Yellow")); "можна ще так"
		
		Handlebar handlebar=new Handlebar(23);
		Wheels wheels=new Wheels(16);
		Body body =new Body("Yellow");
		Car car=new Car("Ford",handlebar, wheels, body);
		car.getName();
		car.getHandlebar();
		car.getWheels();
		car.getBody();
		
		System.out.println(car);
		
		car.Name();handlebar.handleb();wheels.size();body.Color();
	}

}
