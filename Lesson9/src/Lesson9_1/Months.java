
/*
 * Logos  homework
 */

package Lesson9_1;

/**
 * @since java 1.8
 * @author Ivasyk Illya
 * @version 1.1
 */
import Lesson9_1.Seasons;

public enum Months { // Enum class

	january(Seasons.winter, 31), february(Seasons.winter, 29), december(Seasons.winter, 31), march(Seasons.spring, 31),
	april(Seasons.spring, 30), may(Seasons.spring, 31), jun(Seasons.summer, 30), july(Seasons.summer, 31),
	avgust(Seasons.summer, 30), september(Seasons.fall, 31), october(Seasons.fall, 30), november(Seasons.fall, 31); // static
																													// varibal

	Seasons seasons;
	int day;

	private Months(Seasons seasons, int day) {
		this.seasons = seasons;
		this.day = day;
	} // Constructor

	public Seasons getSeasons() {
		return seasons;
	}  // getter

	public int getDay() {
		return day;
	}

}
