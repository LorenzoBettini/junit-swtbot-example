package mathutils.ui.tests;

import mathutils.ui.MathUtilsWindow;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.SWTBotTestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class MathUtilsWindowTest extends SWTBotTestCase {

	private SWTBot bot;

	@BeforeClass
	public static void setupApp() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				final MathUtilsWindow window = new MathUtilsWindow();

				window.open();
			}
		}).start();
	}

	@Before
	public final void setupSWTBot() {
		bot = new SWTBot();
	}

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

	@Test
	public void testValidInput() {
		assertResultGivenInput("5", "120");
	}

	private void assertResultGivenInput(String input, String expectedResult) {
		bot.textWithLabel("input").setText(input);
		bot.button("Compute").click();
		assertEquals(expectedResult, bot.textWithLabel("result").getText());
	}
}
