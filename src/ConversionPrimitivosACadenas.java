public class ConversionPrimitivosACadenas {

    public static void main(String[] args) {

        //Entero a String

        int miEntero=100; //Si fuese null...
        String miString=Integer.toString(miEntero);// This will throw a NullPointerException
        String miString2 = String.valueOf(miEntero);// This will print a String equal to "null"
        System.out.println(miString + " "+ miString2);
        
    
        //De punto flotante a String
        
        double miDoble = 3.979632e4;
        String miNuevoString = String.valueOf(miDoble);
        String miNuevoString2 = Double.toString(miDoble);
        System.out.println("miNuevoString2 = " + miNuevoString2);
        System.out.println("miNuevoString = " + miNuevoString);
    }
}
