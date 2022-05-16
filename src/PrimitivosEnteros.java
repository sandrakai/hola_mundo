public class PrimitivosEnteros {

    public static void main(String[] args) {

        //BYTE
        /*Puede almacenar un valor de 1 byte (de -128 a 127)
        0000000 a 1111111
        Siete unos en base 2 es 127*/

        byte miValorByte = 127;

        //SHORT
        /*Puede almacenar un valor de 2 bytes (de -32768 a 32767)
         00000000000000000 a 11111111111111111
         Quince unos en base 2 es 32767*/

        short miValorShort = 32767;

        //INTEGER
        /*Puede almacenar un valor de 4 bytes (de -2147483648 a 2147483647)
         Treina y un unos en base 2 es 2147483647*/
        int miValorInt = 2_147_483_647;
        System.out.println("miValorInt = " + miValorInt);
        //LONG
        /*Puede almacenar un valor de 8 bytes (de -9223372036854775808 a 9223372036854775807)
         Sesenta y tres unos en base 2 es 9223372036854775807*/
        long miValorLong = 9223372036854775807L;

    }
}
