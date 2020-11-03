package findingmaximum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import findingmaximum.FindingMaximum;
public class TestFindingMaximum {
	
@BeforeClass
public static void print() {

	System.out.println("In Before class");
}

@Test
public void testMaximumAtFirstPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>();
	Integer result = maximum.testMaximum(1000, 200, 35);
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(1000), result);
}

@Test
public void testMaximumAtSecondPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>();
	Integer result = maximum.testMaximum(111, 222, 30);
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(222), result);
}

@Test
public void testMaximumAtThirdPosition_testAssertionHappy() {
	FindingMaximum<Integer> maximum = new FindingMaximum<Integer>();
	Integer result = maximum.testMaximum(111, 222, 333);
	System.out.println(result);
	Assert.assertEquals(Integer.valueOf(333), result);
}
@Test
public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>();
	Float result = maximum.testMaximum(222.52f, 221.25f, 135.6f);
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(222.52f), result);
}
@Test
public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>();
	Float result = maximum.testMaximum(112.34f, 234.89f, 125.78f);
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(234.89f), result);
}

@Test
public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
	FindingMaximum<Float> maximum = new FindingMaximum<Float>();
	Float result = maximum.testMaximum(200.89f, 223.25f, 8935.6f);
	System.out.println(result);
	Assert.assertEquals(Float.valueOf(8935.6f), result);
}
@Test
public void testMaximumAtFirstPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>();
	String result=maximum.testMaximum("Rachana","Dhani","Ashi");
	System.out.println(result);
	Assert.assertEquals("Rachana", result);
}

@Test
public void testMaximumAtSecondPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>();
	String result=maximum.testMaximum("Ashi", "Chai", "Boby");
	System.out.println(result);
	Assert.assertEquals("Chai", result);
}

@Test
public void testMaximumAtThirdPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>();
	String result=maximum.testMaximum("Ashi", "Gheetha", "Ramya");
	System.out.println(result);
	Assert.assertEquals("Ramya", result);
}
@Test
public void testMaximumAtFourthPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>();
	String result = maximum.testMaximum("Arshi","Bhanu","Chai","Dhanya");
	System.out.println(result);
	Assert.assertEquals("Dhanya", result);
}

@Test
public void testMaximumAtFifthPositionForString_testAssertionHappy() {
	FindingMaximum<String> maximum = new FindingMaximum<String>();
	String result = maximum.testMaximum("Arshi","Bhanu","Chai","Dhanya","Eleana");
	System.out.println(result);
	Assert.assertEquals("Eleana", result);
}
}
