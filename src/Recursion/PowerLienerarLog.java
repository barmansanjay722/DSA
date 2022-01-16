package Recursion;
import java.util.*;
public class PowerLienerarLog {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2;
		int n = 5;
		int res = powerLog(x,n);
		System.out.println(res);
	}
	
	public static int powerLog(int x,int n) {
		if(n ==0) {
			return 1;
		}
		
		int xnpb = powerLog(x, n/2);
		int xn = xnpb * xnpb;
		
		if(n %2 ==1) {
			xn = xn * x;
		}
		
		return xn;
	}
}
