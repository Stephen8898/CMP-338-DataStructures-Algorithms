



public class Driver implements DriverInterface {

	@Override
	public int[] getListOfNumbers() {
			int[] listOfNum = new int[10000000];
		    for (int i = 0; i < listOfNum.length;)
		    	listOfNum[i] = ++i;
		    
			return listOfNum;
		}

	@Override
	public int[] getTargets() {
		
		int [] values = {500,10000,100000,1000000,5000000,7500000,10000000};
	
		return values;
	}

	@Override
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		LinearSearch ls = new LinearSearch();
	
		for(int i = 0; i < numberOfTimes; i++ ) {
			ls.search(listOfNumbers, target);
		}
		return ls; 
	}

	@Override
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		BinarySearch bs = new BinarySearch();
		
		for(int i = 0; i < numberOfTimes; i++ ) {
			bs.search(listOfNumbers, target);
		}
		return bs; 
	}

	public static void main(String[] args) {
	
		Driver d = new Driver();
		TestTimes ts = new TestTimes();
		LinearSearch ls = new LinearSearch();
		BinarySearch bs = new BinarySearch();
		
		//System.out.println(Arrays.toString(d.getTargets()));
		System.out.println(ts.getAverageTestTime());
		
		
	}
}
