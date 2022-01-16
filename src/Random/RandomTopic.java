package Random;
import java.util.*;
public class RandomTopic {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 16;
		Random random = new Random();

		int ran = random.nextInt(max);
		//System.out.println(ran);
		if(ran != 0) {
			switch(ran) {
			case 1:
				System.out.println("Array");
				break;
			case 2:
				System.out.println("Recursion and Backtracking");
				break;
			case 3:
				System.out.println("Linked List");
				break;
			case 4:
				System.out.println("Stacks");
				break;
			case 5:
				System.out.println("Queue");
				break;
			case 6:
				System.out.println("Searching");
				break;
			case 7:
				System.out.println("Sorting");
				break;
			case 8:
				System.out.println("HashMaps");
				break;
			case 9:
				System.out.println("Trees");
				break;
			case 10:
				System.out.println("Heap");
				break;
			case 11:
				System.out.println("Sliding Window");
				break;
			case 12:
				System.out.println("Graphs");
				break;
			case 13:
				System.out.println("Dynamic Programming");
				break;
			case 14:
				System.out.println("Number Theory");
				break;
			case 15:
				System.out.println("Bit Manipulation");
				break;
			case 16:
				System.out.println("Tries");
				break;
			}
		}
		else {
			System.out.println("Enjoy your day Sanjay and make Believe in yourself!");
		}
	}
}
