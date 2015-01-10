public class TestResult {

	Integer runCount= 0;
	Integer errorCount= 0;

	public String summary(){
		return this.runCount+" run, "+this.errorCount+" failed";
	}

	public void testStarted(){
		runCount = runCount+1;
	}

	public void testFailed() {
		this.errorCount = this.errorCount + 1;
	}
}
