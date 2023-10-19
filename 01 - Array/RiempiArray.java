import java.io.*;

public class RiempiArray {
	public static void main (String[] args)throws IOException {
		 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("Quanti elementi ha l'array? (un intero > 0) ");
	        int n = Integer.parseInt(stdin.readLine());
	        
	        int[] array = new int[n];
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print("Dammi l'" + (i+1) +"-esimo intero: ");
	            array[i] = Integer.parseInt(stdin.readLine());
	            }
	       
	        System.out.print("[ ");
	        for (int i = 0; i < array.length; i++)
	            System.out.print(array[i] +  " ");
	        System.out.println("]");
	    }
	}
