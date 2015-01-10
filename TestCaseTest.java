public class TestCaseTest {

	WasRun wasRun = null;
	
	public void setup() {
		wasRun = new WasRun("testMethod");
		testTemplateMethod();
		wasRun.run();
		assert("setUp testMethod " == wasRun.log);
	}
	
	void testTemplateMethod() {
		wasRun = new WasRun("testMethod");
		wasRun.run();
		assert("setUp testMethod tearDown " == wasRun.log);
	}

	public void testRunning() {
		wasRun.run();
		assert wasRun.wasRun;
	}
	
	public void testSetUp() {
		wasRun.run();
		assert("setUp testMethod" == wasRun.log);
	}
	
	public static void main(String[] args) {
		TestCaseTest t = new TestCaseTest();
		t.setup();
		t.testRunning();
		t.testSetUp();
	}
}
