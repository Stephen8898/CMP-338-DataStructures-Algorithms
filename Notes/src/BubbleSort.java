

public class BubbleSort extends TestTimes implements SortInterface {

	@Override
	public void sort(Integer[] arrayToSort) {
		// TODO Auto-generated method stub
	
		long startTime = System.nanoTime();
		int temp = 0;
		for(int i = 0; i < arrayToSort.length-1; i++) {
			for(int j = 0; j < arrayToSort.length-1; j++) {
				if(arrayToSort[j] > arrayToSort[j+1]) {
					temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
				}
				}
		}
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;
		
		addTestTime(testTime);
		
	}

}
