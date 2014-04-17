package mathutils.ui.tests;

import mathutils.ui.MathUtilsWindow;

import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.SWTBotTestCase;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractMathUtilsWindowTest extends SWTBotTestCase {

	protected SWTBot bot;

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

	protected void assertResultGivenInput(String input, String expectedResult) {
		bot.textWithLabel("input").setText(input);
		bot.button("Compute").click();
		assertEquals(expectedResult, bot.textWithLabel("result").getText());
	}

}
