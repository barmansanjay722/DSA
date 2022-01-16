package BackTracking;
import java.util.*;
public class FloodFill {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		boolean[][] visited = new boolean[n][m];
		floodfill(arr,0,0,"",visited);
	}
	
	public static void floodfill(int[][] maze, int row, int col, String path,boolean[][] visited) {
		
		if(row<0 || col <0 || row == maze.length || col == maze[0].length || maze[row][col] ==1 || visited[row][col] == true) {
			return;
		}
		
		if(row == maze.length-1 && col == maze[0].length-1) {
			System.out.println(path);
			return;
		}
		
		visited[row][col] = true;
		floodfill(maze,row-1,col,"t",visited);
		floodfill(maze,row,col-1,"l",visited);
		floodfill(maze,row+1,col,"d",visited);
		floodfill(maze,row,col+1,"r",visited);
		visited[row][col] = false;
	}
}
