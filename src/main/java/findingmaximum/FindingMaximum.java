package findingmaximum;


	
	public class FindingMaximum <T extends Comparable<T>> {

		public static <T extends Comparable<T>> T testMaximum(T... var) {
			T max = var[0];
			for(T type: var) {
				if(type.compareTo(max) > 0)
					max = type;
			}
			return max;
		}
		public static <T> void printTheMaximumValue(T max) {
			System.out.println(" Maximum: "+max);
		}
	
	public static void main(String[] args) {
		System.out.println("****WELCOME TO FIND MAXIMUM AMONG GIVEN SET****");
		
	}
		
}
