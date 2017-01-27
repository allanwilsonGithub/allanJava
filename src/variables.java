/**
 * Created by awil on 2017-01-23.
 */
public class variables {

    public static void main(String[] args) {

        //Quick test
        byte allanByte = 126;
        short allanShort = 23;
        int allanInt = 354;
        long allanTotal = 50000 + 10*(allanByte + allanShort + allanInt);
        System.out.println(allanTotal);


        // int has a width of 32
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;
        System.out.println(myMinValue);
        System.out.println(myMaxValue);

        // byte has a width of 8
        byte myByteValue = 127;
        byte newByteValue = (byte) (myByteValue/2);
        System.out.println(newByteValue);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64
        long myLongValue=100L;
    }
}
