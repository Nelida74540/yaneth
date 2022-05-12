package EstRepetitivas;

/**
 * EjercicioR
 */
public class EjercicioR {

    public static void imprimirwhileN1_20() {
    int numInit=21;
    while (numInit<=20) {
      System.out.println(numInit); 
      numInit=numInit+1; 
    }    
        
    }
     public static void imprimirdowhileN1_20() {

    
        int numInit=1;
         do {
             System.out.println(numInit);
             numInit++;
        } while (numInit<=21);
     }
    public static void imprimirforN1_20() {
        for (int numInit = 1; numInit <= 20; numInit++){
            System.out.println(numInit);
        }
    }
    public static void main(String[] args) {
     System.out.println("imprime while:"); imprimirwhileN1_20();
     System.out.println("imprime do while:"); imprimirdowhileN1_20();
     System.out.println("imprime for:"); imprimirforN1_20();
    }
}