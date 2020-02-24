
/*
 * Logos  homework
 */

package Lesson9_1;

/**
 * @since java 1.8
 * @author Ivasyk Illya
 * @version 1.1
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		Seasons[] seasons_mass = Seasons.values();// array "Seasons"
		Months[] months_mass = Months.values();// array "Months"

		while (true) {

			Scanner sc = new Scanner(System.in);

			menu();// method
			switch (sc.nextInt()) { // "switch"

			case 1: { // Months exist
				System.out.println("Enter Months");
				Scanner scanner = new Scanner(System.in);
				String m = scanner.next().toLowerCase();
				boolean flag = months_exist(months_mass, m);
				if (!flag) {
					String mess = ("Month is not exist");
					throw new WrongInputConsoleParametersException(mess); // error
				}
				break;

			}
			case 2: {// Months of the same season
				System.out.println("Enter Seasons");

				sc = new Scanner(System.in);
				String seasonSc = sc.next().toLowerCase();

				boolean flag = false; // logic varibale

				for (Months m : months_mass) { // foreach
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
					String mess = ("Season is not exist");
					throw new WrongInputConsoleParametersException(mess);

				}
				break;
			}
			case 3: {// Months with the same number of days
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
					String mess = ("Season is not exist");
					throw new WrongInputConsoleParametersException(mess);
				}
				break;
			}
			case 4: {// Months with less day qty
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
					String mess = ("Season is not exist");
					throw new WrongInputConsoleParametersException(mess);
				}
				break;
			}
			case 5: {// Months with more day qty
						// �����
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
					String mess = ("Season is not exist");
					throw new WrongInputConsoleParametersException(mess);
				}
			}
			case 6: {// Next Seasons
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
						String mess = ("Season is not exist");
						throw new WrongInputConsoleParametersException(mess);
					}
					break;
				}
			}
			case 7: {// Last Seasons
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
						String mess = ("Season is not exist");
						throw new WrongInputConsoleParametersException(mess);
					}
					break;
				}
			}
			case 8: { // Even days

				for (Months mon : months_mass) {
					if (mon.getDay() % 2 == 0) {
						System.out.println(mon);
					}

				}

				break;
			}
			case 9: {// Odd days
				for (Months mon : months_mass) {
					if (mon.getDay() % 2 == 1) {
						System.out.println(mon);
					}

				}

				break;
			}
			case 10: { // entered month are odd or even
				System.out.println("Enter Months ");
				sc = new Scanner(System.in);
				String m = sc.next().toLowerCase();
				boolean flag = months_exist(months_mass, m);
				Months months = Months.valueOf(m);

				if (months.getDay() % 2 == 0) {

					System.out.println("̳���� � ������");
					flag = true;
				} else {
					System.out.println("̳���� �� ������");
				}

				if (!flag) {
					String mess = ("Month is not exist");
					throw new WrongInputConsoleParametersException(mess);

				}

				break;
			}
			}
		}
	}

	private static boolean seasons_exist(Seasons[] seasons_mass, String seasonSc) {// method exist seasons
		boolean flag = false;
		for (Seasons s : seasons_mass) {
			if (s.name().equals(seasonSc)) {
				flag = true;
				System.out.println("Seasons is exist");
			}
		}
		return flag;

	}

	private static boolean months_exist(Months[] months_mass, String m) {// method exist months
		boolean flag = false;
		for (Months months : months_mass) {
			if (months.name().equals(m)) {
				flag = true;
				System.out.println("Month is exist");
			}

		}
		return flag;
	}

	private static void menu() { // menu method
		System.out.println("�������� 1 ��� ��������� �� � ����� �����");
		System.out.println("�������� 2 ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 ��� ������� �� ����� �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 5 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 6 ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 ��� ������� �� ����� �� ����� �� ����� ����� ������� ���");
		System.out.println("�������� 9 ��� ������� �� ����� �� ����� �� ����� ������� ������� ���");
		System.out.println("�������� 10 ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	}

}
