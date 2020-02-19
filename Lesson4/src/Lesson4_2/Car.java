package Lesson4_2;

public class Car {
	private String name;
private Handlebar handlebar;
private Wheels wheels;
private Body body;

	public Car(String name,Handlebar handlebar,Wheels wheels,Body body) {
		this.name = name;
        this.handlebar=handlebar;
        this.wheels=wheels;
        this.body=body;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Handlebar getHandlebar() {
		return handlebar;
	}

	public void setHandlebar(Handlebar handlebar) {
		this.handlebar = handlebar;
	}

	public Wheels getWheels() {
		return wheels;
	}

	public void setWheels(Wheels wheels) {
		this.wheels = wheels;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Car-name=" + name +" "+  handlebar+" " + wheels+" " +  body ;
	}
	
public void Name() {
	this.name="Ferrari";
	System.out.print("name="+name+" ");
}
	

}
