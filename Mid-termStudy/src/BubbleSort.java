import java.util.Arrays;
import java.util.Random;

public class BubbleSort implements SortInterface {

	
	static Integer [] Array = new Integer[10];
	
	public Integer[] ranArr (Integer[] array){
		
		Random ran = new Random();
		for(int i = 0; i < array.length; i++) {
				array[i] = (Integer) ran.nextInt(10);
				
				System.out.print(array[i] + ",");
		}
		System.out.println("\n "+"---------------------- ");
		
		return array;
	}
	
	
	@Override
	public void sort(Integer[] arr) {
		int i,j; 
		int temp;
		for(i = 0; i < arr.length; i++) 	
			for( j = i; j < arr.length-1; j++ ) {
				if(arr[j] > arr[j+1]) {
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	
	public static void main(String[] args) {
		
	BubbleSort bs = new BubbleSort();
		bs.sort(bs.ranArr(Array));

	}
}
