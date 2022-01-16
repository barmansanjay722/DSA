package Recursion;
import java.util.*;
public class PrintDecreasingIncreasing {

	public static void printdecinc(int n) {
		
		if(n ==0)
			return ;
		System.out.println(n);
		printdecinc(n-1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		printdecinc(n);
	}
}
