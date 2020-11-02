package findingmaximum;

public class FindingMaximum <T extends Comparable<T>>{

	T a;
	T b;
	T c;
	
	public FindingMaximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public <T extends Comparable<T>> T testMaximum() {
		T max = (T) a;
		if (b.compareTo(a) > 0) {
			max = (T) b;
		}
		if (c.compareTo(b) > 0) {
			max = (T) c;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		System.out.println("****WELCOME TO FIND MAXIMUM AMONG GIVEN SET****");
	
	}
		
}
