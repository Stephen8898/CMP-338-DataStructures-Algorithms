

public class SelectionSort /*extends TestTimes*/ implements SortInterface {

	@Override
	public void sort(Integer[] arrayToSort) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		Integer[] a = arrayToSort;
		int i, j, minI, temp ;
		
		for(i = 0; i < a.length-1; i++ ) {
			minI = i;
			
			for(j = i+1; j < a.length; j++)
				if(a[j] < a[minI]) {
					minI = j;
				}
					

			if(minI < j) {
				temp = a[i];
				a[i] = a[minI];
				a[minI] = temp;
			}
		}
	
	
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;
		
		//addTestTime(testTime);
	}

}
