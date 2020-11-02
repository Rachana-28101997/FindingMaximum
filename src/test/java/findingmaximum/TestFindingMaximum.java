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

}
