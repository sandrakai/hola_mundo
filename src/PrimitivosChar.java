public class PrimitivosChar {

    public static void main(String[] args) {

        char miLetra = 'A';
        System.out.println("miLetra = " + miLetra);
        
        char miLetra2 = 64; //ascii
        System.out.println("miLetra2 = " + miLetra2);

        if(miLetra==miLetra2){
            System.out.println("Son iguales");
        }else{
            System.out.println("son distintas");
        }

        char saltoLinea = '\r';
        /*
\n : (Line Feed) mueve el cursor hacia la siguiente línea sin volver al comienzo de la línea.

\r : Retorno de carro (Carriage return), mueve el cursor al comienzo de la línea sin avanzar a la siguiente linea
*/

        System.out.println("texto del comienzo" + saltoLinea + "texto del final");


    }
    
}
