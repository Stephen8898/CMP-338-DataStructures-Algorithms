
public class LinkedList <I extends Comparable <? super I>> implements ListInterface<I>{

	private LinkedListNode<I> head;
	private LinkedListNode<I> tail;
	
	private int numOfEntries;
	
	public LinkedList() {
		 this.head = null;
		 this.tail = null;
		 this.numOfEntries = 0; 
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.numOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return ( this.numOfEntries  == 0);
		
	}

	@Override
	public void add(I element) {
		// TODO Auto-generated method stub
		LinkedListNode<I> newNode = new LinkedListNode<I>(element);
		
		if(this.isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
			
		}
		this.numOfEntries++;
	}

	@Override
	public boolean add(I element, int index) {
		// TODO Auto-generated method stub
		if(index <= this.numOfEntries) {
			LinkedListNode<I> newNode = new LinkedListNode<I>(element);
			
			if(index == 0 ) {
				if(this.isEmpty()) {
					this.head =newNode; 
					this.tail =newNode;
				}
				// put in front
				newNode.setNext(this.head);
				this.head = newNode;
			} else if (index == this.numOfEntries) {
						tail.setNext(newNode);
						this.tail = newNode;
				// put in back
				} else {
					int curIndex = 0;
					LinkedListNode<I> curNode = this.head;
					while(curIndex < index-1) {
						index++;
						curNode = curNode.getNext();
					}
					newNode.setNext(curNode.getNext());
					curNode.setNext(newNode);
					// put at specified index
				}
				this.numOfEntries++;
			return true;
		}else {
		return false;
		}
	}

	@Override
	public void addSorted(I element) {
		// TODO Auto-generated method stub
		LinkedListNode<I> newNode = new LinkedListNode<I>(element);
			
		if(this.isEmpty()) {
			// empty list
			this.head = newNode;
			this.tail = newNode;
		}else if (element.compareTo(head.getData()) < 0){
			// element is smaller than head element replace head
			newNode.setNext(this.head);
			this.head = newNode;
			}
		else if (element.compareTo(tail.getData()) > 0) {
			//element is greater than tail, replace tail
			tail.setNext(newNode);
			this.tail = newNode;
		}	else {
			LinkedListNode<I> curNode = head;
			LinkedListNode<I> prevNode = null;
			while (element.compareTo(curNode.getData()) > 0) {
				curNode = curNode.getNext();
			}
			prevNode = curNode;
			curNode = curNode.getNext();
			newNode.setNext(curNode);
			prevNode.setNext(newNode);
		
			
		}
		
		this.numOfEntries++;
	}

	@Override
	public I get(int index) {
		if ((index <= this.numOfEntries) && (index >= 0)){
			LinkedListNode<I> curNode = head;
			int curIndex = 0;
			
			while(curIndex < index) {
				curNode = curNode.getNext();
				curIndex++;
				
			}
			return curNode.getData();
			
		}else {
		return null;}
	}

	@Override
	public I replace(I element, int index) {
		if ((index <= this.numOfEntries) && (index >= 0)){
			LinkedListNode<I> curNode = head;
			int curIndex = 0;
			
			while(curIndex < index) {
				curNode = curNode.getNext();
				curIndex++;
				
			}
			I curElement = curNode.getData();
			curNode.setData(element);
			return curElement;
			
		}else {
		return null;}
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		if ((index <= this.numOfEntries) && (index >= 0)) {
			
			LinkedListNode<I> curNode = head;
			LinkedListNode<I> previousNode = null;
			int curIndex = 0;
			
			while(curIndex < index) {
				previousNode = curNode;
				curNode = curNode.getNext();
				curIndex++;
				}
			previousNode.setNext(curNode.getNext());
			this.numOfEntries--;
			
			return true;
		}else {
			
		return false;}
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		this.head = null;
		this.tail = null;
		this.numOfEntries = 0;
	}
	
	
}