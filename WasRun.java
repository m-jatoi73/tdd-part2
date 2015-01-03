package sibisoft.code.pair;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {
	 
	public boolean wasRun;
	public String name;
	public boolean wasSetup;
	
	public WasRun(String name){
		this.wasRun = false;
		this.name = name;
	}
	
	public void wasSetupUp(){
		wasSetup = true;
	}
	
	public void testMethod(){
		this.wasRun = true;
	}
	
	public void run() throws Exception{
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
