public class TestCaseTest extends TestCase {

	private WasRun test = null;
	private TestResult result = null;

	TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	@Override
	public void setup() {
		result = new TestResult();
	}

	public void testTemplateMethod() {
		test = new WasRun("testMethod");
		test.run(this.result);
		assert("setUp testMethod tearDown " == test.log);
		System.out.println("setUp testMethod tearDown " == test.log);
	}

	public void testRunning() {
		test.run(this.result);
		assert test.wasRun;
	}

	public void testSetUp() {
		test = new WasRun("testMethod");
		test.run(this.result);
		assert("setUp testMethod" == test.log);
		System.out.println("setUp testMethod" == test.log);
	}

	public void testResult(){
		test = new WasRun("testMethod");
		test.run(this.result);
		assert("1 run, 0 failed" == this.result.summary());
		System.out.println("1 run, 0 failed" == this.result.summary());
	}

	public void testFailedResult(){
		test = new WasRun("testBrokenMethod");
		test.run(this.result);
		assert("1 run, 1 failed" == this.result.summary());
		System.out.println("1 run, 1 failed" == this.result.summary());
	}

	public void testFailedResultFormatting(){
		this.result.testStarted();
		this.result.testFailed();
		assert("1 run, 1 failed" == this.result.summary());
		System.out.println("1 run, 1 failed" == this.result.summary());
	}

	public void testSuite(){
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run(this.result);
		assert("2 run, 1 failed" == this.result.summary());
		System.out.println("2 run, 1 failed" == this.result.summary());
	}

	public static void main(String[] args) {
		TestSuite suite = new TestSuite();
		TestResult result = new TestResult();
		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		suite.add(new TestCaseTest("testFailedResultFormatting"));
		suite.add(new TestCaseTest("testFailedResult"));
		suite.add(new TestCaseTest("testSuite"));
		suite.run(result);
		System.out.println(result.summary());
	}
}
