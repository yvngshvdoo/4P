import java.io.*;
public class divisioneSenzadivisione {
	
	 public static void main(String[] args)throws IOException {
	        
		 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		 
		 int q = 0, n = 0, r = 0, d = 0;
		 System.out.println("Inserisci il numeratore: ");
		 n = Integer.parseInt(stdin.readLine());
		 System.out.println("Inserisci il denominatore: ");
		 d = Integer.parseInt(stdin.readLine());
		 if (n==0 && d==0) {
			 System.out.println("Tutte le divisioni con numeratore e denominatore uguali a zero si dicono indeterminate.");
			 System.exit(0);
			 
		 }
		 if (n==0) {
			 System.out.println("Tutte le divisioni con numeratore uguale a zero hanno quoziente uguale a zero.");
			 System.exit(0);
		 }
		 if (d==0) { 
			 System.out.println("Tutte le divisioni con denominatore uguale a zero non hanno significato. Impossibile.");
			 System.exit(0);
		 }
		 while (n>=d) {
			 n-=d;
			 q++;
		 }
		
		 
		 r=n;
		 System.out.println("Quoziente: " + q + "\nResto: " + r);
		 
	 }
}
