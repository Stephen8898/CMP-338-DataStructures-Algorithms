package com.classwork.Lists.src;

public class DoubleList<I extends Comparable<? super I>> implements ListInterface<I> {

	private DoubleNode<I> head;
	private DoubleNode<I> tail;
	
	private int numberOfEntries;	
	
	
	public DoubleList() {
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
		return (this.numberOfEntries == 0);
	}

	@Override
	public void add(I element) {
		DoubleNode<I> newNode = new DoubleNode<I>(element);
		
		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		}
		
		this.numberOfEntries++;
	}

	@Override
	public boolean add(I element, int index) {
		if ((index <= this.numberOfEntries) && (index >= 0)) {
			DoubleNode<I> newNode = new DoubleNode<I>(element);

			if (this.isEmpty()) {
				// list is empty and index == 0
				this.head = newNode;
				this.tail = newNode;
			} else if (index == this.numberOfEntries) {
				// list is not empty and adding to tail of list
				tail.setNext(newNode);
				newNode.setPrev(tail);
				tail = newNode;
			} else if (index == 0) {
				// list is not empty and adding to head of list 
				newNode.setNext(this.head);
				head.setPrev(newNode);
				head = newNode;
			} else {
				// list is not empty and adding inside list
				DoubleNode<I> curNode = this.findNodeAtIndex(index);
				
				newNode.setNext(curNode);
				curNode.getPrev().setNext(newNode);
				newNode.setPrev(curNode.getPrev());
				curNode.setPrev(newNode);
			}
			
			this.numberOfEntries++;
			
			return true;
		} else {
			// invalid index
			return false;
		}
	}

	@Override
	public void addSorted(I element) {
		DoubleNode<I> newNode = new DoubleNode<I>(element);
		
		if (this.isEmpty()) {
			// list is emtpy, just add to head
			this.head = newNode;
			this.tail = newNode;
		} else if (element.compareTo(head.getData()) < 0) {
			// element is smaller than head element, replace head
			newNode.setNext(this.head);
			head.setPrev(newNode);
			head = newNode;
		} else if (element.compareTo(tail.getData()) > 0) {
			// element is greater that tail element, replace tail
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
		} else {
			DoubleNode<I> curNode = head;
			while (element.compareTo(curNode.getData()) > 0) {
				curNode = curNode.getNext();
			}
			
			newNode.setNext(curNode);
			curNode.getPrev().setNext(newNode);
			newNode.setPrev(curNode.getPrev());
			curNode.setPrev(newNode);
		}
		
		this.numberOfEntries++;
	}

	@Override
	public I get(int index) {
		if ((index < this.numberOfEntries) && (index >= 0)) {
			DoubleNode<I> curNode = this.findNodeAtIndex(index);

			return curNode.getData();
		} else {
			return null;
		}
	}

	@Override
	public I replace(I element, int index) {
		if ((index < this.numberOfEntries) && (index >= 0)) {
			DoubleNode<I> curNode = this.findNodeAtIndex(index);

			I curElement = curNode.getData();
			curNode.setData(element);
			return curElement;
		} else {
			return null;
		}
	}

	@Override
	public boolean remove(int index) {
		if ((index < this.numberOfEntries) && (index >= 0)) {
			DoubleNode<I> curNode = this.findNodeAtIndex(index);
			
			curNode.getPrev().setNext(curNode.getNext());
			curNode.getNext().setPrev(curNode.getPrev());
			
			this.numberOfEntries--;
			
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void removeAll() {
		this.head = null;
		this.tail = null;
		this.numberOfEntries = 0;
	}

	
	
	
	
	
	
	
	
	
	private DoubleNode<I> findNodeAtIndex(int index) {
		DoubleNode<I> curNode = head;
		int curIndex = 0;
		
		while (curIndex < index) {
			curNode = curNode.getNext();
			curIndex++;
		}
		
		return curNode;
	}
	
	
	
	
}
