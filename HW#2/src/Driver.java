import java.util.Arrays;

public class Driver implements DriverInterface {


	static BubbleSort bs;
	static InsertionSort is ;
	static SelectionSort ss;
	
	@Override
	public Integer[] createArray(ArrayType arrayType, int arraySize) {
		
	
		switch (arrayType) {
			case Equal : 
				Integer [] eArray = new Integer [arraySize];
				
				for(int i = 0; i < eArray .length; i++) {
					eArray [i] = 1;
				}
				return eArray;
			case Random : 
				Integer [] randArray = new Integer [arraySize];
				for (int i = 0; i < randArray.length; i++) {
					randArray[i] = (int) (Math.random()*100000);
				}
				return randArray;
			case Increasing : 
				Integer [] iArray = new Integer [arraySize];
				for(int i= 0; i < iArray.length; i++) {
					iArray[i] = i+1;
				}
				return iArray;
			case Decreasing :
				Integer [] dArray = new Integer [arraySize];
				for(int i = 0; i < dArray.length; i++) {
					dArray[i] = arraySize--;
				}
				return dArray;
			case IncreasingAndRandom :
				Integer [] iAndRArray = new Integer [arraySize];
				iAndRArray[0] = 1;
				
				int arr90Perc = (int) (iAndRArray.length * .90);
				for(int i =1; i < arr90Perc; i++) {
						iAndRArray[i] = i +1;
				}
				for(int i = arr90Perc; i < iAndRArray.length; i++) {
						iAndRArray[i] = (int)(Math.random() * 100000);
				}
				return iAndRArray;
		}
		
		return null;
	}

