import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	private String name;

	public TestCase(String name) {
		this.name = name;
	}

	public TestResult run() {
		Method method = null;
		TestResult result = null;

		try {
			result = new TestResult();
			result.testStarted();
			setUp();
			method = this.getClass().getDeclaredMethod(name);
			method.setAccessible(true);
			method.invoke(this);
			tearDown();
		}
		catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void setUp() {
	}

	public void tearDown() {
	}
}
