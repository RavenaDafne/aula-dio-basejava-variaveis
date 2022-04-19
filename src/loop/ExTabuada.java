package loop;

import java.util.Scanner;

public class ExTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        int count;

        System.out.println("Tabuada de : " + tabuada);

        for( count = 0; count <=10; count++ ){
            System.out.println(tabuada + "x"+ count + "=" +  (tabuada * count));
        }
    }
}
