package variaveis;

public class VariaveisCasting {

    public static void main(String[] args) {

       byte b1;
       short s1 = 1000;
       b1 = (byte) s1;


       long l2;
       int  i1 = 10;
       l2 = i1;

       int i2;
       l2 = 1000000000L;
       i2 = (int) l2;

       int i3;
       long l3 = 1000000L;
       i3 = (int) l3;

       double d1;
       float f1 = 10.7f;
       d1 = f1;

       float f2;
       float f3;
       double d2 = 100000.5d;
       f2 = (float) d2;
       double d3 = 1000000.8888888888888888888888888888888855555d;
       f3 = (float) d3;

       int i4;
       float f4 = 11.566526f;
       i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("s1: " + s1);
        System.out.println("i1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("d2: " + d2);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);


    }
}
