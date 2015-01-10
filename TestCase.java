import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	private String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		Method method = null;
		
		try {
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
	}

	public void tearDown() {
	}
}