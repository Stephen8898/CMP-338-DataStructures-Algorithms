import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class ArrayBasedQueue<E> implements QueueInterface<E> {

	Object[] array = new Object[10000]; 
	int first = -1;
	int last = -1;
	int size = 0;
	
	
	@Override
	public Iterator<E> iterator() {
		Vector<E> elements = new Vector<E>(array.length);
		
		int current = this.first;
		int count = 0;
		while (count < this.size) {
			elements.add((E) array[current]);
			current = this.incrementIndex(current);
			count++;
		}

		ElementIterator<E> elementIterator = new ElementIterator<>(elements);
		return elementIterator;
	}

	@Override
	public boolean isEmpty() {
		return (this.size == 0);
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void enqueue(E e) throws IllegalStateException, NullPointerException {
		if (e == null) {
			throw new NullPointerException("Unable to enque a null Object");
		} else if (this.size == this.array.length) {
			throw new IllegalStateException("Array is full, unable to enque the Object");
		} else if (this.isEmpty()) {
			this.first = 0;
			this.last = 0;
			this.array[first] = e;
		} else {
			this.last = this.incrementIndex(this.last);
			this.array[last] = e;
		}
		
		this.size++;
	}

	@Override
	public E peek() {
		if (this.isEmpty()) {
			return null;
		} else {
			E element = (E) array[this.first];
			return element;
		}
	}

	@Override
	public E dequeue() {
		if (this.isEmpty()) {
			return null;
		} else {
			E element = (E) array[this.first];
			this.first = this.incrementIndex(this.first);
			this.size--;
			return element;
		}
	}

	@Override
	public E dequeue(int index) throws NoSuchElementException {
		if ((index < 0) || (index >= this.size)) {
			throw new NoSuchElementException("The index " + index + " is invalid");
		} 
		int arrayIndex = (this.first + index) % this.array.length;
		E element = (E) array[arrayIndex];
		
		int curIndex = arrayIndex;
		int nextIndex = this.incrementIndex(curIndex);
		
		while (curIndex != this.last) {
			this.array[curIndex] = this.array[nextIndex];
			curIndex = this.incrementIndex(curIndex);
			nextIndex = this.incrementIndex(nextIndex);
		}
		
		this.last = this.decrementIndex(this.last);
		
		this.size--;
		return element;
	}

	@Override
	public void removeAll() {
		this.size = 0;
		this.first = -1;
		this.last = -1;
	}
	
	
	
	private int incrementIndex(int index) {
		index++;
		if (index >= this.array.length) {
			index = 0;
		}
		return index;
	}

	
	private int decrementIndex(int index) {
		index--;
		if (index < 0) {
			index = this.array.length - 1;
		}
		return index;
	}

	
}
