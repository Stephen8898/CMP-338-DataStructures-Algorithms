import java.util.Vector;

public class HeapSort<T extends Comparable<? super T>> extends TestTimes{

	// This is a MAX-HEAP (each node is bigger or equal to
	// it's children)
	private Vector<T> heap = new Vector<T>();
	private int heapSize = 0;

	private long startTime;
	private long endTime;
	protected long TestTime;
	
	TestTimes hS = new TestTimes(){{
		setTimeUnits(TimeUnits.MicroSeconds);
		setMemoryUnits(MemoryUnits.KiloBytes);
	}};
	
	public Vector<T> getHeap() {
		return heap;
	}

	public void setHeap(Vector<T> heap) {
		this.heap = heap;
		this.heapSize = heap.size();
		this.heapify();
	}
	
	public void sort(T[] array) {
		startTime = System.nanoTime();
		
		Vector<T> v = new Vector<T>();
		for ( int i = 0 ; i < array.length ; i++ ) {
			v.add(array[i]);
		}
		this.setHeap(v);
		
		while (this.heapSize >= 1) {
			int last = this.heapSize - 1;
			this.swap(0, last);
			this.heapSize--;
			this.heapify();
			
		}
		
		for ( int i = 0 ; i < array.length ; i++ ) {
			array[i] = this.heap.elementAt(i);
		}
		
		
		endTime = System.nanoTime();
		
		TestTime = endTime - startTime;
		
		
		hS.addTestTime(TestTime);
	}
	

	/**************************************************/
	/*                private methods                 */
	/**************************************************/

	private void heapify() {
		int last = this.heapSize - 1;
		int parent = (last - 1) / 2;

		while (parent >= 0) {
			siftDown(parent);
			parent--;
		}
	}

	private void siftDown(int node) {
		while (node < this.heapSize) {
			int leftChild = (2 * node) + 1;
			int rightChild = (2 * node) + 2;

			T root = this.heap.elementAt(node);
			int max = node;

			if (leftChild < this.heapSize) {
				T left = this.heap.elementAt(leftChild);
				if (root.compareTo(left) < 0) {
					max = leftChild;
				}
			}

			if (rightChild < this.heapSize) {
				T right = this.heap.elementAt(rightChild);
				if (this.heap.elementAt(max).compareTo(right) < 0) {
					max = rightChild;
				}
			}
			
			if (max == node) {
				return;
			} else {
				this.swap(node, max);
				node = max;
			}
		}
	}
	
	private void swap(int i, int j) {
		T temp = this.heap.elementAt(i);
		this.heap.setElementAt(this.heap.elementAt(j), i);
		this.heap.setElementAt(temp, j);
	}

	private void showHeap() {
		System.out.print("Heap = [");
		for ( int i = 0 ; i < this.heapSize ; i++ ) {
			if ( i == this.heapSize - 1) {
				System.out.print(this.heap.elementAt(i));
			} else {
				System.out.print(this.heap.elementAt(i) + ", ");
			}
		}
		System.out.println("]\n\n");
	}
	
}
