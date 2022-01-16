package Recursion;
import java.util.*;
public class DisplayReverseArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]  = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		revarray(arr,0);
	}
	
	public static void revarray(int[] arr, int idx) {
		
		if(idx == arr.length)
			return ;
		
		revarray(arr,idx+1);
		System.out.println(arr[idx]);
	}
}
