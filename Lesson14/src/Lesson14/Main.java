package Lesson14;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Commodity> product = new HashSet<Commodity>();
		while (true) {
			menu();
			switch (sc.nextInt()) {
			case 1: {
				System.out.println();
				System.out.println("Enter name product");
				String name = sc.next();
				System.out.println("Enter length");
				int lenght = sc.nextInt();
				System.out.println("Enter width");
				int width = sc.nextInt();
				System.out.println("Enter weight");
				int weight = sc.nextInt();
				product.add(new Commodity(name, lenght, width, weight));
				System.out.println();
				System.out.println("Product list");
				for (Commodity commodity : product) {

					System.out.println(commodity);
				}
				System.out.println();

			}
				break;
			case 2: {
				System.out.println();
				System.out.println("Enter name product to remove");
				Scanner s = new Scanner(System.in);
				String name = s.nextLine();
				Iterator<Commodity> iterator = product.iterator();
				System.out.println();
				System.out.println("List products before remove ");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				while (iterator.hasNext()) {
					Commodity com = iterator.next();

					if (com.getName().equalsIgnoreCase(name)) {
						iterator.remove();
						System.out.println("Product " + name + " remove");
					}
				}
				System.out.println();
				System.out.println("List products after remove ");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();

			}
				break;
			case 3: {
				System.out.println();
				System.out.println("Enter name product to change");
				Scanner s = new Scanner(System.in);
				String nameP = s.nextLine();
				Iterator<Commodity> iterator = product.iterator();
				System.out.println();
				System.out.println("List products before change ");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				while (iterator.hasNext()) {
					Commodity com = iterator.next();

					if (com.getName().equalsIgnoreCase(nameP)) {
						iterator.remove();
						System.out.println("Product " + nameP + " change");
					}
				}
				System.out.println();
				System.out.println("Enter name product");
				String name = sc.next();
				System.out.println("Enter length");
				int lenght = sc.nextInt();
				System.out.println("Enter width");
				int width = sc.nextInt();
				System.out.println("Enter weinght");
				int weight = sc.nextInt();
				product.add(new Commodity(name, lenght, width, weight));
				System.out.println();
				System.out.println("List products after change ");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
			}
				break;
			case 4: {
				System.out.println();
				System.out.println("List product before sorting by name");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("List product after sorting by name");
				Set<Commodity> sortName = new TreeSet<Commodity>(new ComparatorName());
				sortName.addAll(product);
				for (Commodity commodity : sortName) {
					System.out.println(commodity);
				}
				System.out.println();

			}
				break;
			case 5: {
				System.out.println();
				System.out.println("List product before sorting by lenght");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("List product after sorting by lenght");
				Set<Commodity> sortlenght = new TreeSet<Commodity>(new ComparatorLenght());
				sortlenght.addAll(product);
				for (Commodity commodity : sortlenght) {
					System.out.println(commodity);
				}
				System.out.println();
			}
				break;
			case 6: {
				System.out.println();
				System.out.println("List product before sorting by widht");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("List product after sorting by widht");
				Set<Commodity> sortwidht = new TreeSet<Commodity>(new ComparatorWidth());
				sortwidht.addAll(product);
				for (Commodity commodity : sortwidht) {

					System.out.println(commodity);
				}
				System.out.println();
			}
				break;
			case 7: {
				System.out.println();
				System.out.println("List product before sorting by weight");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("List product after sorting by weight");
				Set<Commodity> sortweight = new TreeSet<Commodity>(new ComparatorWeight());
				sortweight.addAll(product);
				for (Commodity commodity : sortweight) {

					System.out.println(commodity);
				}
				System.out.println();
			}
				break;

			case 8: {
				System.out.println();
				System.out.println("List product");
				for (Commodity commodity : product) {
					System.out.println(commodity);
				}
				System.out.println();
				System.out.println("Select search options");
				System.out.println();
				while (true) {
					menuSearch();
					switch (sc.nextInt()) {
					case 1: {
						System.out.println("Enter name product");
						String name = sc.next();
						Iterator<Commodity> iterator = product.iterator();
						boolean flag = false;
						while (iterator.hasNext()) {
							Commodity com = iterator.next();

							if (com.getName().equalsIgnoreCase(name)) {

								System.out.println("Result search -" + com.toString());
								flag = true;
								System.out.println();
							}
						}
						if (!flag) {
							System.out.println("This product not exist");
							System.out.println();
						}
					}
						break;
					case 2: {
						System.out.println("Enter lenght product");
						int lenght = sc.nextInt();
						boolean flag = false;
						Iterator<Commodity> iterator = product.iterator();
						while (iterator.hasNext()) {
							Commodity com = iterator.next();

							if (com.getLength() == lenght) {
								System.out.println("Result search -" + com.toString());
								flag = true;
								System.out.println();
							}
						}
						if (!flag) {
							System.out.println("This product not exist");
							System.out.println();
						}
					}
						break;
					case 3: {
						System.out.println("Enter lenght product");
						int width = sc.nextInt();
						boolean flag = false;
						Iterator<Commodity> iterator = product.iterator();
						while (iterator.hasNext()) {
							Commodity com = iterator.next();

							if (com.getWidth() == width) {
								System.out.println("Result search -" + com.toString());
								flag = true;
								System.out.println();
							}
						}
						if (!flag) {
							System.out.println("This product not exist");
							System.out.println();
						}
					}

						break;
					case 4: {
						System.out.println("Enter lenght product");
						int weight = sc.nextInt();
						boolean flag = false;
						Iterator<Commodity> iterator = product.iterator();
						while (iterator.hasNext()) {
							Commodity com = iterator.next();

							if (com.getWeinght() == weight) {
								System.out.println("Result search -" + com.toString());
								flag = true;
								System.out.println();
							}
						}
						if (!flag) {
							System.out.println("This product not exist");
							System.out.println();
						}
					}
						break;
					case 0: {

						break;

					}
						
					
					}
					break;

				}
				break;

			}
			case 9: {
				System.out.println("Thank you for use");
				System.exit(0);
			}
			break;
			}

		}
	}

	static void menu() {
		System.out.println("Додати товар натисніть - 1");
		System.out.println("Видалити товар - натисніть 2");
		System.out.println("Замінити товар - натисніть 3");
		System.out.println("Сортувати за назвоню - натисніть 4");
		System.out.println("Сортувати за довжиною - натисніть 5");
		System.out.println("Сортувати за шириною - натисніть 6");
		System.out.println("Сортувати за вагою - натисніть 7");
		System.out.println("Вивести елемент колекції за певним параметром - натисніть 8");
		System.out.println("Вийти з програми - натисніть 9");

	}

	static void menuSearch() {
		System.out.println("Search by name enter -1");
		System.out.println("Search by lenght enter -2");
		System.out.println("Search by width enter -3");
		System.out.println("Search by weight enter -4");
		System.out.println("Enter 0 to come back menu");
	}

}
