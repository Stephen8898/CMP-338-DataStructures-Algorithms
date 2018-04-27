import java.util.Arrays;

public class InsertionSort /*extends TestTimes */implements SortInterface {

	static Integer[] arr = {9,14,3,2,43,11,58,22};
	
	@Override
	public void sort(Integer[] arrayToSort) {
		// TODO Auto-generated method stub
	//	long startTime = System.nanoTime();
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
		System.out.println("Array = "+ Arrays.toString(a));
		//long endTime = System.nanoTime();
		//long testTime = endTime - startTime;
		
	//	addTestTime(testTime);
	}		
		public static void main(String [] rgs) {
			
			InsertionSort is = new InsertionSort();
			is.sort(arr);
		}
}
