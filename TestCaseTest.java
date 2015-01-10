public class TestCaseTest {

	WasRun wasRun = null;
	
	public void setup() {
		wasRun = new WasRun("testMethod");
	}
	
	public void testRunning() {
		wasRun.run();
		assert wasRun.wasRun;
	}
	
	public void testSetUp() {
		wasRun.run();
		assert wasRun.wasSetup;
	}
	
	public static void main(String[] args) {
		TestCaseTest t = new TestCaseTest();
		t.setup();
		t.testRunning();
		t.testSetUp();
	}
}
