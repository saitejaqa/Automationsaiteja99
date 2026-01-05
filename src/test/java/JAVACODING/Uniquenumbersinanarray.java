package JAVACODING;

import java.util.ArrayList;

public class Uniquenumbersinanarray {

	public static void main(String[] args) {
		  int a[] = {1,2,3,4,4,4,4,5};
		  
		  ArrayList<Integer> Printed= new ArrayList<Integer>();
		  
			for (int i = 0; i < a.length; i++) {
				int Count = 0;
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						Count++;
					}
				}
				if (Count == 1 && !Printed.contains(a[i])) {
					System.out.println(a[i] + " is unique number");
					Printed.add(a[i]);
				}
			}
		}
	}
		 
