package CC;

import java.util.Scanner;

/**
 * Ejercicioclase
 */
public class graficarletras {
  
    static Scanner leerT=new Scanner(System.in);

    public static void graficarA() {
        System.out.println("ingrese altura de la letra:");
        int cantF=leerT.nextInt();
        System.out.println("ingrese num fila para linea:");
        int numFilLinea=leerT.nextInt();
        int medio=cantF+1;
         for (int f = 1; f <=cantF; f++) {
            for (int c = 1; c <=2*cantF;c++) {
                if (f==1 && medio==c){
                    System.out.print("*");
                }else if (c==medio-f && f>1){
                    System.out.print("*");
                }else if (c==medio+f && f>1){
                    System.out.println("*");
                }else if(f==numFilLinea && c>medio-f && c<medio+f){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } 
            } 
            System.out.print("\n");  
        }
        System.out.print(" ");  
    }
      public static void (String[] args) {
        graficarA();
}
}



public static void graficarArbol() {
    System.out.println("imprimir u")
}
  public static void main(String[] args) {
    graficarA();
  }


