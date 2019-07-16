
public class File implements Comparable<File>{
	public int compareTo(File b) {
		return -1;  
	}
	
	public static void sort(Comparable[] a) {
		int n = a.length;
		for(int i = 0; i < N; i++) {
			for(int j = i; j > 0; j--) {
				if(a[j].compareTo(a[j-1]))
					exch(a, j, j-1);
				else break;
			}
		}
	}
	
	public static void merge(Comparable[] a, Comparable[] aux,
			int l, int m, int r) {
		for(int k = l; k < r; k++) aux[k] = a[k]l;
		int i = l, j = m;
		for(int k = l; k < r; k++) {
			if 		(i >= m)			a[k] = aux[j++];
			else if	(j >= r)			a[k] = aux[i++];
			else if	(less(aux[j], aux[i]))	a[k] = aux[j++];
			else						a[k] = aux[i++];
		}
				
			}
}
