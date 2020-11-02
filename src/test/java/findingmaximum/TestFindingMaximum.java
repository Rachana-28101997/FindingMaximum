package findingmaximum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
public class TestFindingMaximum {
	
@BeforeClass
public static void print() {

	System.out.println("In Before class");
}

@Test
public void testMaximumAtFirstPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>(1000, 200, 35);
	Integer result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(1000), result);
}

@Test
public void testMaximumAtSecondPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>(111, 222, 30);
	Integer result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(222), result);
}

@Test
public void testMaximumAtThirdPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>(111, 222, 333);
	Integer result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(333), result);
}
@Test
public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>(222.52f, 221.25f, 135.6f);
	Float result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(222.52f), result);
}
@Test
public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>(112.34f, 234.89f, 125.78f);
	Float result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(234.89f), result);
}

@Test
public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>(200.89f, 223.25f, 8935.6f);
	Float result = maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(8935.6f), result);
}
@Test
public void testMaximumAtFirstPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>("Rachana","Dhani","Ashi");
	String result=maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals("Rachana", result);
}

@Test
public void testMaximumAtSecondPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>("Ashi", "Chai", "Boby");
	String result=maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals("Chai", result);
}

@Test
public void testMaximumAtThirdPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>("Ashi", "Gheetha", "Ramya");
	String result=maximum.testMaximum();
	System.out.println(result);
	Assert.assertEquals("Ramya", result);
}

}
