package findingmaximum;

public class FindingMaximum {

	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}

	public float compare(Float o1, Float o2) {
		return o1.compareTo(o2);
	}

	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

	
	
	public static void main(String[] args) {
		System.out.println("****WELCOME TO FIND MAXIMUM AMONG GIVEN SET****");
		System.out.println("Maximum integer" +maximum(1000, 400, 22));
		System.out.println("Maximum float" + maximum(2.3f, 7.8f, 9.0f));
		System.out.println("Maximum String" + maximum("Apple","Peach","Banana"));
	}
		private static <T extends Comparable <T>>T maximum(T a,T b,T c){
			T max=a;
		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}
}
