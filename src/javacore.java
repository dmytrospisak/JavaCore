import java.util.Arrays;

public class javacore {
    public static void main(String[] args) {

//        System.out.println("Hello World");
//        byte q = 1;
//        short w = 2;
//        int a = 3;
//        long b = 3;
//        float e = 4;
//        double r = 5;
//        char g55;
//        boolean t = true;
//        Byte b1=2;
//        Short s1=2;
//        Integer i1=2;
//        Long l1=2L;
//        Float f1=2f;
//        Double d1=2d;
//        Boolean bl1=true;
//        System.out.println("Byte = " + Byte.MAX_VALUE);
//        System.out.println("Byte = " + Byte.MIN_VALUE);
//        System.out.println("Short = " + Short.MAX_VALUE);
//        System.out.println("Short = " + Short.MIN_VALUE);
//        System.out.println("Integer = " + Integer.MAX_VALUE);
//        System.out.println("Integer = " + Integer.MIN_VALUE);
//        System.out.println("Long = " + Long.MAX_VALUE);
//        System.out.println("Long = " + Long.MIN_VALUE);
//        System.out.println("Double = " + Double.MAX_VALUE);
//        System.out.println("Double = " + Double.MIN_VALUE);
//        System.out.println("Boolean = " + Boolean.TRUE);
//        System.out.println("Boolean = " + Boolean.FALSE);

        int[] array1 = {34, 224, 242, 24, 535, 2, 99, 56648, 34, 67};
        System.out.println(Arrays.stream(array1).min());
        System.out.println(Arrays.stream(array1).max());

    }
}
