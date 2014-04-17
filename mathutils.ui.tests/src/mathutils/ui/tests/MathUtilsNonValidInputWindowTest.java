package mathutils.ui.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class MathUtilsNonValidInputWindowTest extends AbstractMathUtilsWindowTest {

	@Test
	public void testEmptyInput() {
		assertResultGivenInput(" ", "Empty input");
	}

	@Test
	public void testNonValidIntegerInput() {
		assertResultGivenInput("foo", "Not a valid input");
	}

	@Test
	public void testNonValidInput() {
		assertResultGivenInput("-1", "Not a valid input");
	}

}
