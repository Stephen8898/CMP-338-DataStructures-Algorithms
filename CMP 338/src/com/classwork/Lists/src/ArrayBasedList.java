package com.classwork.Lists.src;

public class ArrayBasedList<I extends Comparable<? super I>> implements ListInterface<I>{
	
	private BetterArray<I> ba = new BetterArray<I>(10000);
	
	@Override
	public int size() {
		return ba.size();
	}

	@Override
	public boolean isEmpty() {
		return ba.isEmpty();
	}

	@Override
	public void add(I element) {
		ba.addElement(element);
	}

	@Override
	public boolean add(I element, int index) {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		
	}
}
