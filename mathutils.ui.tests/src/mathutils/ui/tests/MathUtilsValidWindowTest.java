package mathutils.ui.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class MathUtilsValidWindowTest extends AbstractMathUtilsWindowTest {

	@Test
	public void testBaseCase() {
		assertResultGivenInput("0", "1");
	}

	@Test
	public void testValidInput() {
		assertResultGivenInput("5", "120");
	}
}
