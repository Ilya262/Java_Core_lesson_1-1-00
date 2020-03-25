package Lesson14_2;

import java.util.Comparator;

public class ComparatorPerson implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getName().compareTo(o2.getName())>0) {
		return 1;}
		if(o1.getName().compareTo(o2.getName())<0) {
			return -1;}
		
		if (o1.getAge()>o2.getAge()) {
			return 1;}
			if(o1.getAge()<o2.getAge()) {
				return -1;}
			else {
			return 0;
			}
	}

}
