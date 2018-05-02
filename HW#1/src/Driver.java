



public class Driver implements DriverInterface {

	private static int[] listOfNum = new int[10000000];
	private static long[] testTimes = new long [10]; 
	private static int [] values = {500,10000,100000,1000000,5000000,7500000,10000000};
	
	@Override
	public int[] getListOfNumbers() {
		int numCount = 1;
		    for (int i = 0; i < listOfNum.length; i++) {
		    	listOfNum[i] = numCount++;
		    }
			return Driver.listOfNum;
		}

	@Override
	public int[] getTargets() {
		return values;
	}

	@Override
	public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
		LinearSearch ls = new LinearSearch();
		listOfNumbers = getListOfNumbers();
		
		for(int i = 0; i < numberOfTimes; i++ ) {
			ls.search(listOfNumbers, target);
		}
		return ls; 
	}

	@Override
	public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
		BinarySearch bs = new BinarySearch();
		listOfNumbers = getListOfNumbers();
		
		
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
