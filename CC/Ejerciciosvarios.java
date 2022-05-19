import java.util.Scanner;

public class Ejerciciosvarios {
    /**
     * InnerEjerciciosvarios
     */
    static Scanner leerT=new Scanner(System.in);

    public static int factorialN(int numero) {
        int resultado=1;
        if (numero>1){      
           for (int i = 1; i <=numero; i++){
               resultado=resultado*i;
           }
           }           
           return resultado;
    }

    public static void main(String[] args) {
      System.out.println(factorialN(5));  
    }

    
}
