
public class ApplicationFromComment {
	public static void main(String[] args) {
		
		int n=1;
		int[][] table = new int[5][5];
		
		for(int r=0; r < table.length; r++) {
			for(int c=0; c < table[r].length; c++) {
				table[r][c] = n;
				n++;
			}
		}
		for(int r=0; r<table.length; r++) {
			for(int c=0; c<table[r].length; c++) {
				System.out.print(table[r][c] + " ");	
			}
			System.out.println();
		}		
	}
}