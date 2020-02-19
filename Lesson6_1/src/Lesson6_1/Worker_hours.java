package Lesson6_1;

public class Worker_hours implements salary {
	private int salary_day = 20;
	private int hours = 8;
	private int day = 6;
	private int week = 4;


	@Override
	public void Worker_salary() {
		System.out.println("Погодинна зарплата  працівника за місяць  = "+(salary_day * hours)* day*week);

	}

}
