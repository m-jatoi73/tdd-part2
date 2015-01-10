import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	private String name;
	protected TestResult result;

	public TestCase(String name) {
		this.name = name;
	}

	public TestResult run(TestResult result) {
		Method method = null;

		try {
			result.testStarted();
			setup();
			method = this.getClass().getDeclaredMethod(name);
			method.setAccessible(true);
			method.invoke(this);
			tearDown();
		}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
			result.testFailed();
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
			result.testFailed();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
			result.testFailed();
		}
		catch (InvocationTargetException e) {
			e.printStackTrace();
			result.testFailed();
		}
		return result;
	}

	public void setup() {
	}

	public void tearDown() {
	}
}
