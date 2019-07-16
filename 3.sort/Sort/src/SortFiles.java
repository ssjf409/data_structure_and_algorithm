import java.io.File;

public class SortFiles {

	public static void main(String[] args) {
		File directory = new File(args[0]);
		File[] files = directory.listFiles();
		Insertion.sort(files);
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
	

}
