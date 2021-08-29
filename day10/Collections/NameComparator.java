package day10.Collections;

public class NameComparator implements java.util.Comparator<Studentcomparator> {

	@Override
	public int compare(Studentcomparator o1, Studentcomparator o2) {
		return o1.name.compareTo(o2.name);
	}

}
