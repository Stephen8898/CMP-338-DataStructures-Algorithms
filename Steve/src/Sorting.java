
public class Sorting {

	
	static int[] list = {1,4,55,6,2,2,3,6,44,2,5,7,6,4,3,56,47,96};
	
	
	
	static int[] newlist = new int[list.length];
	
	
	 public static void merge(int[] list, int fa, int la,int fb,int lb) {
		 
		 int A = fa; int B = fb; int C = fa;
		 
		 while((A<B) && (B<=lb));
		 
		 if(list[A] < list[B]) {
			 newlist[C] = list[A];
			 A++; C++;
		 }
		 else {
			 newlist[C] = list[B];
			 B++; C++;
		 }
			 while(A <= la) {
				 newlist[C] = list[A];
				 A++; C++;
				 
			while(B <= lb) {
				newlist[C] = list[B];
				 B++; C++;
			}
				 
			for(int i = fa; i <= lb; i++) {
					 list[i] = newlist[i]; 
		
			}	 
			    }
			 
			 }
	
	
	public static void mergeSort(int[] list, int first,int last) {
		
		if(first == last); //Already Sorted // only one item, do nothing
		
		else {
			int mid = (first + last)/2;
			mergeSort(list,first,mid);//sort first half
			mergeSort(list,mid+1,last);
			
			merge(list,first,mid,mid+1,last);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mergeSort(list,1,list.length-1);
		
		
	}

}
