package Recursion;
import java.util.*;
public class PrintZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		zig(n);
	}
	
	
	public static void zig(int n) {
		if(n==0)
			return ;
		
		System.out.println(" Pre "+n);
		zig(n-1);
		System.out.println(" In "+n);
		zig(n-1);
		System.out.println(" Post "+n);
	}
}
