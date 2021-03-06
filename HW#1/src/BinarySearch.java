



public class BinarySearch extends TestTimes implements SearchInterface{


	@Override
	public int search(int[] listOfNumbers, int target) {
		int index = -1;
		
		long startTime = System.nanoTime();
		// do Binary Search
		
		int upper = listOfNumbers.length-1; 
		int lower = 0;
		int mid;
		
		
		while (lower <= upper) {
			mid = (upper + lower) /2;
		
			if (listOfNumbers[mid] == target) {
					index = mid;
					break;
			}
			else if (target > listOfNumbers[mid]) {
				lower = mid+1;
			} 
			else {
				upper = mid-1;
				}
		}
		
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;
		
		addTestTime(testTime);
		
		return index;
		

	}
}
