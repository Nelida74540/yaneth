/**
 * ResoluciondelExamen
 */
public static Void ResoluciondelExamen {

    Scanner in = new Scanner(System.in);
    int i, n;
    double categoria_1, categoria_2, categoria_3, clave, costo;
    double impuesto, impuesto_a_pagar;
    categoria_1 = 0;
    categoria_2 = 0;
    categoria_3 = 0;
    impuesto_a_pagar = 0;
    System.out.print("Ingresa el numero de vehiculos que desea adquirir : ");
    n = in.nextInt();
    in.nextLine();
    for (i=1; i<=n; i++) {
        
        System.out.print("Ingresa la categoria 1-2-3 : ");
        clave = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el valor de costo: ");
        costo = in.nextDouble();
        in.nextLine();
        impuesto=0;
        if(clave==1)
        {
            impuesto=costo*0.12;
            categoria_1=categoria_1+impuesto;
        }
        if(clave==2)
        {
            impuesto=costo*0.08;
            categoria_2=categoria_2+impuesto;
        }
        if(clave==3)
        {
            impuesto=costo*0.05;
            categoria_3=categoria_3+impuesto;
        }
        impuesto_a_pagar=impuesto_a_pagar+impuesto;
        System.out.print("Valor de impuesto: " + impuesto);
        System.out.println();
    }
    System.out.println("Valor de categoria 1: " + categoria_1);
    System.out.println("Valor de categoria 2: " + categoria_2);
    System.out.println("Valor de categoria 3: " + categoria_3);
    System.out.println("Valor de impuesto a pagar: " + impuesto_a_pagar);
}
    
package pe.edu.upeuyncc;

/**
 * InnerResoluciondelExamen
 */
public class ResoluciondelExamen {
 
    public static void main() {
        int nut;
        System.out.println("ingrese altura de x");
        nut = leer.nextInt();
        for  (int i = 1; i <= nut; i++){
            for (int j= 1; j <= nut; j++){
                if (i ==j || i + j == nut + 1)
                    System.out.println("a");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }
    }
    
}


/**
 * ResoluciondelExamen
 */
public class ResoluciondelExamen{
    public static void main() {
        int i, suma = 0, n;
    Scanner sc = new Scanner(System.in);
    System.out.println ("Introdusca un numero:");
       n = sc.nextInt();
   for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
       if (n % i == 0) {
           suma = suma + i;   // si es divisor se suma
       }
   }
   if (suma == n) {           // si el numero es igual a la suma de sus divisores es perfecto                
       System.out.println("Perfecto");
   } else {
       System.out.println("No es perfecto");
   }
   } 
    
}

    
/**
 * ResoluciondelExamen
 */
public class ResoluciondelExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca numero >0: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println();
        System.out.print("Binario: ");
        decBin(n);
        System.out.println();
    }

    public static void decBin(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        } else {
            decBin(n / 2);
            System.out.print(n % 2);
            return;
        }
    }
    
}
    

   