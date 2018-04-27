
public class MergeSort <T extends Comparable<? super T>>{

	public void sort(T[] arr) {
		Object[] tempArr = new Object[arr.length];
		mergeSort(arr,tempArr,0 ,arr.length-1);
		
	}
	
	
	private void mergeSort(T[] arr, Object[] tempArr, int first, int last) {
		int mid = (first +last) /2;
		if(first < last) {
		mergeSort(arr, tempArr, 0, mid);
		mergeSort(arr, tempArr, mid+1, last);
		merge(arr,tempArr, first, mid, last);
		}
	}
	
	private void merge(T[] arr, Object[] tempArr, int first, int mid, int last) {
		
	}
}
