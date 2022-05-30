package Tarea;

import java.util.Scanner;
/**
 * ejercicio
 */
public class ejercicio {

    public static void todalatarea() {
        
      //Definir variables
        double total=1500;
       //Proceso
        for(int i = 0; i < 6; i++) {
        total=total+(total*0.10);
        System.out.println("su salario es de "+(i+1)+" el año seria de:"+total);
}
}
}
    public static void ejercicio42YNCC() {
        //Definir variables
        int n,tarjeta,hamburguesa;
        double total=0;
        //Datos de entrada
        System.out.println("Sencillo(1) \nDoble(2) \nTriple(3)");
        for (int i = 0; i < 3; i++) {
            hamburguesa=i+1;
            System.out.println("Ingresar la cantidad de hamburguesas del tipo "+(i+1)+":");
            n=lt.nextInt();
            switch (hamburguesa) {
                case 1:total=total+10*n; break;
                case 2:total=total+12*n; break;
                case 3:total=total+14*n; break;
                default: break;
            }
        }
        System.out.println("Elegir el tipo de pago: \n1.- Efectivo \n2.-Trajeta de credito");
        tarjeta=lt.nextInt();
        switch (tarjeta) {
            case 1:System.out.println("total a pagar es de: "+total+" pesos"); break;
		    case 2:total=total+(total*0.05); System.out.println("total a pagar es de: "+total+" pesos"); break;
            default: break;
        }
    }
    public static void ejercicio43YNCC() {
        //Definir variables
        int conta0=0,contaMas=0,contaMenos=0, n,num;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
        n=lt.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Deme un numero: ");
            num=lt.nextInt();
            if (num<0) {
                contaMas=contaMas+1;
            } else if (num==0) {
                conta0=conta0+1;
            } else {
                contaMenos=contaMenos+1;
            }
        }
        System.out.println("La cantidad de numeros igual a 0 es: "+conta0);
        System.out.println("La cantidad de numeros mayor a 0 es: "+contaMas);
        System.out.println("La cantidad de numeros menor a 0 es: "+contaMenos);
    }
    public static void ejercicio44YNCC() {
        //Definir Variables
        int cantfocoV=0, cantfocoB=0, cantfocoR=0;
        String colorF="";
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingrese el color de Foco:\nV=Verde\nB=Blanco\nR-Rojo");
            colorF=lt.next().toUpperCase();
            if (colorF.charAt(0)=='V') {
                cantfocoV++;
            }else if (colorF.charAt(0)=='B') {
                cantfocoB++;
            } else if (colorF.charAt(0)=='R') {
                cantfocoR++;
            }else{
                System.err.println("No es correcto el color de foco");
            }
            System.out.println("Tiene mas focos a evaluar?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }
        //Datos de salida
        System.out.println("La cantidad de focos de color Verde es: "+cantfocoV);
        System.out.println("La cantidad de focos de color Blanco es:" +cantfocoB);
        System.out.println("La cantidad de focos de color Rojo es: "+cantfocoR);
        System.out.println("La cantidad Total de focos son: "+(cantfocoV+cantfocoB+cantfocoR));
    }
    public static void ejercicio45YNCC() {
        //Definir variables
        int n;
        //Datos de entrada
        System.out.println("Ingresar el proceso deseado \n1.-While \n2.-For");
        n=lt.nextInt();
        switch (n) {
            //Definir variables
                int v=0;
                double salario=1500;
                while (v<6) {
                salario=salario+(salario*0.10);
                System.out.println("Su salario es "+(v+1)+" año sera de:"+salario);
                v++;
                }; break;
            //Definir variables
                double total=1500;
                for (int i = 0; i < 6; i++) {
                total=total+(total*0.10);
                System.out.println("Su salario el "+(i+1)+" año sera de:"+total);
                }break;
            } default;
                break;
        }
    
    
    public static void ejercicio47YNCC() {
        //Definir Variables
        int cantNumMayorcero=0, cantNumMenorIgualCero=0;
        double numN=0;
        String continuar="S";
        //Datos de entrada y proceso
        while (continuar.equals("S")) {
            System.out.println("Ingresar un numero:");
            numN=lt.nextDouble();
            if (numN<=0) {
                cantNumMenorIgualCero++;
            }else{
                cantNumMayorcero++;
            }
            System.out.println("Desea ingresar mas numeros?:\nS=Si\tN=No");
            continuar=lt.next().toUpperCase().equals("S")?"S":"N";
        }  
        //Datos de salida
        System.out.println("Cual es la cantidad de numeros Mayores de cero: "+cantNumMayorcero);
        System.out.println("Cual es la cantidad de numeros menores e iguales a cero: "+cantNumMenorIgualCero);
        System.out.println("cual es el total de numeros introducidos: "+(cantNumMayorcero+cantNumMenorIgualCero));
    }
    public static void ejercicio48YNCC() {
        //Definir variables
        int años;
        double saldo=0, interes=0, total=0, deposito=0;
        //Datos de entrada
        System.out.println("Ingresar la cantidad de años ahorrados: ");
        años=lt.nextInt();
        //Proceso
        while (años>0) {
            for (int i = 0; i < 12; i++) {
            System.out.println("Ingresar el deposito del mes "+(i+1)+":");
            deposito=lt.nextDouble();
            saldo=saldo+deposito;
        }
        interes=interes+(saldo*0.10);
        total=saldo+interes;
        años=años-1;
        }
        //Datos de salida
        System.out.println("Tu ahorro en el año es: "+saldo);
        System.out.println("El interes ganado es: "+interes);
        System.out.println("Tu ahorro ya con interes es: "+total);
        System.out.println("");
    }
    public static void ejercicio49YNCC() {
        //Definir datos
        int n,salones,edad,suma=0,total=0,alumnos=0;
        //Datos de entrada
        System.out.println("Ingrese la cantidad de salones: ");
        salones=lt.nextInt();
        while (salones>0) {
            System.out.println("Ingresar las cantidades de alumnos: ");
            n=lt.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Ingrese la edad del alumno: "+(i+1));
                edad=lt.nextInt(); 
                suma=suma+edad;
            }
            System.out.println("sus promedio del salon "+salones+" es: "+(suma/n));
            alumnos = alumnos+; 
            total = total + suma;
	        salones = salones - 1;
            suma=suma*0;
        }
        System.out.println("El promedio de todos de la escuela es: "+(total/alumnos)+" años");
}


public static void main(String[] args) {
    
}