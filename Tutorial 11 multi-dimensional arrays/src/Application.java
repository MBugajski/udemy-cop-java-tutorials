
public class Application {
	public static void main(String[] args) {
		
		int[] values = {3, 5, 23456};
		
		System.out.println(values[2]);
		
		int[][] grid = {
			{3, 5, 9375},
			{2, 5},
			{1, 3, 5, 7}
		};
		
		System.out.println(grid [0][2]);
		System.out.println(grid [2][3]);
		System.out.println(grid [1][1]);
		
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello there";
				
		System.out.println(texts[0][1]);
		
		
		for(int row=0; row<grid.length; row++) {
			for(int col=0; col<grid[row].length; col++) {
				System.out.print(grid[row][col] + "/t");	/*print not println*/
			}
			System.out.println(); /*just an empty line after each row*/
		}
		
		// The last array index is optional.
        String[][] words = new String[2][];
        
        // Each sub-array is null.
        System.out.println(words[0]);
        
        // We can create the subarrays 'manually'.
        words[0] = new String[3];
        
        // Can set a values in the sub-array we
        // just created.
        words[0][1] = "hi there";
        
        System.out.println(words[0][1]);
	}
}
