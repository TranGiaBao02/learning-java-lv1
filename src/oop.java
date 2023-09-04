  
public class oop {
	private int day, month, year;
	
	public oop(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void printDay() {
		System.out.println("Day: " + this.day);
	}
	
	public void printDate() {
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}
	
}
