package com.classwork.Lists.src;

public class LinkedList<I extends Comparable<? super I>> implements ListInterface<I> {

	private LinkedListNode<I> head;
	private LinkedListNode<I> tail;
	
	private int numberOfEntries;
	
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.numberOfEntries = 0;
	}

	@Override
	public int size() {
		return this.numberOfEntries;
	}

	@Override
	public boolean isEmpty() {
		if (this.numberOfEntries == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void add(I element) {
		LinkedListNode<I> newNode = new LinkedListNode<I>(element);
	
		if (this.isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	
		this.numberOfEntries++;
	}

	@Override
	public boolean add(I element, int index) {
		if (index <= this.numberOfEntries) {
			LinkedListNode<I> newNode = new LinkedListNode<I>(element);
			
			if (index == 0) {
				// put in front
				if (this.isEmpty()) {
					this.head = newNode;
					this.tail = newNode;
				} else {
					newNode.setNext(this.head);
					this.head = newNode;
				}
			} else if (index == this.numberOfEntries) {
				// put in back
				tail.setNext(newNode);
				this.tail = newNode;
			} else {
				// put at specified index
				int curIndex = 0;
				LinkedListNode<I> curNode = this.head;
				
				while (curIndex < (index - 1)) {
					index++;
					curNode = curNode.getNext();
				}
				newNode.setNext(curNode.getNext());
				curNode.setNext(newNode);
			}
			
			this.numberOfEntries++;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void addSorted(I element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public I get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public I replace(I element, int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeAll() {
		this.head = null;
		this.tail = null;
		this.numberOfEntries = 0;
	}
}
