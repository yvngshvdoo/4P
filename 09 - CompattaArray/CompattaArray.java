package compattaArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class compattArray {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserisci la dimensione dell'array: ");
        int dimensione = Integer.parseInt(stdin.readLine());

        int[] numeri = new int[dimensione];

        System.out.print("Inserisci i numeri dell'array: ");
        String[] numeriInStringa = stdin.readLine().split(" "); //METODO SPLIT SUDDIVISIONE STRINGA

        for (int i = 0; i < dimensione; i++) {
            numeri[i] = Integer.parseInt(numeriInStringa[i]);
        }

        System.out.print("Inserisci il numero da aggiungere in coda: ");
        int numeroDaAggiungere = Integer.parseInt(stdin.readLine());

        int n = numeri.length;

        for (int i = 0; i < n; i++) {
            if (numeri[i] != numeroDaAggiungere) {
                System.out.print(numeri[i]);
                if (i < n - 1) {
                    System.out.print(" ");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (numeri[i] == numeroDaAggiungere) {
                System.out.print(" " + numeroDaAggiungere);
                break;
            }   
        }
        System.out.print(" " + numeroDaAggiungere);
    }
}
