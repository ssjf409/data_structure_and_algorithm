package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void selcet(Comparable[] a, int k) {
		StdRandom.shuffle(a);
		int l = 0;
		int r = a.length - 1;
		while(r > 1) {
			int m = partition(a, l, r);
			if 		(m > k) r = m - 1;
			else if (m < k) l = m + 1;
			else return;
		}
	}
	
	//3 way partition	
	private static void sort(Comparable[] a, int l, int r) {
		if(r <= l) return;
		int i = l-1, j = r;
		int p = l-1, q = r;
		
		while(true) {
			while(less(a[++i], a[r]));
			while(less(a[r], a[--j])) if(j == l) break;
			if(i >= j) break;
			exch(a, i, j);
			if(eq(a[i], a[r])) exch(a, ++p, i);
			if(eq(a[j], a[r])) exch(a, --q, j);
			
		}
		exch(a, i, r);
		
		j = i - l;
		i = i + l;
		for(int k = l; k <= p; k++) exch(a, k, j--);
		for(int k = r-1; k >= q; k--) exch(a, k, i++);
		
		sort(a, l, j);
		sort(a, i, r);
	}
	
	
}
