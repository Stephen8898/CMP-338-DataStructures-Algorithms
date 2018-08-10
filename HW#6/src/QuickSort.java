import java.util.Random;

public class QuickSort<T extends Comparable<? super T>> extends TestTimes implements SortInterface<T> {

	
	public void sort(T[] array) {
		
		long startTime = System.nanoTime();
		
		
		quickSort(array, 0, array.length - 1);
	
		
		long endTime = System.nanoTime();
		long testTime = endTime - startTime;

		addTestTime(testTime);
	}

	
	
	/**************************************************/
	/*               		 added                    */
	/**************************************************/
	
	public static enum PivotType {FirstElement, RandomElement, MidOfFirstMidLastElement};
	
	
	public PivotType currentPivot = PivotType.FirstElement;
	
	
	
	
	public PivotType getPivotType() {
		return currentPivot;
	}
	
	public void setPivotType(PivotType pivotType) {
		currentPivot = pivotType;
	}
	
	
	public static PivotType[] values() {
		PivotType[] pivot = new PivotType [3];
		
		for (PivotType c : PivotType.values())
		    System.out.println(c);
		
		return pivot;
	}
	
	public static PivotType valueOf(String name) {
		
		if (name == null) {
			throw new NullPointerException();	
		}else if(name == "First") {
			return PivotType.FirstElement;
		}else if(name == "Random") {
			return PivotType.RandomElement;	
		}else if(name == "Mid") {
			return PivotType.MidOfFirstMidLastElement;
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	
	
	
	/**************************************************/
	/*                private methods                 */
	/**************************************************/

	private void quickSort(T[] array, int first, int last) {
		int pivotIndex;
		if (first < last) {
			pivotIndex = partition(array, first, last);
			quickSort(array, first, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, last);
		}
	}

	private int partition(T[] array, int first, int last) {
		choosePivot(array, first, last);
		T pivot = array[first];
		
		T tempItem;
		int firstUnknown;
		int lastS1 = first;
		
		for ( firstUnknown = first + 1 ; firstUnknown <= last ; firstUnknown++ ) {
			if (array[firstUnknown].compareTo(pivot) < 0) {
				lastS1++;
				tempItem = array[firstUnknown];
				array[firstUnknown] = array[lastS1];
				array[lastS1] = tempItem;
			}
		}
		
		tempItem = array[first];
		array[first] = array[lastS1];
		array[lastS1] = tempItem;
		
		return lastS1;
	}
	
	public void choosePivot(T[] array, int first, int last) {
		int mid = (first + last) / 2;
		
		T temp = array[first];
		T f = array[first];
		T m = array[mid];
		T l = array[last];
		
		if(currentPivot == PivotType.MidOfFirstMidLastElement) {
			if(((f.compareTo(m) <= 0) && (l.compareTo(m) >= 0)) || 
				((f.compareTo(m) >= 0) && (l.compareTo(m) <= 0))) {
			
			array[first] = array[mid];
			array[mid] = temp;
			
			}else if(((f.compareTo(l) <= 0) && (m.compareTo(l) >= 0)) ||
					((f.compareTo(l) >= 0) && (m.compareTo(l) <= 0))){
		
			array[first] = array[last];
			array[last] = temp;
			
		}
			}else if(currentPivot == PivotType.RandomElement){
				Random random = new Random();
				int rand = first + random.nextInt(last - first);
				array[first] = array[rand];
				array[rand] = temp;
			}
	}
}