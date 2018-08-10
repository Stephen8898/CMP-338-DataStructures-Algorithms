

public class Driver implements DriverInterface {

	@Override
	public QueueInterface<String> createQueue(QueueType queueType, QueueTestType queueTestType) {
		// TODO Auto-generated method stub
		
		
		
		switch(queueType) {
			case ArrayBasedQueue:
					switch(queueTestType) {
					case Enqueue:
					ArrayBasedQueue<String>	qi = new  ArrayBasedQueue<String>();
						
						return qi;
					case Dequeue :
						ArrayBasedQueue<String> dequi = new  ArrayBasedQueue<String>();
						
						for(int i = 1; i <= 10000; i++) {
							dequi.enqueue("String " + i);
						}
						return dequi;
					case Iterate :
						ArrayBasedQueue<String> itr = new  ArrayBasedQueue<String>();
						for(int i = 1; i <= 10000; i++ ) {
							itr.enqueue("String " + i );
							
						}
						
						return  itr;
					
					}
			
				case LinkedQueue: 
				switch (queueTestType) {
				case Enqueue:
					LinkedQueue<String> qi = new LinkedQueue<String>();
					
					return qi;
					
				case Dequeue:
					LinkedQueue<String> ldeq = new LinkedQueue<String>();
					
						for(int i = 1; i<= 10000; i++) {
							ldeq.enqueue("String "+ i);
						}
					
					return ldeq;
					
					
					
				case Iterate:
					LinkedQueue<String> itr = new LinkedQueue<String>();
						
						for(int i = 1; i <= 10000; i++) {
							itr.enqueue("String "+ i);
						}
						
					return itr;
					
					

				default:
					break;
				}
				
			
			}
		
		
		return null;
	}

	@Override
	public StackInterface<String> createStack(StackType stackType, StackTestType stackTestType) {
		// TODO Auto-generated method stub
		
		switch(stackType) {
			case ArrayBasedStack:
				switch(stackTestType) {
				case Push:
					ArrayBasedStack<String> parr = new ArrayBasedStack<String>();
						
						return parr;
				case Pop:
					ArrayBasedStack<String> poparr = new ArrayBasedStack<String>();
						for(int i = 1; i <= 10000; i++) {
							poparr.push("String "+ i);
					}
					return poparr;
					
				case Iterate:
					ArrayBasedStack<String> itarr = new ArrayBasedStack<String>();
					for(int i = 1; i <= 10000; i++) {
						itarr.push("String "+ i);
					}
					return itarr;
				}
				
			case LinkedStack:
				switch(stackTestType){
				case Push:
					LinkedStack<String> lstack = new LinkedStack<String>();
					
					return lstack;
					
				case Pop:
					LinkedStack<String> lpopstack = new LinkedStack<String>();
					
					for(int i = 1; i <= 10000; i++) {
						lpopstack.push("String "+ i);
						}
					return lpopstack;
					
				case Iterate:
					LinkedStack<String> litstack = new LinkedStack<String>();
					
					for(int i = 1; i <= 10000; i++) {
						litstack.push("String "+ i);
						}
					
					return litstack;
			}	
				
		}
		
		return null;
	}

	@Override
	public TestTimes runQueueTestCase(QueueType queueType, QueueTestType queueTestType, int numberOfTimes) {
		// TODO Auto-generated method stub
		
		switch (queueType) {
			case ArrayBasedQueue:
				TestTimes t = new TestTimes() {{
				
				setTimeUnits(TimeUnits.MicroSeconds);
				setMemoryUnits(MemoryUnits.KiloBytes);
				}};
				
				for(int i = 0; i < numberOfTimes; i++) {
					long startTime = System.nanoTime();
					
					this.createQueue(QueueType.ArrayBasedQueue, queueTestType);
					
					long endTime = System.nanoTime();
					long testTime = endTime - startTime;
					t.addTestTime(testTime);
				}
				
				return t;
				
			case LinkedQueue:
				TestTimes lt = new TestTimes() {{
					
					setTimeUnits(TimeUnits.MicroSeconds);
					setMemoryUnits(MemoryUnits.KiloBytes);
					}};
					
					for(int i = 0; i < numberOfTimes; i++) {
						long startTime = System.nanoTime();
						
						this.createQueue(QueueType.LinkedQueue, queueTestType);
						
						long endTime = System.nanoTime();
						long testTime = endTime - startTime;
						lt.addTestTime(testTime);
					}
					
					return lt;
		}
		
		return null;
	}

