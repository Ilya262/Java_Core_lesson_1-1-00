package Lesson4_2;

public class Body {
private String color;
Body(String color){
	this.color=color;
	
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "color=" + color ;
}
public void Color() {
	this.color="Red";
	System.out.print("color="+color+" ");
}

}
