public class ConversionPrimitivsAPrimitivos {

    public static void main(String[] args) {
        int miEntero = 199999986; //Como es muy grande para short se queda con los 16 bits últimos
        short miShort= (short) miEntero;
        System.out.println("miShort = " + miShort);

        long miLong = miEntero;

        short miShort2 = 34;
        int miEntero2 = miShort2;
        
        char miChar = (char) miEntero;
        System.out.println("miChar = " + miChar);
        
        float miFloat = miEntero;
        System.out.println("miFloat = " + miFloat);
        

    }
}
