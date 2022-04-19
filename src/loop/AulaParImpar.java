package loop;

import java.util.Scanner;

public class AulaParImpar {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        int qntNumeros;
        int count = 0;
        int numero;
        int qntPar = 0;
        int qntImpar = 0;

        System.out.println("Quantidade de Número: ");
        qntNumeros = scan.nextInt();


        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count = count +1;

            if (numero % 2 == 0) qntPar++;
            else qntImpar++;

        }while( count < qntNumeros);


        System.out.println("Quantidade de Numeros pare: " + qntPar);
        System.out.println("Quantidade de Numeros impares: " + qntImpar);
    }
}
