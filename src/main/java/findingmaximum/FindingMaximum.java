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

	public static int maxInteger(Integer a, Integer b, Integer c) {
		int max = a;

		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}

	public static float maxFloat(Float a, Float b, Float c) {
		float max = a;
		if (b.compareTo(a) > 0.0)
			max = b;
		if (c.compareTo(b) > 0.0)
			max = c;
		return max;
	}

	public static String maxString(String a, String b, String c) {
		String max = a;
		if (b.compareTo(a) > 0)
			max = b;
		if (c.compareTo(b) > 0)
			max = c;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("****WELCOME TO FIND MAXIMUM AMONG GIVEN SET****");
		System.out.println("Maximum integer" + maxInteger(1000, 400, 22));
		System.out.println("Maximum float" + maxFloat(2.3f, 7.8f, 9.0f));
		System.out.println("Maximum float" + maxString("Apple","Peach","Banana"));
	}
}
