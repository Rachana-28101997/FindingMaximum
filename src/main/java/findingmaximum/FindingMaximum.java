package findingmaximum;

public class FindingMaximum {
	
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

	public static int maxInteger(Integer a, Integer b, Integer c) {
		int max = a;

		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}
public static void main(String[] args) {
	System.out.println("****WELCOME TO FIND MAXIMUM AMONG GIVEN SET****");
	System.out.println("Maximum integer" +maxInteger(1000,400,22));
}
}
