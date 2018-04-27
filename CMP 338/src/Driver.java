

public class Driver implements DriverInterface {


	@Override  
	public ListInterface<Integer> createList(ListType listType, TestType forTestType) {

		ListInterface<Integer> li = null;
		
		switch(listType) {
			case LinkedList:
				li = new LinkedList<Integer>();
				break;
			case ArrayBasedList:
				li = new ArrayBasedList<Integer>();
				break;
		}
			
		switch (forTestType) {
		case AddSortedEven:
			li = initializeList(li, 1, 9999, 2);
			
	//		for(int i = 0; i < li.size(); i=+2 ) {
			
		//	}
			
			break;
		case RemoveAllEven:
			li = initializeList(li,1,10000,1);
				
			break;
		case AddSortedOdd:
			li = initializeList(li,0,0,0);
			
			break;
		case RemoveAllOdd:
			li = initializeList(li,1,10000,1);
			
			break;
			
		case AddAll:
			li = initializeList(li,0,0,0);
			
			break;
			
		case AddAllAtIndexZero:
			li = initializeList(li,0,0,0);
			break;
		
		default:
			break;
		}
		
		
		return li;
	}

	@Override
	public ListInterface<Integer> initializeList(ListInterface<Integer> list, int firstNumber, int lastNumber,
			int increment) {
		
		
		for(int i = firstNumber; i < lastNumber; i = i + increment) {
			list.add(i);
		}
		
		
		
		return list;
	}

	@Override
	public double memoryUsage() {
		long megabytes = 1024L * 1024L;
		Runtime rt = Runtime.getRuntime();
		double tM = (double) rt.totalMemory();
		double fM = (double) rt.freeMemory();
		double	t = tM-fM;
		double memory = t/megabytes;
		return memory;
	}

	@Override
	public TestTimes runTestCase(ListType listType, TestType testType, int numberOfTimes) {
		//This is were the methods addSorted and remove all will be tested.
		TestTimes t =new TestTimes();
		Driver d = new Driver();
	
	
		for(int i = 0; i < numberOfTimes; i++) {
			//System.out.print("Run" + (i +1) + ("  "));
			long startTime = System.nanoTime();
			
			d.createList(listType, testType);
			
			long endTime = System.nanoTime();
			long testTime = endTime - startTime;
			
				t.addTestTime(testTime);
		}
	
	return t;
	}
	
	
	public static void main(String[] args) {
		Driver d = new Driver();
		TestTimes tt = new TestTimes();
		
		
		
	System.out.print(d.runTestCase(ListType.ArrayBasedList, TestType.AddSortedEven, 10) );

	//System.out.print(tt.getAverageTestTime());
	
	}
}
