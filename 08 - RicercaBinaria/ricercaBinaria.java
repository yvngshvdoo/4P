package ricercaBinaria;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
public class ricercaBinaria { 
    public static void main(String[] args) throws IOException { 
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); 
         
        System.out.print("Inserisci i caratteri già ordinati: "); 
        String input = stdin.readLine(); 
         
        System.out.print("Inserisci il carattere da cercare: "); 
        char car = stdin.readLine().charAt(0); 
         
        int sinistra = 0; 
        int destra = input.length() - 1; 
        int risultato = -1; 
         
        while (sinistra <= destra) { 
            int medio = sinistra + (destra - sinistra) / 2; 
            char charMedio = input.charAt(medio); 
             
            if (charMedio == car) { 
                risultato = medio; 
                break; 
            } 
             
            if (charMedio < car) { 
                sinistra = medio + 1; 
            } else { 
                destra = medio - 1; 
            } 
        } 
         
        if (risultato == -1) { 
            System.out.println("Il carattere " + car + " non è presente nella stringa"); 
        } else { 
            System.out.println("Il carattere " + car + " è presente alla posizione " + risultato); 
        } 
    } 
}