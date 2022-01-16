package Recursion;
import java.util.*;
public class PowerLienear {

	public static int power(int x, int n) {
		
		if(n ==0) {
			return 1;
		}
		
		int xnm1 = power(x, n-1);
		int xn = x * xnm1;
		return xn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		int xn = power(x,n);
		System.out.println(xn);
	}
}
