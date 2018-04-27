


public class BetterArray<T extends Comparable<? super T>> {
	
	private final int DEFAULT_ARRAY_LENGTH = 10;
	private final int EMPTY = -1;
	
	private int currentIndex;
	
	Object[] array;
	
	public BetterArray () {
		array = new Object[DEFAULT_ARRAY_LENGTH];
		this.currentIndex = EMPTY;
	}
	
	public BetterArray(int length) {
		array = new Object[length];
		this.currentIndex = EMPTY;
	}
	
	public boolean isEmpty() {
		return (currentIndex == EMPTY);
	}
	
	public int size() {
		return this.currentIndex + 1;
	}
	
	public void addElement(T element) {
		if (this.isFull()) {
			this.resizeArray();
		}
		this.array[++this.currentIndex] = element;
	}
	
	@SuppressWarnings("unchecked")
	public T getElement(int index) throws IndexOutOfBoundsException {
		T element = null;
		
		if ((index > EMPTY) && (index < this.array.length) && (index <= this.currentIndex)) {
			element = (T) this.array[index];
		} else {
			this.throwException("Invalid index = " + index);
		}
		
		return element;
	}
	//Edited from void to Comparable
	public T replaceElement(T element, int index) throws IndexOutOfBoundsException {
		if ((index > EMPTY) && (index < this.array.length) && (index <= this.currentIndex)) {
			this.array[index] = element;
		} else {
			this.throwException("Invalid index = " + index);
		}
		return element;
	}
	
	//Edited from void to boolean
	public boolean insertElement(T element, int index) throws IndexOutOfBoundsException {
		if (this.isEmpty() && index == 0) {
			this.addElement(element);
			return true;
		}
		
		if ((index > EMPTY) && (index < this.array.length) && (index <= this.currentIndex)) {
			if (this.isFull()) {
				this.resizeArray();
			}
			
			for (int i = this.currentIndex ; i >= index ; i-- ) {
				this.array[i+1] = this.array[i];
			}

			this.array[index] = element;
			this.currentIndex++;
			return true;
		} else {
			this.throwException("Invalid index = " + index);
			return false;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void insertElementSorted(T element) {
		if (this.isEmpty()) {
			this.addElement(element);
		} else {
			int i = 0;
			while ((i <= this.currentIndex) && (((T)(this.array[i])).compareTo(element) < 0)) {
				i++;
			}
			
			if (i > this.currentIndex) {
				this.addElement(element);
			} else {
				this.insertElement(element, i);
			}
		}		
	}
	
	//Edited from void to boolean
	public boolean removeElement(int index) throws IndexOutOfBoundsException {
		if ((index > EMPTY) && (index < this.array.length) && (index <= this.currentIndex)) {
			for(int i = index; i < this.currentIndex; i++) {
				this.array[i] = this.array[i+1];
				
			}
			this.currentIndex--;
			return true;
		}else {this.throwException("Invalid index =" + index);
		
		return false; }
		
		
	}
	
	public void resetArray() {
		this.currentIndex = EMPTY;
	}
	
	@Override
	public String toString() {
		String s = "{";
		
		for ( int i = 0 ; i <= this.currentIndex ; i++ ) {
			if (i < this.currentIndex) {
				s = s + this.array[i] + ", ";
			} else {
				s = s + this.array[i];
			}
		}
		
		s = s + "}\n";
		s = s + "currentIndex = " + this.currentIndex + "\n";
		
		return s;
	}

	/***********************************************************/
	/*            		Private Methods						 */
	/***********************************************************/

	private boolean isFull() {
		return (currentIndex == (array.length - 1));
	}

	private void resizeArray() {
		Object[] newArray = new Object[this.array.length * 2];
		
		for ( int i = 0 ; i < this.array.length ; i++ ) {
			newArray[i] = this.array[i];
		}
		
		this.array = newArray;
	}
	
	private void throwException(String errorMessage) {
		IndexOutOfBoundsException e = new IndexOutOfBoundsException(errorMessage);
		throw e;
	}
}
