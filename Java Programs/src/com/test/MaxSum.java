package com.test;

import java.util.ArrayList;
import java.util.List;

public class MaxSum {

	public static int findMax(int a[]) {
		int n = a.length;
		int oddSum = 0, evenSum = 0;
		for(int i=0; i<n;i++) {
			if(i%2 == 0) {
				evenSum+= a[i];
			}else
				oddSum+= a[i];
		}
		return Math.max(evenSum, oddSum)
;	}
	

	public static void main(String[] args) {
		int a[] = {5,  5, 10, 40, 50, 35};
		System.out.println("Max sum = "+findMax(a));
		
		List<?> objList = new ArrayList<>();
		List<String> stList = new ArrayList<String>();
		
		objList.add(1, null);
		
		/*
		 * objList.add(1); objList.add("AB"); objList.add(2.0); objList.add("A");
		 */
		
		stList.add("A");
		stList.add("A");
		
		objList = stList;
		
		//stList = objList;
		
	}

}
