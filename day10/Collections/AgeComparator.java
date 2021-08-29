package day10.Collections;

public class AgeComparator implements java.util.Comparator<Studentcomparator> {

	@Override
	public int compare(Studentcomparator o1, Studentcomparator o2) {
		if (o1.age == o2.age) {
			return 0;
		} else if (o1.age > o2.age) {
			return -1;
		} else {
			return 1;
		}
	}

}
