package Lesson4_2;

public class Wheels {
private int size;
Wheels(int size){
	this.size=size;
	
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
@Override
public String toString() {
	return "size=" + size ;
}
public void size() {
	this.size=17;
	System.out.print("size="+size+" ");
}

}
