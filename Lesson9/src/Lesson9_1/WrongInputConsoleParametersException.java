/*
 * Logos  homework
 */



package Lesson9_1;
/**
 * @since java 1.8
 * @author Ivasyk Illya
 * @version 1.1
 */

public class WrongInputConsoleParametersException  extends Exception{

	
	private String error;

	public WrongInputConsoleParametersException(String error) {
		super(error);
		this.error = error;
	}

	public String getError() {
		return error;
	}
	
	
	
	
	
}
