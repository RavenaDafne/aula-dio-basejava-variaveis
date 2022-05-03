package desafioGFT;

import java.util.Arrays;

import java.util.Scanner;

import java.util.function.DoubleBinaryOperator;


public class ExDesafio2GFT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = scan.nextDouble();
        double p = scan.nextDouble();
        double[] coxinha = {h, p};
        System.out.println(Arrays.toString(coxinha));

        if (h >= 1 && p <= 1000) ;
        {
            double media = (h / p);
            System.out.printf("%.2f",  media);
        }

    }
}