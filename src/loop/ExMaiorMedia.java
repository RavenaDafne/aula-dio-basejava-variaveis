package loop;

import java.util.Scanner;

public class ExMaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        double soma = 0d;


        do {
            System.out.println("Digite o Número: ");
            numero = scan.nextInt();
            count = count + 1;

            soma = soma + numero;



            if (numero > maior) maior = numero;

        } while (count < 5);

        System.out.println("O Maior Numero é: " + maior);
        System.out.println("A media é: " + (soma/5));
    }
}
