package com.classwork.BetterArray.src;

import BetterArray;

public class Driver {

	public static void main(String[] args) {
		BetterArray<Integer> bai = new BetterArray<Integer>(100);

		System.out.println("Size of bai = " + bai.size());
		
		for (int i = 200 ; i > 0 ; i-- ) {
			bai.insertElement(new Integer(i), 0);
			System.out.println(bai);
		}

		System.out.println("Size of bai = " + bai.size());
		
		bai.resetArray();

		System.out.println("Size of bai = " + bai.size());
		
		for (int i = 200 ; i > 0 ; i-- ) {
			bai.insertElementSorted(new Integer(i));
			System.out.println(bai);
		}

		System.out.println("Size of bai = " + bai.size());
		
		bai.resetArray();

		System.out.println("Size of bai = " + bai.size());
		
		for (int i = 200 ; i > 0 ; i-- ) {
			bai.addElement(new Integer(i));
			System.out.println(bai);
		}
		
		
		
		
		
		
		
	}

}
