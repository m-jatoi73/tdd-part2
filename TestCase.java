

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {

	public String name;
	
	public void run() throws Exception {
		try{
			Method method = this.getClass().getDeclaredMethod(this.name);
			method.invoke(this);
		}
		catch(NoSuchMethodException nE){
			nE.printStackTrace();
		}
		catch(InvocationTargetException itc){
			itc.printStackTrace();
		}
		catch (IllegalArgumentException ex){
			ex.printStackTrace();
		}
	}

}
