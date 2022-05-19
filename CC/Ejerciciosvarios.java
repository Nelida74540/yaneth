import java.util.Scanner;

import javax.security.auth.login.LoginContext;

public class Ejerciciosvarios {
    /**
     * InnerEjerciciosvarios
     */
    static Scanner leerT=new Scanner(System.in);

    public static Long factorialN(int numero) {
        long resultado=1;
        if (numero>1){      
           for (long i = 1; i <=numero; i++){
               resultado=resultado*i;
           }
           }           
           return resultado;
    }

    public static void main(String[] args) {
      System.out.println(" ingrese un numero:");
      int num=leerT.nextInt();
      for (int i = 0; i <num; i++){
      System.out.println("factorial de"+ i+" es:"+ factorialN(i)); 

    }

    
}
}
