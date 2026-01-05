package JAVACODING;

import java.util.HashSet;

public class DuplicateElementsInArray {

	/*
	 * public static void main(String[] args) 
	 * { int[] arr= {2,3,4,5,2,3,4,5};
	 * 
	 * for(int i=0;i < arr.length; i++) 
	 * { for(int j=i+1;j< arr.length; j++) {
	 * if(arr[i]==arr[j]) 
	 * { System.out.println("Duplicate Elements is :" +arr[i]); 
	 * }
	 * }
	 *  }
	 *  }
	 */
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,6,6,6,6};
		//String S1[]= {"SAITEJA","TEJA","SAITEJA"};
		HashSet<Integer> Set=new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			if(!Set.add(arr[i])) {
				System.out.println("Duplicate Element is :" +arr[i]);
			}else {
				System.out.println("NON Duplicate Element is :" +arr[i]);
			}
		}		
	}
}
