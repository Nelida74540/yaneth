package Reforzamiento;

import java.util.Scanner;

/**
 * Ejercicio
 */
public class Ejercicio {

    public static void mostrarcursodia() {
        //Definir variable
        int diasem;
        String mensaje;
        String primeraparteM="Ese dia no existe";
        //Leer datos
        Scanner leerT=new Scanner(System.in);
        System.out.println("ingre un dia de la semana:1\n1=Dom"+"\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
        diasem=leerT.nextInt();
        //Proceso
        if (diasem==1) {
            mensaje=primeraparteM+"no hay clases";
        }else if(diasem==2){
            mensaje=primeraparteM+"matematica";
        }else if(diasem==3 || diasem==5){
            mensaje=primeraparteM+"fundamentos de programacion";
        }else if(diasem==4){
            mensaje=primeraparteM+"capacidades comunicativas";  
        }else if(diasem==6){
        mensaje=primeraparteM+"introduccion a la ingenieria de sistemas";
        }else{
            mensaje="el dia de que coloco no exixte";
        }
        //Datos de salida
         System.out.println(mensaje);
    }
        
        

    

    public static void main(String[] args) {
        mostrarcursodia(); 
     
        }
    }
