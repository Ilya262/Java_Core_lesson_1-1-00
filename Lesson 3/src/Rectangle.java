
public class Rectangle {

	private int a;
	private int b;
	public Rectangle() {
		
		this.a=6;
		this.b=7;
		
	}

		
		public  Rectangle(int a,int b) {
			this.a=a;
			this.b=b;
	}
		
		
		public void result1(){
			System.out.println("Площа прямокутника ="+a*b);
		
		}
		public void result2(){
			
			System.out.println("Периметр прямокутника = "+2*(a+b));
		}
	
}
