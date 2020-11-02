package findingmaximum;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import findingmaximum.FindingMaximum;
public class TestFindingMaximum {
	static FindingMaximum maximum;
@BeforeClass
public static void findMaximumObj() {
	maximum = new FindingMaximum();
	System.out.println("In Before class");
}

@Test
public void testMaximumAtFirstPosition_testAssertionHappy() {
	int result = maximum.maxInteger(500, 200, 30);
	Assert.assertEquals(500,result);
}

@Test
public void testMaximumAtSecondPosition_testAssertionHappy() {
	int result = maximum.maxInteger(101, 222, 38);
	Assert.assertEquals(222,result);
}

@Test
public void testMaximumAtThirdPosition_testAssertionHappy() {
	int result = maximum.maxInteger(1000, 267, 2987);
	Assert.assertEquals(2987,result);
}
@Test
public void testMaximumAtFirstPositionForFloat_testAssertionHappy() {
	float result = maximum.maxFloat(100.2f, 22.256f, 35.6f);
	Assert.assertEquals(result, 100.00, 0.25);
}
@Test
public void testMaximumAtSecondPositionForFloat_testAssertionHappy() {
	float result = maximum.maxFloat(10.0f, 222.256f, 35.6f);
	Assert.assertEquals(result, 222.006, 0.25);
}

@Test
public void testMaximumAtThirdPositionForFloat_testAssertionHappy() {
	float result = maximum.maxFloat(10.0f, 22.2f, 35.6f);
	Assert.assertEquals(result, 35.00, 0.6);
}

}