	@Override
	public TestTimes runStackTestCase(StackType stackType, StackTestType stackTestType, int numberOfTimes) {
		// TODO Auto-generated method stub
		
		switch (stackType) {
		case ArrayBasedStack:
			TestTimes t = new TestTimes() {{
			
			setTimeUnits(TimeUnits.MicroSeconds);
			setMemoryUnits(MemoryUnits.KiloBytes);
			}};
			
			for(int i = 0; i < numberOfTimes; i++) {
				long startTime = System.nanoTime();
				
				this.createStack(StackType.ArrayBasedStack, stackTestType);
				
				long endTime = System.nanoTime();
				long testTime = endTime - startTime;
				t.addTestTime(testTime);
			}
			
			return t;
			
		case LinkedStack:
			TestTimes lt = new TestTimes() {{
				
				setTimeUnits(TimeUnits.MicroSeconds);
				setMemoryUnits(MemoryUnits.KiloBytes);
				}};
				
				for(int i = 0; i < numberOfTimes; i++) {
					long startTime = System.nanoTime();
					
					this.createStack(StackType.LinkedStack, stackTestType);
					
					long endTime = System.nanoTime();
					long testTime = endTime - startTime;
					lt.addTestTime(testTime);
				}
				
				return lt;
		}
		
		return null;
	}
	
	
	public void printQueue() {
		
		System.out.println("////////////////////////////////////////////////// QUEUES ////////////////////////////////////////////////////////////");
		System.out.println();
		
		for (QueueTestType type: QueueTestType.values()) {
		
		String format = "                  %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s";
		
		/* ENQUEUE METHOD*/
		
		System.out.printf("Running test: %s \n", type);
		System.out.printf(format, 
				"Run 1", "Run 2", "Run 3", "Run 4", "Run 5", "Run 6", "Run 7", "Run 8", "Run 9", "Run 10", "Average\n");
		System.out.printf(format, 
				"Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro\n");
		System.out.printf(format, 
				"Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds\n");
		System.out.printf(format, 
				"_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______\n");
		
		//////////////////////////////////////////////////
		
		double [] printRuns = this.runQueueTestCase(QueueType.ArrayBasedQueue, type, 10).getTestTimes();
		double avgSeconds = this.runQueueTestCase(QueueType.ArrayBasedQueue, type, 10).getAverageTestTime();
		
		System.out.printf("%s ", QueueType.ArrayBasedQueue);
		
		for(int i = 0; i < printRuns.length; i++) {
			System.out.printf(" %9s", printRuns[i]);
		}
		System.out.printf("   %-7s   ", avgSeconds);
		
		//////////////////////////////////////////////////
		
		double [] printLRuns = this.runQueueTestCase(QueueType.LinkedQueue, type, 10).getTestTimes();
		double avgLSeconds = this.runQueueTestCase(QueueType.LinkedQueue, type, 10).getAverageTestTime();
		
		System.out.println();
		System.out.printf("%s ", QueueType.LinkedQueue);
		
		for(int i = 0; i < printLRuns.length; i++) {
			System.out.printf("     %-2s", printLRuns[i]);
		}
		System.out.printf("      %-2s", avgLSeconds);
		
		System.out.println();
		System.out.println();
		
		//////// BYTES //////
		
		String lineFormat = "                %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  ";
		String lines = "----------";
		
		System.out.printf("Running test: %s \n", type);
		System.out.printf(format, 
				"Run 1", "Run 2", "Run 3", "Run 4", "Run 5", "Run 6", "Run 7", "Run 8", "Run 9", "Run 10", "Average\n");
		System.out.printf(format, "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo\n");
		System.out.printf(format, 
				"Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes\n");
		System.out.printf(lineFormat, 
				lines, lines, lines, lines, lines, lines, lines, lines, lines, lines, "---------\n");
		
		//////////////////////////////////////////////////
		
		double [] printSize = this.runQueueTestCase(QueueType.ArrayBasedQueue, type, 10).getMemoryUsages();
		double avgSize = this.runQueueTestCase(QueueType.ArrayBasedQueue, type, 10).getAverageMemoryUsage();
		
		System.out.printf("%s", QueueType.ArrayBasedQueue);
		
		for(int i = 0; i < printSize.length; i++) {
			System.out.printf(" %9s", printSize[i]);
		}
		System.out.printf("   %-7s   ", avgSize);
		
		//////////////////////////////////////////////////
		
		double [] printLSize = this.runQueueTestCase(QueueType.LinkedQueue, type, 10).getTestTimes();
		double avgLSize = this.runQueueTestCase(QueueType.LinkedQueue, type, 10).getAverageTestTime();
		
		System.out.println();
		System.out.printf("%s ", QueueType.LinkedQueue);
		
		for(int i = 0; i < printLSize.length; i++) {
			System.out.printf("     %-2s", printLSize[i]);
		}
		System.out.printf("      %-2s", avgLSize);
		
		System.out.println();
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		}
	}
	
