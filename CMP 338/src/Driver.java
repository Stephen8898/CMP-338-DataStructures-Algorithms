import java.util.Arrays;

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
	
	static TestTimes tt = new TestTimes();
	static Driver d = new Driver();
	public TestTimes runCases() {
		
		TestTimes tt = new TestTimes();
		System.out.println(Arrays.toString(tt.getTestTimes()) + "------"+ tt.getAverageTestTime());
		return tt;
	}
	
	public static void run() {
		
		TestType  tType [] = {TestType.AddSortedOdd, TestType.AddSortedEven, TestType.AddAll, TestType.AddAllAtIndexZero, TestType.RemoveAllEven, TestType.RemoveAllOdd};
		for(TestType t : tType ) {
			
			System.out.println(Arrays.toString(d.runTestCase(ListType.ArrayBasedList, t, 10).getTestTimes()) + "\n AverageTime: "+ d.runTestCase(ListType.ArrayBasedList, t, 10).getAverageTestTime() + "\n MemoryUsage: " +
			d.memoryUsage());
			//System.out.println(Arrays.toString(d.runTestCase(ListType.LinkedList, t, 10).getTestTimes()));
		}
	
	}
	public static void runList() {
	
		TestType  tType [] = {TestType.AddSortedOdd, TestType.AddSortedEven, TestType.AddAll, TestType.AddAllAtIndexZero, TestType.RemoveAllEven, TestType.RemoveAllOdd};
		for(TestType t : tType ) {
			
			System.out.println(Arrays.toString(d.runTestCase(ListType.LinkedList, t, 10).getTestTimes()) + "\n AverageTime: "+ d.runTestCase(ListType.LinkedList, t, 10).getAverageTestTime() + "\n MemoryUsage: " +
			d.memoryUsage());
		}
	
	}
	 
	public static void main(String[] args) {
		
		
	//d.runTestCase(ListType.ArrayBasedList, d.run(), 10).getTestTimes();
	//d.runTestCase(ListType.LinkedList, d.run(), 10).getTestTimes();
	System.out.println("ArrayList--------------------------------------- ");
	d.run();
	System.out.println("\n LinkedList----------------------------------------------- \n");
	d.runList();
	
    //d.runTestCase(ListType.ArrayBasedList, TestType.AddSortedEven, 10).getAverageTestTime();
	//System.out.print(tt.getAverageTestTime());
	
		//BinarySearch driver = new BinarySearch();
		
	
	
						
	//System.out.println(Arrays.toString(tt.getTestTimes()));
//	System.out.println(tt.getAverageTestTime());
//	System.out.println(tt.getLastTestTime());

	}
}
