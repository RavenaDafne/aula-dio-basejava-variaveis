package loop;

import java.util.Scanner;

public class ExFatorial {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Fatorial:  ");
        int fatorial = scan.nextInt();
        int multi = 1;
        int count;

        System.out.print(fatorial + "! = ");

        for(count = fatorial; count >=1; count--){
            multi = count * multi;

        }
        System.out.println(multi);
    }
}
