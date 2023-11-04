package traspostaMatrice;

import java.io.*;
import java.util.*;
import java.io.File;
public class traspostaMatrice {

 public static void main(String[] args) throws IOException {
  Scanner sc = new Scanner(new File("Matrice"));
  
  int matrice[][], matricetraslata [][], i = 0, j = 0;
  
  matrice = new int [3][4];
  matricetraslata = new int [4][3];
  
  for (i = 0; i < 3; i++) {
   for (j = 0; j < 4; j++) {
    matrice[i][j] = sc.nextInt();
   }
  }
  
  System.out.println("La matrice iniziale è:");
  
  for (i = 0; i < 3; i++) {
   for (j = 0; j < 4; j++) {
    System.out.print(matrice[i][j] + "   ");
   }
   System.out.println();
  }
  
  for (int h = 0; h < 37; h++) 
   System.out.print("-");
  
  System.out.println();
  	
  System.out.println("La matrice traslata è:");
  
  for (i = 0; i < 4; i++) {
   for (j = 0; j < 3; j++) {
    matricetraslata[i][j] = matrice[j][i];
   }
  }
   
   for (i = 0; i < 4; i++) {
    for (j = 0; j < 3; j++) {
     System.out.print(matricetraslata[i][j] + "   ");
    }
    System.out.println();
  }
 }
}