package practice;

public class Merge {
	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
		if(hi <= lo + 1) return;
		int m = lo + (hi - lo) / 2;
		sort(a, aux, lo, m);
		sort(a, aux, m, hi);
		merge(a, aux, lo, m, hi);
	}
	
	public static void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length);
		
	}

}
