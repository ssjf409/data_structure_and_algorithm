package practice;

public class Domain implements Comparable<Domain> {
	private String[] fields;
	private int N;
	public Domain(String name) {
		fields = name.split("\\.");
		N = fields.length;
		// 오름차순 정렬
	}
	public int compareTo(Domain b) {
		Domain a = this;
		for(int i = 0; i < Math.min(a.N, b.N); i++) {
			int c = a.fields[i].compareTo(b.fields[i]);
			if		(c < 0) return -1;
			else if	(c > 0) return +1;
		}
		return a.N - b.N;
	}

}
