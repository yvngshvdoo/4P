import java.io.*;
public class CambioPrimoNome {
	public static void main(String[] args)throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		
  int ns = 0; //numero stringhe
  String temp = new String();
  
  System.out.println("Inserisci il numero di stringhe da memorizzare: ");
  ns = Integer.parseInt(stdin.readLine());
  
  String[] strArray1 = new String[ns];
  
  	for(int i = 0; i < ns; i++) {
   System.out.println("Inserisci nomi: ");
   strArray1[i]=stdin.readLine();
   temp = strArray1[i].toLowerCase();
   if(temp.startsWith("anna")) {
    strArray1[i] = temp.replaceFirst("anna","Maria");
    temp = strArray1[i].replaceAll(" ","");
    strArray1[i] = temp;
   }
   else
    strArray1[i] = temp.replaceAll(" ","");
  }
  System.out.println("\n---STAMPA---\n");
  for(int i=0;i<ns;i++) {
   System.out.println(strArray1[i]);
  }
 }

}