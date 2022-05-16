public class ConversionCadenasAPrimitivos {

    public static void main(String[] args) {

        //"Número" string a número entero

        String numString = "123";
        int numInt = Integer.parseInt(numString);
        System.out.println(numInt);
        long numLong = Long.parseLong(numString);



        //"Número" string a punto flotante

        String nuevoNumString = "12";
        float miFlotante = Float.parseFloat(nuevoNumString);

        //String a booleano

        String miString3 = "true";
        boolean miBooleano = Boolean.parseBoolean(miString3);

    }
}
