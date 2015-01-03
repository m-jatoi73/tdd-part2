package sibisoft.code.pair;

public class TestCaseTest {

	public void testRunning() throws Exception{

		WasRun wasRun = new WasRun("testMethod");
		assert (wasRun.wasRun);
		wasRun.run();
		assert (wasRun.wasRun);
	}

	public void testWasRun() throws Exception{

		WasRun wasRun = new WasRun("testMethod");
		assert (!wasRun.wasRun);
		wasRun.run();
		assert (wasRun.wasRun);
	}

	public static void main(String args[]) throws Exception{
		(new TestCaseTest()).testRunning();
		(new TestCaseTest()).testWasRun();
	}
}
