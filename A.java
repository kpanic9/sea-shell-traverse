/*


	Recursive algorithm for going through an array in shell pattern. 


	---------------->
	x	x	x	x		x  |
	------------->		   |				
  ^ x	x	x	x	|	x  |
  | x	x	x	x	|	x  |
  | x	x	x	x	\/  x  |
  |		------------	   |
  | x	x	x	x		x \/
	<----------------
	
	
	



Test Case 1


Array size = 9 (3x3)

Input
1 2 3
4 5 6
7 8 9
	
Output
1 2 3 6 9 8 7 4 5







Test Case 2


Array size = 16 (4x4)

Input
 1  2  3  4  
 5  6  7  8  
 9 10 11 12
13 14 15 16 
17 18 19 20 
	
Output
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13






Test Case 3


Array size = 25 (5x5)

Input
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20 
21 22 23 24 25
	
Output
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13

*/


public class A {

	
	private static final int size = 4;


	public static void main(String args[]) {
	
	
		// initialize array
		int[][] array = new int[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				array[i][j] = i * size + j + 1;
			}
		}
		
		// print array 
		System.out.println("Input");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// output
		System.out.println("Output");
		// recursively solve
		oneRound(array, size);
		
			
	}
	
	
	public static void oneRound(int [][]array, int n) {
		
		// right
		for(int i = 0; i < n; i++) {
			System.out.print(array[0][i] + " ");	
		}
		
		// down
		for(int i = 1; i < n; i++) {
			System.out.print(array[i][n - 1] + " ");	
		}
		
		// left
		for(int i = n - 2; i >= 0; i--) {
			System.out.print(array[n - 1][i] + " ");	
		}
		
		// up
		for(int i = n - 2; i > 0; i--) {
			System.out.print(array[i][0] + " ");	
		}
		
		
		if( n - 2 == 1 ) {
			System.out.print(array[2][2] + " ");
		}
		else if( n - 2 > 1) {
			// create new array
			int a[][] = new int[n - 2][n - 2];
			for(int i = 1; i < n - 1; i++) {
				for(int j = 1; j < n - 1; j++) {
					a[i-1][j-1] = array[i][j];
				}
			}
			
			// solve recursively
			oneRound(a, n - 2);
		}
	}
	
	
	
}

