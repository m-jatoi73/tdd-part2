import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	private String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		Method method2;
		try {
			method2 = this.getClass().getDeclaredMethod(name);
			method2.setAccessible(true);
			method2.invoke(this);
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
}