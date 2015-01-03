

public class WasRun extends TestCase {
	 
	public boolean wasRun;
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
}
