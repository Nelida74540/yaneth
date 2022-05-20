package Reforzamiento;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * InnerEjercicio02
     */
        static Scanner leerT=new Scanner(System.in);
        public static void saludosegunhora() {
            //Definir variable
            int hora;
            String saludo;
            //Leer datos
            System.out.println("ingrese la hora:");
            hora=leerT.nextInt();
            //Proceso
            if (hora>=6 && hora <= 12) {
               saludo="buenos dias"; 
            }else if (hora>=13 && hora<=20){
               saludo="buenas tardes";
            }else if((hora>=21 && hora <=23) || (hora>=0 && hora<=5)) {
                saludo="buenas noches";
            }else{
                saludo="esa hora no exixte";
            }
            //Datos de salida
             System.out.print(saludo);     

    }
    public static void main(String[] args) {
        saludosegunhora();
    }
    
}5
