Sea Shell Traverse 2D Array



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

