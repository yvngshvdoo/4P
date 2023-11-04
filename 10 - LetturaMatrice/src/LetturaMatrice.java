import java.util.*;
import java.io.IOException;
import java.io.File;

public class LetturaMatrice {

		public static void main(String[]args) throws IOException {
			
			Scanner sc = new Scanner(new File("inputFile"));
			int mat[][]= new int[3][4];
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 4; j++)
					mat[i][j] = sc.nextInt();
			}
			for(int i = 0; i < 3; i++) {
				
				for(int j = 0; j < 4; j++)
					System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
}
