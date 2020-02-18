package Lesson8;

public enum Months {
    
	january(Seasons.winter,31), february(Seasons.winter,29), december(Seasons.winter,31), march(Seasons.spring,31),
	april(Seasons.spring,30), may(Seasons.spring,31), jun(Seasons.summer,30), july(Seasons.summer,31), avgust(Seasons.summer,30),
september(Seasons.fall,31), october(Seasons.fall,30), november(Seasons.fall,31);

	Seasons seasons;
    int day;
	private Months(Seasons seasons, int day) {
		this.seasons = seasons;
		this.day = day;
	}
	public Seasons getSeasons() {
		return seasons;
	}
	public int getDay() {
		return day;
	}
	

}
