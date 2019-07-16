
public class QuickUnion {
	private int[] id;
	
	public QuickUnion(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) {	// 트리의 높이 만큼 반복시행
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean find(int p, int q) {	//트리의 높이에 의해서 수행시간결정됨
		return root(p) == root(q);
	}
	
	public void unite(int p, int q) {	//트리의 높이에 의해서 수행시간결정됨
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	

}
