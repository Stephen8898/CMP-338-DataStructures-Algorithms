import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
	
	static int [] listOfNum = new int [10]; 
	
	//static Random rand = new Random();
	//static int i = rand.nextInt(10000000);
	public static int[] sortarray(int [] value) 
	{
	  for (int i = 0; i < value.length; i++)  
	{  
	  for(int  a = i+1; a < value.length; a++){  
	                if(value[a] < value[i]){  
	                    int temp = value[i];  
	                value[i] = value[a];  
	                    value[a] = temp;  
	                    
	                   System.out.println(value[a]); 
	                }   
	            }   
	         }  return value;     
	     }   

	
	
	
	public static int[] getListOfNum() {
		int[] listOfNum = new int[100];
	    for (int i = 0; i < listOfNum.length-1; )
	    	listOfNum[i] = ++i;
	    
		
	    	
	    
	 
	   
	    System.out.println(Arrays.toString(listOfNum));
		return listOfNum;
	}
	
	static Integer testTimes[] = {2,3,6,5,42,0,0,0,0};
	
	public static double getAvgTestTime() {
		
		double sum = 0; 
		int counter = 0;
		for(int i = 0; i < testTimes.length;i++) 
		//	if(testTimes[i] != 0) {
				sum = testTimes[i] + sum;
					counter++;
				double avg = sum/counter;
				return avg;
		//} 
			
			
			
		}
	public void sort(Integer[] arrayToSort) {
		// TODO Auto-generated method stub
		//long startTime = System.nanoTime();
		
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
		System.out.println(Arrays.toString(arrayToSort));
		}
	
	Random rand = new Random();
	
	static Integer[] arr = new Integer[10];
	public void decArray(Integer[] arrayNew) {
		for(int i = arrayNew.length-1; i >= 0; i--) {
				arrayNew[i] = i;
				
				System.out.println(i);
			}
		
		//System.out.println(arrayNew[i]);
	}
	
	

	public static void main(String[] args) {
		
		//System.out.println(getListOfNum());
		//System.out.println(getAvgTestTime());
		Test t = new Test();
		//t.sort(testTimes);
		t.decArray(arr);
	}


}
