
public class BMI {
	
	public static void main(String[] args) { 
		int altezza = 185;
		int peso = 60000;
		double altezzaInMetri=(double)altezza/100;
		double pesoInKg=(double)peso/1000;
		double BMI;
		
		/*BMI = pesoInKg/(altezzaInMetri*altezzaInMetri);
		System.out.print("Il tuo BMI è; " +BMI); */
		
		BMI = pesoInKg/(altezzaInMetri*altezzaInMetri);
		
		System.out.print("Il tuo BMI è: " +Math.round(BMI)+" ");
		
		if(BMI<18.5)
			System.out.print("Sei sottopeso!");
		if(BMI>25)
			System.out.print("Sei sovrappeso!");
		else
			System.out.print("Sei normopeso!");		
	}

}
