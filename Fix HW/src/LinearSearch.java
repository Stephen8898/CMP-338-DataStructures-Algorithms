


public class LinearSearch extends TestTimes implements SearchInterface {


	@Override
	public int search(int[] listOfNumbers, int target) {
		// TODO Auto-generated method stub 
		int index = -1;
		
		long startTime = System.nanoTime();
		// do linearSearch
		
		for (int i = 0; i < listOfNumbers.length; i++) {
			if (listOfNumbers[i] == target) 
			return i; 
			 
			if(i > target) {
				break;
			}
		}
	
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;
		
		addTestTime(testTime);
		System.out.println(testTime);
		return index;
		}

}



