


public class InsertionSort extends TestTimes implements SortInterface {

	
	@Override
	public void sort(Integer[] arrayToSort) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		Integer [] a = arrayToSort;
		int i,j,temp;
		for(i = 1; i < a.length;) {
			j=i;
		while (j > 0) {
			if(a[j-1] > a[j]) {
				temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp; 
			} else {break;}
			j--;
		}
		i++;
		}
		
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;
		
		addTestTime(testTime);
	}		
		
}
