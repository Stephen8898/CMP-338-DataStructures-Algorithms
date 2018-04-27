package com.classwork.Lists.src;

public class DoubleNode<I extends Comparable<? super I>> {

	DoubleNode<I> prev;
	I data;
	DoubleNode<I> next;
	
	public DoubleNode(I data) {
		this.prev = null;
		this.data = data;
		this.next = null;
	}
	
	public DoubleNode<I> getPrev() {
		return prev;
	}
	
	public void setPrev(DoubleNode<I> prev) {
		this.prev = prev;
	}
	
	public I getData() {
		return data;
	}
	
	public void setData(I data) {
		this.data = data;
	}
	
	public DoubleNode<I> getNext() {
		return next;
	}
	
	public void setNext(DoubleNode<I> next) {
		this.next = next;
	}
	
	
	
	
	
}
