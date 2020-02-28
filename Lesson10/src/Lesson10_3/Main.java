package Lesson10_3;

public class Main {

	public static void main(String[] args) {
		String s="Порахувати кількість слів у реченні реченні ";

		int count=0;
		String[] s2=s.split(" ");
		
		for(String sum:s2) {
			count++;
			
		}
		System.out.println(count);
	}
	
}
