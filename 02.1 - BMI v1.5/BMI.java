
public class BMI {
	
	public static void main(String[] args) {
		final int GRAMMI_PER_CHILO = 1000;
		final int CENTIMETRI_PER_METRO = 100;
		
		// Massa e peso propri in grammi e centimetri
		int massa = 75000; // gr
		int altezza = 190; // cm
		
		double massaKg = ((double)massa) / GRAMMI_PER_CHILO;
		double altezzaM = ((double)altezza) / CENTIMETRI_PER_METRO;
		
		double BMI = massaKg / (altezzaM * altezzaM);
		
		System.out.println("Una persona con peso " + massaKg + "kg, ");
		System.out.println("Altezza " + altezzaM + "m, ");
		System.out.println("Ha un BMI pari a " + Math.round(BMI));
		
				
	}

}
