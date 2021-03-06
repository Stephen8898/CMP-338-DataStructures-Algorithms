
import java.util.Random;




public class Driver implements DriverInterface {

	//Random rand = new Random();
	
	@Override
	public Integer[] createArray(ArrayType arrayType, int arraySize) {
		
		Integer [] arrayNew = new Integer [arraySize];
		
		switch (arrayType) {
			case Equal : 
				for(int i = 0; i < arrayNew.length; i++)
					arrayNew[i] = 1;
				break;
			case Random : 
				for (int i = 0; i < arrayNew.length; i++)
					arrayNew[i] = (int) (Math.random()*1000);
				break;
			case Increasing : 
				for(int i= 0; i < arrayNew.length; i++)
					arrayNew[i] = i+1;
				break;
			case Decreasing :
				for(int i = 0; i < arrayNew.length; i++) 
					arrayNew[i] = arraySize-1;
				break;
			case IncreasingAndRandom :
				//for(int i = 0; i < arrayNew.length; i++) {
					
				//}
					
				
		}
		
		return arrayNew;
	}

	@Override
	public TestTimes runSort(SortType sortType, ArrayType arrayType, int arraySize, int numberOfTimes) {
		// TODO Auto-generated method stub
		
		switch (sortType) {
			case BubbleSort :
				BubbleSort bs = new BubbleSort();
				switch (arrayType) {
				case Increasing :
					for(int i = 0; i < numberOfTimes; i++)
						bs.sort(createArray(arrayType, arraySize));
					break;
				case Random : 
					for(int i = 0; i < numberOfTimes; i++)
						bs.sort(createArray(arrayType,arraySize));
					break;
				case Decreasing :
					for(int i = 0; i < numberOfTimes; i++)
						bs.sort(createArray(arrayType,arraySize));
					break;
				case Equal:
					for(int i = 0; i < numberOfTimes; i++)
						bs.sort(createArray(arrayType,arraySize));
					break;
				case IncreasingAndRandom:
					for(int i = 0; i < numberOfTimes; i++)
						bs.sort(createArray(arrayType,arraySize));
					break;
				}
				return bs;
				
			case InsertionSort: 
				InsertionSort is = new InsertionSort();
				switch (arrayType) {
				case Increasing:
					for(int i = 0; i < numberOfTimes; i++)
					is.sort(createArray(arrayType, arraySize));
					break;
				case Random:
					for(int i = 0; i < numberOfTimes; i++)
						is.sort(createArray(arrayType, arraySize));
					break;
				case Decreasing:
					for(int i = 0; i < numberOfTimes; i++)
						is.sort(createArray(arrayType, arraySize));
					break;
				case Equal:
					for(int i = 0; i < numberOfTimes; i++)
						is.sort(createArray(arrayType, arraySize));
					break;
				case IncreasingAndRandom:
					for(int i = 0; i < numberOfTimes; i++)
						is.sort(createArray(arrayType, arraySize));
					break;
				}
			return is;
				
			case SelectionSort:
				SelectionSort ss = new SelectionSort();
				switch (arrayType) {
				case Increasing:
					for(int i = 0; i < numberOfTimes; i++)
						ss.sort(createArray(arrayType,arraySize));
					break;
				case Random:
					for(int i = 0; i < numberOfTimes; i++)
						ss.sort(createArray(arrayType,arraySize));
					break;
				case Decreasing:
					for(int i = 0; i < numberOfTimes; i++)
						ss.sort(createArray(arrayType,arraySize));
					break;
				case Equal:
					for(int i = 0; i < numberOfTimes; i++)
						ss.sort(createArray(arrayType,arraySize));
					break;
				case IncreasingAndRandom:
					for(int i = 0; i < numberOfTimes; i++)
						ss.sort(createArray(arrayType,arraySize));
					break;
				}
				
				return ss;
		}
		
		return null;
		
	}

	
	public static void main(String[] args) {
		
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		
		ArrayType eq;
		
		Driver d = new Driver();
		
		
		
		
		
	}
	
	
}
