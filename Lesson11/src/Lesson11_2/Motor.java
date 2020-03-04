package Lesson11_2;

public class Motor {

	private int count_cylinders;

	public Motor(int count_cylinders) {
		super();
		this.setCount_cylinders(count_cylinders);
	}

	public int getCount_cylinders() {
		return count_cylinders;
	}

	public void setCount_cylinders(int count_cylinders) {
		this.count_cylinders = count_cylinders;
	}

	@Override
	public String toString() {
		return "Motor count_cylinders=" + count_cylinders;
	}

}
