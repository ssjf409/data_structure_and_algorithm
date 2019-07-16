
public class QuickUnion {
	private int[] id;
	
	public QuickUnion(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) {	// Ʈ���� ���� ��ŭ �ݺ�����
		while (i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean find(int p, int q) {	//Ʈ���� ���̿� ���ؼ� ����ð�������
		return root(p) == root(q);
	}
	
	public void unite(int p, int q) {	//Ʈ���� ���̿� ���ؼ� ����ð�������
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	

}
