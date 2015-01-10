public class WasRun extends TestCase {
	 
	public boolean wasRun;
	public boolean wasSetup;
	public String log;
	
	public WasRun(String name) {
		super(name);
		this.wasRun = false;
	}
	
	private void testMethod(){
		wasRun=true;
		log = log+"testMethod";
	}
	
	public void setUp(){
		this.log = "setUp";
		testMethod();
		this.log = this.log + "testMethod";
		tearDown();
		this.log = this.log + "tearDown";
	}
	
	public void wasSetup() {
		wasRun=false;
		wasSetup=true;
		log="wasSetup";
	}
}
