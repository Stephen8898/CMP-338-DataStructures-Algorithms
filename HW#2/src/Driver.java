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
				
				for(int i = 0; i < eArray.length; i++) {
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
						iAndRArray[i] = i+1;
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

	static Driver dr =new Driver();
	
	public static void runBS() {
		
		ArrayType arrt [] = {ArrayType.Equal, ArrayType.Random, ArrayType.Increasing, ArrayType.Decreasing, ArrayType.IncreasingAndRandom};
		
		for(ArrayType aType : arrt) {
			
			System.out.println("TestTimes \n" + Arrays.toString(dr.runSort(SortType.BubbleSort, aType, 1000, 10).getTestTimes()) + "\n AverageTimes: " + dr.runSort(SortType.BubbleSort, aType, 1000, 10).getAverageTestTime());
			System.out.println("TestTimes10K: \n"+ Arrays.toString(dr.runSort(SortType.BubbleSort, aType, 10000, 10).getTestTimes()) + "\n AverageTimes10K: " + dr.runSort(SortType.BubbleSort, aType, 10000, 10).getAverageTestTime());
		}
	}
	
	public static void runIS() {
		
		ArrayType arrt [] = {ArrayType.Equal, ArrayType.Random, ArrayType.Increasing, ArrayType.Decreasing, ArrayType.IncreasingAndRandom};
		
		for(ArrayType aType : arrt) {
			
			System.out.println("TestTimes \n" + Arrays.toString(dr.runSort(SortType.InsertionSort, aType, 1000, 10).getTestTimes()) + "\n AverageTimes: " + dr.runSort(SortType.InsertionSort, aType, 1000, 10).getAverageTestTime());
			System.out.println("TestTimes10K: \n" + Arrays.toString(dr.runSort(SortType.InsertionSort, aType, 10000, 10).getTestTimes()) + "\n AverageTimes10K: " + dr.runSort(SortType.InsertionSort, aType, 10000, 10).getAverageTestTime());
		}
	}
	
	public static void runSS() {
		
		ArrayType arrt [] = {ArrayType.Equal, ArrayType.Random, ArrayType.Increasing, ArrayType.Decreasing, ArrayType.IncreasingAndRandom};
		
		for(ArrayType aType : arrt) {
			
			System.out.println("TestTimes \n" + Arrays.toString(dr.runSort(SortType.SelectionSort, aType, 1000, 10).getTestTimes()) + "\n AverageTimes: " + dr.runSort(SortType.SelectionSort, aType, 1000, 10).getAverageTestTime());
			System.out.println("TestTimes10K: \n" + Arrays.toString(dr.runSort(SortType.SelectionSort, aType, 10000, 10).getTestTimes()) + "\n AverageTimes10K: " + dr.runSort(SortType.SelectionSort, aType, 10000, 10).getAverageTestTime());
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("BubbleSort \n");
		runBS();
		System.out.println("\n InsertionSort---------------------------------------------------------------- \n");
		runIS();
		System.out.println("\n selectionSort---------------------------------------------------------------- \n");
		runSS();
		
	}
	
}
