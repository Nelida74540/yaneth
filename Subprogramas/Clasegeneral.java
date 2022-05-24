package Subprogramas;
 //import Subprogramas.Aritmetica;
public class Clasegeneral {
    
    public static void main(String[] args) {
        Aritmetica a=new Aritmetica();
        int resultado=a.sumar(5, 3);
        System.out.println(resultado);

        Aritmetica obj=new Aritmetica(5,3);
        resultado=obj.multiplicar();
        System.out.println("multiplicacion:"+resultado);
    }
}
