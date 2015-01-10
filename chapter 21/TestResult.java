public class TestResult {

	Integer runCount= 1;

	public String summary(){
		return "run, 0 failed" + this.runCount;
	}

	public void testStarted(){
		runCount = runCount+1;
	}
}
