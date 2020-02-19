package Lesson5_2;

public class Main {

	public static void main(String[] args) {
		
		int kopiyka;
		
		kopiyka=(int) (1+(Math.random())*100);
		if(kopiyka >=50&&kopiyka !=100) {
			
			System.out.println("Число копійки "+kopiyka+":"+"Випав герб");
		}
		else if(kopiyka==100){
			System.out.println("Число копійки "+kopiyka+":"+"Копійка впала на ребро");
		}
		else {
			System.out.println("Число копійки "+kopiyka+":"+"Випала копійка");
		}
		
	}

}
