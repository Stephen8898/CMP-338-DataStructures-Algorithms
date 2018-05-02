
public class MergeSort <T extends Comparable<? super T>>{

	public void sort(T[] arr) {
		Object[] tempArr = new Object[arr.length];
		mergeSort(arr,tempArr,0 ,arr.length-1);
		
	}
	
	
	private void mergeSort(T[] arr, Object[] tempArr, int first, int last) {
		int mid = (first +last) /2;
		if(first < last) {
		mergeSort(arr, tempArr, first, mid);
		mergeSort(arr, tempArr, mid+1, last);
		merge(arr,tempArr, first, mid, last);
		}
	}
	
	private void merge(T[] arr, Object[] tempArr, int first, int mid, int last) {
	
		int first1 = first;
		int first2 = mid+1;
		
		int last1 = mid;
		int last2 = last;
		
		int index = first;
		
		while((first1 <= last1) && (first2 <= last2)) {
			if(arr[first1].compareTo(arr[first2]) < 0) {
				tempArr[index++] = arr[first1++];
			}else {
				tempArr[index++] = arr[first2++];
			}
			
			while(first1 <= last1) { 
				tempArr[index++] = arr[first2++];
				
			}
			for(int i = first; i < last; i++) {
				arr[i] = (T) tempArr[i];
			}
		}
	}
}
