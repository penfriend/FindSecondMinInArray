package com.company;

public class FindSecondMinInArray {
	 static public int findSecondMin(int[] arr){
		if(arr == null ){
			throw new NullPointerException("NullPointerException: the argument of the function can't be null");
		}
		if(arr.length < 2 ){
			throw new IllegalArgumentException("IllegalArgumentException: there are less than two numbers in the array");
		}       
		int minFirst = arr[0];
		int minSecond = arr[0];
			for(int i = 0; i < arr.length; i++){
				if(arr[i] < minFirst){
					minSecond = minFirst;
					minFirst = arr[i];
				}
				else if(arr[i] < minSecond && arr[i] != minFirst){
					minSecond = arr[i];
				}
			}
			 if(minSecond==minFirst) {
	            	throw new IllegalArgumentException("IllegalArgumentException: there are same item values in array");
	            }
		return minSecond;
	    }
}
