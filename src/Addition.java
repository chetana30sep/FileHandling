
public class Addition {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(10, 20);
		a.average(10, 20, 30);
	}
	
	public float average(int a, int b, int c) {
		float avg = (a+b+c)/3;
		return avg;
	}

}