	@Override
	public TestTimes runSort(SortType sortType, ArrayType arrayType, int arraySize, int numberOfTimes) {
		// TODO Auto-generated method stub
		
		switch (sortType) {
			case BubbleSort :
				BubbleSort bs = new BubbleSort();
				Integer[] bArray;
				for(int i = 0; i < numberOfTimes; i++) {
					bArray = createArray(arrayType,arraySize);
					bs.sort(bArray);
				}
				return bs;
				
			case InsertionSort: 
				InsertionSort is = new InsertionSort();
				Integer[] iArray;
				for(int i = 0; i < numberOfTimes; i++) {
					iArray = createArray(arrayType,arraySize);
					is.sort(iArray);
				}
			return is;
				
			case SelectionSort:
				SelectionSort ss = new SelectionSort();
				Integer[] sArray;
				for(int i = 0; i < numberOfTimes; i++) {
					sArray = createArray(arrayType,arraySize);
					ss.sort(sArray);
				}
				
				return ss;
		}
		
		return null;
		
	}

	
		
	
public void sortPrint(String sortType, String arrayType, String arraySize, TestTimes run) {
		
		//1,000s		
		System.out.println(sortType + "Sort, " + arrayType + ", " + arraySize);
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println(Arrays.toString(run.getTestTimes()) + " --- " + run.getAverageTestTime());
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		
		
		Driver testDrive = new Driver();
		
		System.out.println("Bubble Sort");
		System.out.println("========================================================================");
		System.out.println();
		
		//////// Bubble sorts ///////
		//-------------------------//
		
		// 1,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.BubbleSort, ArrayType.Equal, 1000, 10);
		testDrive.sortPrint("Bubble", "Equal", "1,000", bs);
		/// 2. random
		testDrive.runSort(SortType.BubbleSort, ArrayType.Random, 1000, 10);
		testDrive.sortPrint("Bubble", "Random", "1,000", bs);
		/// 3. increasing 
		testDrive.runSort(SortType.BubbleSort, ArrayType.Increasing, 1000, 10);	
		testDrive.sortPrint("Bubble", "Increasing", "1,000", bs);
		/// 4. decreasing
		testDrive.runSort(SortType.BubbleSort, ArrayType.Decreasing, 1000, 10);	
		testDrive.sortPrint("Bubble", "Decreasing", "1,000", bs);
		/// 5. increasing and random
		testDrive.runSort(SortType.BubbleSort, ArrayType.IncreasingAndRandom, 1000, 10);	
		testDrive.sortPrint("Bubble", "Increasing & Random", "1,000", bs);
		
		// 10,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.BubbleSort, ArrayType.Equal, 10000, 10);
		testDrive.sortPrint("Bubble", "Equal", "10,000", bs);	
		/// 2. random
		testDrive.runSort(SortType.BubbleSort, ArrayType.Random, 10000, 10);
		testDrive.sortPrint("Bubble", "Random", "10,000", bs);
		/// 3. increasing 
		testDrive.runSort(SortType.BubbleSort, ArrayType.Increasing, 10000, 10);	
		testDrive.sortPrint("Bubble", "Increasing", "10,000", bs);
		/// 4. decreasing
		testDrive.runSort(SortType.BubbleSort, ArrayType.Decreasing, 10000, 10);
		testDrive.sortPrint("Bubble", "Decreasing", "10,000", bs);
		/// 5. increasing and random
		testDrive.runSort(SortType.BubbleSort, ArrayType.IncreasingAndRandom, 10000, 10);	
		testDrive.sortPrint("Bubble", "Increasing & Random", "10,000", bs);
		
		System.out.println();
		System.out.println("Insertion Sort");
		System.out.println("========================================================================");
		System.out.println();
		
		////////Insertion sorts ///////
		//-------------------------//
		
		// 1,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.InsertionSort, ArrayType.Equal, 1000, 10);
		testDrive.sortPrint("Insertion", "Equal", "1,000", is);
		/// 2. random
		testDrive.runSort(SortType.InsertionSort, ArrayType.Random, 1000, 10);
		testDrive.sortPrint("Insertion", "Random", "1,000", is);
		/// 3. increasing 
		testDrive.runSort(SortType.InsertionSort, ArrayType.Increasing, 1000, 10);	
		testDrive.sortPrint("Insertion", "Increasing", "1,000",is);
		/// 4. decreasing
		testDrive.runSort(SortType.InsertionSort, ArrayType.Decreasing, 1000, 10);	
		testDrive.sortPrint("Insertion", "Decreasing", "1,000", is);
		/// 5. increasing and random
		testDrive.runSort(SortType.InsertionSort, ArrayType.IncreasingAndRandom, 1000, 10);	
		testDrive.sortPrint("Insertion", "Increasing & Random", "1,000", is);
		
		// 10,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.InsertionSort, ArrayType.Equal, 10000, 10);
		testDrive.sortPrint("Insertion", "Equal", "10,000", is);	
		/// 2. random
		testDrive.runSort(SortType.InsertionSort, ArrayType.Random, 10000, 10);
		testDrive.sortPrint("Insertion", "Random", "10,000", is);
		/// 3. increasing 
		testDrive.runSort(SortType.InsertionSort, ArrayType.Increasing, 10000, 10);	
		testDrive.sortPrint("Insertion", "Increasing", "10,000", is);
		/// 4. decreasing
		testDrive.runSort(SortType.InsertionSort, ArrayType.Decreasing, 10000, 10);
		testDrive.sortPrint("Insertion", "Decreasing", "10,000", is);
		/// 5. increasing and random
		testDrive.runSort(SortType.InsertionSort, ArrayType.IncreasingAndRandom, 10000, 10);	
		testDrive.sortPrint("Insertion", "Increasing & Random", "10,000", is);
		
		System.out.println();
		System.out.println("Selection Sort");
		System.out.println("========================================================================");
		System.out.println();
		
		////////SelectionSorts///////
		//-------------------------//
		
		// 1,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.SelectionSort, ArrayType.Equal, 1000, 10);
		testDrive.sortPrint("Selection", "Equal", "1,000", ss);
		/// 2. random
		testDrive.runSort(SortType.SelectionSort, ArrayType.Random, 1000, 10);
		testDrive.sortPrint("Selection", "Random", "1,000", ss);
		/// 3. increasing 
		testDrive.runSort(SortType.SelectionSort, ArrayType.Increasing, 1000, 10);	
		testDrive.sortPrint("Selection", "Increasing", "1,000", ss);
		/// 4. decreasing
		testDrive.runSort(SortType.SelectionSort, ArrayType.Decreasing, 1000, 10);	
		testDrive.sortPrint("Selection", "Decreasing", "1,000", ss);
		/// 5. increasing and random
		testDrive.runSort(SortType.SelectionSort, ArrayType.IncreasingAndRandom, 1000, 10);	
		testDrive.sortPrint("Selection", "Increasing & Random", "1,000", ss);
		
		// 10,000 Integers
		/// 1. equal 
		testDrive.runSort(SortType.SelectionSort, ArrayType.Equal, 10000, 10);
		testDrive.sortPrint("Selection", "Equal", "10,000", ss);	
		/// 2. random
		testDrive.runSort(SortType.SelectionSort, ArrayType.Random, 10000, 10);
		testDrive.sortPrint("Selection", "Random", "10,000", ss);
		/// 3. increasing 
		testDrive.runSort(SortType.SelectionSort, ArrayType.Increasing, 10000, 10);	
		testDrive.sortPrint("Selection", "Increasing", "10,000", ss);
		/// 4. decreasing
		testDrive.runSort(SortType.SelectionSort, ArrayType.Decreasing, 10000, 10);
		testDrive.sortPrint("Selection", "Decreasing", "10,000", ss);
		/// 5. increasing and random
		testDrive.runSort(SortType.SelectionSort, ArrayType.IncreasingAndRandom, 10000, 10);	
		testDrive.sortPrint("Selection", "Increasing & Random", "10,000", ss);
		
	}
	
}