	public void printStack() {
		
		System.out.println();
		System.out.println();
		System.out.println("/////////////////////////////////////////// STACKS //////////////////////////////////////////////////////////");
		
		
		for (StackTestType type: StackTestType.values()) {
		
		String format = "                  %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s   %-7s";
		
		/* ENQUEUE METHOD*/
		
		System.out.printf("Running test: %s \n", type);
		System.out.printf(format, 
				"Run 1", "Run 2", "Run 3", "Run 4", "Run 5", "Run 6", "Run 7", "Run 8", "Run 9", "Run 10", "Average\n");
		System.out.printf(format, 
				"Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro", "Micro\n");
		System.out.printf(format, 
				"Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds", "Seconds\n");
		System.out.printf(format, 
				"_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______", "_______\n");
		
		//////////////////////////////////////////////////
		
		double [] printRuns = this.runStackTestCase(StackType.ArrayBasedStack, type, 10).getTestTimes();
		double avgSeconds = this.runStackTestCase(StackType.ArrayBasedStack, type, 10).getAverageTestTime();
		
		System.out.printf("%s ", StackType.ArrayBasedStack);
		
		for(int i = 0; i < printRuns.length; i++) {
			System.out.printf(" %9s", printRuns[i]);
		}
		System.out.printf("   %-7s   ", avgSeconds);
		
		//////////////////////////////////////////////////
		
		double [] printLRuns = this.runStackTestCase(StackType.LinkedStack, type, 10).getTestTimes();
		double avgLSeconds = this.runStackTestCase(StackType.LinkedStack, type, 10).getAverageTestTime();
		
		System.out.println();
		System.out.printf("%s ", StackType.LinkedStack);
		
		for(int i = 0; i < printLRuns.length; i++) {
			System.out.printf("     %-2s", printLRuns[i]);
		}
		System.out.printf("      %-2s", avgLSeconds);
		
		System.out.println();
		System.out.println();
		
		//////// BYTES //////
		
		String lineFormat = "                %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  %9s  ";
		String lines = "----------";
		
		System.out.printf("Running test: %s \n", type);
		System.out.printf(format, 
				"Run 1", "Run 2", "Run 3", "Run 4", "Run 5", "Run 6", "Run 7", "Run 8", "Run 9", "Run 10", "Average\n");
		System.out.printf(format, "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo", "Kilo\n");
		System.out.printf(format, 
				"Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes", "Bytes\n");
		System.out.printf(lineFormat, 
				lines, lines, lines, lines, lines, lines, lines, lines, lines, lines, "---------\n");
		
		//////////////////////////////////////////////////
		
		double [] printSize = this.runStackTestCase(StackType.ArrayBasedStack, type, 10).getMemoryUsages();
		double avgSize = this.runStackTestCase(StackType.ArrayBasedStack, type, 10).getAverageMemoryUsage();
		
		System.out.printf("%s", StackType.ArrayBasedStack);
		
		for(int i = 0; i < printSize.length; i++) {
			System.out.printf(" %9s", printSize[i]);
		}
		System.out.printf("   %-7s   ", avgSize);
		
		//////////////////////////////////////////////////
		
		double [] printLSize = this.runStackTestCase(StackType.LinkedStack, type, 10).getTestTimes();
		double avgLSize = this.runStackTestCase(StackType.LinkedStack, type, 10).getAverageTestTime();
		
		System.out.println();
		System.out.printf("%s ", StackType.LinkedStack);
		
		for(int i = 0; i < printLSize.length; i++) {
			System.out.printf("     %-2s", printLSize[i]);
		}
		System.out.printf("      %-2s", avgLSize);
		
		System.out.println();
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		}
	}
	
	
	public static void main(String[] args) {

		Driver driver = new Driver();
		
//		String format = "%-40s%s%n";
		
		driver.printQueue();
		driver.printStack();
		
	}

}
