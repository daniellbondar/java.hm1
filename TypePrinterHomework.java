package com.telran.org.lessontwo;

public class TypePrinterHomework {

    public static void main(String[] args) {

        char charExample = 'G';
        System.out.println("char: " + charExample);

        int intExample = 89;
        System.out.println("integer: " + intExample);

        byte byteExample = 4;
        System.out.println("byte: " + byteExample);

        short shortExample = 56;
        System.out.println("short: " + shortExample);

        float floatExample = 4.7333436f;
        System.out.println("float: " + floatExample);

        double doubleExample = 4.355453532;
        System.out.println("double: " + doubleExample);

        long longExample = 12121l;
        System.out.println("long: " + longExample);

        //Nr 2
        String count = "345";
        System.out.println(count.substring(0,1) + ", " + count.substring(1,2) + ", " + count.substring(2));
    }

}
