package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFindSecondMinInArray {
	 @Test
	    public void testFindSecondMinOneAttr() throws IllegalArgumentException{	
	    	int[] arr = new int[] {5};
	        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
	        	FindSecondMinInArray.findSecondMin(arr);
	          });
	    	assertNotNull(thrown.getMessage());
	    }
	    
		@Test
		public void testFindSecondMinNullArg() throws IllegalArgumentException{	
			int[] arr = null;
		   Throwable thrown = assertThrows(NullPointerException.class, () -> {
			   FindSecondMinInArray.findSecondMin(arr);
		     });
			assertNotNull(thrown.getMessage());
		}
	    
	    @Test
	    public void testFindSecondMinNegativeValues() {	
	    	int[] arr = {5,33,3,-2,1,2,0,-3};
	    	assertEquals(FindSecondMinInArray.findSecondMin(arr),-2);
	    }
	    
	    @Test
	    public void testFindSecondMinPositiveValues() {	
	    	int[] arr = {5,2};
	    	assertEquals(FindSecondMinInArray.findSecondMin(arr),5);
	    }
	    
	    @Test
	    public void testFindSecondMinOneDuplicateValue() {	
	    	int[] arr = {5,5};
			Throwable thrown = assertThrows(NullPointerException.class, () -> {
				   FindSecondMinInArray.findSecondMin(arr);
			     });
			assertNotNull(thrown.getMessage());
	    }
	    
	    @Test
	    public void testFindSecondMinDublicateValues() {	
	    	int[] arr = {5,33,3,2,1,2,1,3};
	    	assertEquals(FindSecondMinInArray.findSecondMin(arr),2);
	    }
}
