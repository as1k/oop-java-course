package problem4;

import java.util.Comparator;

public class ChNameComparator implements Comparator<Chocolate>{
	public int compare(Chocolate a, Chocolate b) {
		return a.getName().compareTo(b.getName());
	}
}