package Lesson10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("������� ����� :");
		Scanner word=new Scanner(System.in);
		String s=word.nextLine().toLowerCase();
		
		
		if (s.equalsIgnoreCase((new   StringBuffer(s)).reverse().toString()) ) {

			System.out.println(s);
		}
		else  {
			System.out.println("����� �� ����� ��� ����� �� 5 ����,��� ���� �� � ����������");
		}

	}

}
