
public class QuickFind {
	private int[] id;
	
	public QuickFind(int N)
	{
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	public boolean find(int p, int q) {
		return id[p] == id[q];		//1 operation : fast
	}
	
	public void unite(int p, int q) {
		int pid = id[p];
		for(int i = 0; i < id.length; i++) {	// N operations : slow
			if(id[i] == pid) {
				id[i] = id[q];
			}
		}
	}
}
