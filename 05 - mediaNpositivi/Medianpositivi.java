import java.io.*;

public class Medianpositivi{

    public static void main(String[] args)throws IOException {
        
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        int n, i=1;
        double media, x, somma=0;
        
        System.out.println("Inserisci il numero di valori di cui vuoi calcolare la media:");
        n = Integer.parseInt(stdin.readLine());
        while (n < 2) {
            System.out.println("Richiesto un valore maggiore o uguale di 2:");
            n = Integer.parseInt(stdin.readLine());
        }
        while (i <= n) {
            System.out.println("Inserisci il " + i + " numero:");
            x = Integer.parseInt(stdin.readLine());
            //System.out.println("Eccomi");
              while (x <= 0) {
                System.out.println("Devi inserire un numero positivo. Reinserisci il " + i + " numero:");
                x = Integer.parseInt(stdin.readLine());
            }
            somma = somma + x;
            i = i + 1;
        }
        media = somma / n;
        System.out.println("Media uguale: " + media);
    }
}