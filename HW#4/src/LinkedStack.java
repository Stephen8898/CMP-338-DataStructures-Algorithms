import java.util.Iterator;
import java.util.Vector;

public class LinkedStack<E> implements StackInterface<E> {

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
		// TODO Auto-generated method stub
		return (this.numberOfEntries == 0);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.numberOfEntries;
	}

	@Override
	public void push(E e) throws IllegalStateException, NullPointerException {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(e);
		//LinkedQueue<E> lq = new LinkedQueue<E>();
		if (e == null) {
			throw new NullPointerException("Unable to enque a null Object");
		}
		
		else if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
			
		}else if (this.head == null){
			this.head = newNode;
			this.tail.setPrev(this.head);
		}
			else {
				newNode.setNext(this.head);
				this.head.setPrev(newNode);
				this.head = newNode;
			}
			
			
			this.numberOfEntries++;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		
		if(this.isEmpty()){
			return null;
		}else {
			return this.head.getData();
		}
		
	}

	@Override
	public E pop() {
		E element = null;
		if(this.isEmpty()) {
		return null;
		} else if (this.head == null) {
			this.tail = null;
		} else {
			element = head.getData();
			this.head = this.head.getNext();
		}
		this.numberOfEntries--;
		
		return element;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.head = null;
		this.tail = null;
		this.numberOfEntries = 0;
	}

}
