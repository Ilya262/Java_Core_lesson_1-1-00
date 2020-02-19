package Lesson8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Seasons[] seasons_mass = Seasons.values();
		Months[] months_mass = Months.values();

		while (true) {
			Scanner sc = new Scanner(System.in);
			menu();
			switch (sc.nextInt()) {

			case 1: {
				System.out.println("Enter Months");
				Scanner scanner = new Scanner(System.in);
				String m = scanner.next().toLowerCase();
				boolean flag = months_exist(months_mass, m);
				if (!flag) {
					System.out.println("Month is not exist");
				}
				break;

			}
			case 2: {
				System.out.println("Enter Seasons");

				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				boolean flag = false;

				for (Months m : months_mass) {
					if (m.getSeasons().name().equals(seasonSc)) {
						flag = true;
					}
				}
				if (flag) {
					for (Months mon : months_mass) {
						if (mon.getSeasons().name().equalsIgnoreCase(seasonSc)) {
							System.out.println(mon);
						}
					}
				}
				if (!flag) {
					System.out.println("Season is not exist");
				}
				break;
			}
			case 3: {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				boolean flag = false;
				String m = sc.next().toLowerCase();
				Months months;
				months = Months.valueOf(m);
				for (Months mon : months_mass) {
					if (mon.getDay() == months.getDay()) {
						System.out.println(mon);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Season is not exist");
				}
				break;
			}
			case 4: {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				boolean flag = false;
				String m = sc.next().toLowerCase();
				Months months;
				months = Months.valueOf(m);
				for (Months mon : months_mass) {
					if (mon.getDay() < months.getDay()) {
						System.out.println(mon);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Season is not exist");
				}
				break;
			}
			case 5: {
				System.out.println("Enter Months");
				sc = new Scanner(System.in);
				boolean flag = false;
				String m = sc.next().toLowerCase();
				Months months;
				months = Months.valueOf(m);
				for (Months mon : months_mass) {
					if (mon.getDay() > months.getDay()) {
						System.out.println(mon);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Season is not exist");
				}
			}
			case 6: {
				System.out.println("Enter Seasons");

				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				boolean flag = seasons_exist(seasons_mass, seasonSc);

				if (flag) {
					Seasons seasons = Seasons.valueOf(seasonSc);
					int ordinal = seasons.ordinal();
					if (ordinal == seasons_mass.length - 1) {
						ordinal = 0;
						System.out.println(seasons_mass[ordinal]);
					} else {
						System.out.println(seasons_mass[ordinal + 1]);
					}
					if (!flag) {
						System.out.println("Season is not exist");
					}
					break;
				}
			}
			case 7: {
				System.out.println("Enter Seasons");

				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				boolean flag = seasons_exist(seasons_mass, seasonSc);

				if (flag) {
					Seasons seasons = Seasons.valueOf(seasonSc);
					int ordinal = seasons.ordinal();
					if (ordinal == seasons_mass.length - 1) {
						ordinal = 0;
						System.out.println(seasons_mass[ordinal]);
					} else {
						System.out.println(seasons_mass[ordinal + 1]);
					}
					if (!flag) {
						System.out.println("Season is not exist");
					}
					break;
				}
			}
			case 8: {

				for (Months mon : months_mass) {
					if (mon.getDay() % 2 == 0) {
						System.out.println(mon);
					}

				}

				break;
			}
			case 9:{
				for (Months mon : months_mass) {
					if (mon.getDay() % 2 == 1) {
						System.out.println(mon);
					}

				}

				break;
			}
			case 10:{
				System.out.println("Enter Months ");
				sc = new Scanner(System.in);
				String m = sc.next().toLowerCase();
				boolean flag = months_exist(months_mass, m);
				Months months=Months.valueOf(m);
				
					
					if(months.getDay()%2==0) {
						
						System.out.println("Місяць є парний");
						flag=true;
					}
					else {
						System.out.println("Місяць не парний");
					}
					
				
				if (!flag) {
					System.out.println("Month is not exist");
				}
					
				
				
				break;
			}
			}
		}
	}

	private static boolean seasons_exist(Seasons[] seasons_mass, String seasonSc) {
		boolean flag = false;
		for (Seasons s : seasons_mass) {
			if (s.name().equals(seasonSc)) {
				flag = true;
				System.out.println("Seasons is exist");
			}
		}
		return flag;

	}

	private static boolean months_exist(Months[] months_mass, String m) {
		boolean flag = false;
		for (Months months : months_mass) {
			if (months.name().equals(m)) {
				flag = true;
				System.out.println("Month is exist");
			}

		}
		return flag;
	}

	private static void menu() {
		System.out.println("Натисніть 1 щоб Перевірити чи є такий місяць");
		System.out.println("Натисніть 2 щоб Вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3 щоб Вивести всі місяці які мають таку саму кількість днів");
		System.out.println("Натисніть 4 щоб Вивести на екран всі місяці які мають меншу кількість днів");
		System.out.println("Натисніть 5 щоб Вивести на екран всі місяці які мають більшу кількість днів");
		System.out.println("Натисніть 6 щоб Вивести на екран наступну пору року");
		System.out.println("Натисніть 7 щоб Вивести на екран попередню пору року");
		System.out.println("Натисніть 8 щоб Вивести на екран всі місяці які мають парну кількість днів");
		System.out.println("Натисніть 9 щоб Вивести на екран всі місяці які мають непарну кількість днів");
		System.out.println("Натисніть 10 щоб Вивести на екран чи введений з консолі місяць має парну кількість днів");

	}

}
