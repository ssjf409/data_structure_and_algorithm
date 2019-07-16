package practice;

public class Date implements Comparable<Date>{
	private int month, day, year;
	
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	public int compareTo(Date b) {
		Date a = this;
		if(a.year < b.year) return -1;
		if(a.year > b.year) return +1;
		if(a.month < b.month) return -1;
		if(a.month > b.month) return +1;
		if(a.day < b.day) return -1;
		if(a.day > b.day) return +1;
		return 0;
		
		
	}
}
