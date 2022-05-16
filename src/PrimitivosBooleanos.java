import java.util.Scanner;

public class PrimitivosBooleanos {

    public static void main(String[] args) {
        boolean miBooleano = true;

        if(miBooleano){
            System.out.println("Mi booleano es true");
        }
        else{
            System.out.println("Mi booleano es false");
        }

        //Pedir dos números. Ver si la suma es par o impar y mostrar con booleano
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce otro número:");
        int numero2 = teclado.nextInt();

        int resultado = numero1 + numero2;
        boolean esPar;

        if (resultado%2==0){
            esPar=true;
        }else {
            esPar=false;
        }


        if (esPar){
            System.out.println("La suma de los dos da un resultado par");
        }else{
            System.out.println("La suma de los dos da un resultado impar");
        }


    }
}
