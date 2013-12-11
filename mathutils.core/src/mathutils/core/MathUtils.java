package mathutils.core;

public class MathUtils {

	public Integer factorial(int input) {
		if (input == 0)
			return 1;
		if (input < 0)
			throw new IllegalArgumentException();
		return input * factorial(input-1);
	}

}
