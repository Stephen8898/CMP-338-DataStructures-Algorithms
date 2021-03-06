

public class TestTimes implements TestTimesInterface {
	
	private long [] testTimes = new long [10]; 
	private int index = 0;
	
  @Override
	public void addTestTime(long runTime) {

	
		
		if (index < testTimes.length ) {
			testTimes[index++] = runTime;
		} else {
			for(int i = 0; i < testTimes.length-1; i++) {
				testTimes[i] = testTimes[i+1];
			}
			testTimes[9]= runTime;
		}
	}
  

	@Override
	public double getAverageTestTime() {
		
		double counter = 0;
		double avg = 0;
		if (this.index <= 10) {
		for(int i = 0; i < this.index; i++) 
			counter = testTimes[i] + counter;
		}
		if(counter == 0) {
					avg = 0;
		}else { 
			avg = counter/this.index;
		}
			
		return avg;	
		}
			
	
  
	@Override
	public long getLastTestTime() {
		
		if(this.index > 0) {
			return testTimes[this.index-1];	
		}
		else {return 0;
		}
		
	}

	@Override
	public long[] getTestTimes() {
		return testTimes;
	}

	@Override
	public void resetTestTimes() {
		for (int i =0; i < testTimes.length; i++) {
			this.testTimes[i] = 0;
		}
		this.index = 0;
	}


}
