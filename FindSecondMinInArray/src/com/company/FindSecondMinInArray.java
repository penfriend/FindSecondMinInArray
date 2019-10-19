package com.company;

public class FindSecondMinInArray {
	 static public int findSecondMin(int[] arr){
	        try{
		        if(arr.length < 2 || arr == null ){
		            throw new IllegalArgumentException("there are less than two numbers in the array");
		        }
	        }
	        catch(IllegalArgumentException e){
	        	System.out.print(e.getMessage());
	        }
	        catch(Exception e){
	        	System.out.print(e.getMessage());
	        }
	        int minFirst = arr[0];
	        int minSecond = arr[0];
	        try {
		        for(int i = 0; i < arr.length; i++){
		            if(arr[i] < minFirst){
		                minSecond = minFirst;
		                minFirst = arr[i];
		            }
		            else if(arr[i] < minSecond && arr[i] != minFirst){
		                minSecond = arr[i];
		            }
		        }
		        
	        }
	        catch (IndexOutOfBoundsException e) {
	            System.err.println("Caught IndexOutOfBoundsException: "
                        +  e.getMessage());
                              
 }
	        return minSecond;
	    }
}
