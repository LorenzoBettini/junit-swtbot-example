package mathutils.core.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import mathutils.core.MathUtils;

import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {

	private MathUtils mathUtils;
	
	@Before
	public void setUp() {
		mathUtils = new MathUtils();
	}
	
	@Test
	public void testBaseCase() {
		assertFactorial(0, 1);
	}

	@Test
	public void testNonBaseCase() {
		assertFactorial(5, 5*mathUtils.factorial(4));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeInput() {
		mathUtils.factorial(-1);
	}
	
	@Test
	public void testMemoization() {
		Integer result1 = mathUtils.factorial(5);
		Integer result2 = mathUtils.factorial(5);
		assertSame(result1, result2);
	}

	private void assertFactorial(int input, int expectedResult) {
		int result = mathUtils.factorial(input);
		assertEquals(expectedResult, result);
	}

}
