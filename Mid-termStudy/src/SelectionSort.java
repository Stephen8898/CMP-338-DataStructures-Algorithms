import java.util.Arrays;

public class SelectionSort {

	static int[] arr = {13,4,453,2,21,35,78,66,5,56,8,6,3,9,10,7,64,8};
	
	public void sort(int[] num) {
		int i,j,temp,min=0;
		for(i = 0; i< num.length-1; i++) { 
			min = i;
		for(j = i + 1; j < num.length; j++) {
			if (num[j] < num[min]) {
				min = j;
			}
		}
		temp = num[i];
		num[i] = num[min];
		num[min] = temp;
	}
		System.out.println(Arrays.toString(num));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSort ss = new SelectionSort();
		ss.sort(arr);
		
	}

}
