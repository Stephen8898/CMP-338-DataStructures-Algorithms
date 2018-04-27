

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
	
	
	
	public static void main(String[] args) {
	
		Driver d = new Driver();
		
		QueueInterface<String> qi = d.createQueue(QueueType.ArrayBasedQueue, QueueTestType.Dequeue);
		
		System.out.println(qi);
		
		
	}

}
