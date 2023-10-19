import java.io.*; // L'ASTERISCO IMPORTA TUTTE LE CLASSI SOTTO IO - input, output
public class BMI {
	public static void main(String[] args) throws IOException { // throws IOException MANGIA l'errore ELIMINANDOLO O PERMETTENDOCI DI GESTIRLO
	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in)); // L'istruzione CI CREA UNA TASTIERA UTILE all'input. MEMORIZZA CIO' CHE L'UTENTE SCRIVE
	
	int altezza = 0, peso = 0;
	System.out.print("Inserisci l'altezza in cm: ");
	altezza = Integer.parseInt(stdin.readLine()); // LEGGI IL VALORE SULLA LINEA, PASSALO A PARSEINT E QUEST'ULTIMO LO CONVERTIRA' IN UN INTERO, MEMORIZZANDOLO IN ALTEZZA
	System.out.print("Inserisci il peso in grammi: ");
	peso = Integer.parseInt(stdin.readLine());
	double altezzaInMetri = (double)altezza/100;
	double pesoInKg = (double)peso/1000;
	double BMI;
	
	BMI = (float)pesoInKg/(altezzaInMetri*altezzaInMetri);
	
	System.out.print("Il tuo BMI è: " +Math.round(BMI)+" ");
	
	if(BMI<18.5)
		System.out.print("Sei sottopeso!");
	if(BMI>25)
		System.out.print("Sei sovrappeso!");
	else
		System.out.print("Sei normopeso!");
	}
}
