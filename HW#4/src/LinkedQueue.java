import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class LinkedQueue<E> implements QueueInterface<E> {

	private	Node<E> head;
	private Node<E> tail;

	private int numberOfEntries;
	
	@Override
	public Iterator<E> iterator() {

		Vector<E> elements = new Vector<E>();
		Node<E> currNode = this.head;
			while(currNode != null) {
				elements.addElement(currNode.getData());
				currNode = currNode.getNext();
			}
			ElementIterator<E> elementIterator = new ElementIterator<>(elements);
			return elementIterator;
	}

	@Override
	public boolean isEmpty() {		
		return (this.numberOfEntries == 0);
	}

	@Override
	public int size() {
		return this.numberOfEntries;
	}

	@Override
	public void enqueue(E e) throws IllegalStateException, NullPointerException {
		Node<E> newNode = new Node<E>(e);
		if (e == null) {
			throw new NullPointerException("Unable to enque a null Object");
		}
		
		else if (this.isEmpty()) {
			this.head = newNode;
			
		}else if (this.tail == null){
			this.tail = newNode;
			this.head.setNext(this.tail);
		}
			else {
				Node<E> prev = this.tail;
				Node<E> newNodeT = new Node<E>(e);
				prev.setNext(newNodeT);
				this.tail = newNodeT;
			}
			
			
			this.numberOfEntries++;
		}

		

	@Override
	public E peek() {
		if (this.isEmpty()) { 
			return null; }
		else {
			return head.getData();
			}
		}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		E element = null;
		if(this.isEmpty()) {
		return null;
		} else if (this.tail == null) {
			this.head = null;
		} else {
			element = head.getData();
			this.head = this.head.getNext();
		}
		this.numberOfEntries--;
		
		return element;
	}

	@Override
	public E dequeue(int index) throws NoSuchElementException {
		// TODO Auto-generated method stub
		E element = null;
		if (this.isEmpty()) {
			throw new NoSuchElementException("This index does not contain an element");
			
		} else {
			element = this.head.getData();
			this.head = head.getNext();
			this.numberOfEntries--;
		}
		return element;
	}

	@Override
	public void removeAll() {
		this.head = null;
		this.tail = null; 
		this.numberOfEntries = 0;
	}
	
}