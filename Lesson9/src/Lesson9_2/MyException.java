/*
 * Logos  homework
 */

package Lesson9_2;

/**
 * @since java 1.8
 * @author Ivasyk Illya
 * @version 1.1
 */
public class MyException extends Exception {

	private String result;

	public MyException(String result) {
		super(result);
		this.result = result;
	}

	public String getResult() {
		return result;
	}

}
