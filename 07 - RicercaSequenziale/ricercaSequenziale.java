import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ricercaSequenziale {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inserisci i caratteri tra cui cercare (senza spazi): ");
        String input = stdin.readLine();

        System.out.print("Inserisci il carattere da cercare: ");
        String carattereDaCercareInput = stdin.readLine();

        if (carattereDaCercareInput.length() != 1) {
            System.out.println("Devi inserire un solo carattere.");
            return;
        }

        char carattereDaCercare = carattereDaCercareInput.charAt(0);

        int posizione = -1;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == carattereDaCercare) {
                posizione = i;
                break;
            }
        }

        if (posizione != -1) {
            System.out.println("Il carattere è presente nella posizione: " + posizione);
        } else {
            System.out.println("Il carattere non è presente nel vettore.");
        }
    }
}
