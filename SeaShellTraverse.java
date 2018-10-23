/*
 * Auther: Namesh Sanjitha
 *
 */


public class SeaShellTraverse {

	
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

