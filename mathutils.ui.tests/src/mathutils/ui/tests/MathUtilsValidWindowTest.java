package mathutils.ui.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class MathUtilsWindowTest extends AbstractMathUtilsWindowTest {

	@Test
	public void testValidInput() {
		assertResultGivenInput("5", "120");
	}
}
