/*
 * Logos  homework
 */

package Lesson9_2;

/**
 * @since java 1.8
 * @author Ivasyk Illya
 * @version 1.1
 */
public class Methods {
	int a;
	int b;

	public Methods(int a, int b) { // constructor
		super();
		this.a = a;
		this.b = b;
	}

	void plus() throws IllegalAccessException, MyException { // method
		Test();
		double result = a + b;
		System.out.println("��������� =" + result);
	}

	void minus() throws IllegalAccessException, MyException { // method
		Test();
		double result = a - b;
		System.out.println("³������� =" + result);
	}

	void multiply() throws IllegalAccessException, MyException { // method
		Test();
		double result = a * b;
		System.out.println("��������  =" + result);
	}

	void division() throws IllegalAccessException, MyException { // method
		Test();
		double result = a / b;
		System.out.println("ĳ����� =" + result);
	}

	public void Test() throws MyException, IllegalAccessException {  // Exception
		if (a < 0 || b < 0) {
			String mess = "��� ����� ����� 0 ";
			throw new IllegalArgumentException(mess);

		}
		if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
			String mess = "���� ����� ������� 0 ";
			throw new ArithmeticException(mess);
		}
		if (a == 0 && b == 0) {
			String mess = "��� ����� ��������� 0 ";
			throw new IllegalAccessException(mess);
		}
		if (a > 0 && b > 0) {
			String mess = "MyException";
			throw new MyException(mess);
		}

	}
}
