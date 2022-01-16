package Recursion;
import java.util.*;
public class PrintDecreasing {
	
	public static void dic(int n) {
		if(n == 0) {
			return;
		}
		
		
		System.out.println(n);
	    dic(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		dic(n);
		//System.out.println(dic(n));
	}
}
