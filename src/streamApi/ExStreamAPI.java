package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExStreamAPI {
    public static void main(String[] args) {
        List<String> numeroAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
//        System.out.println("Imprima todos os elementos dessa lista de String: ");  MESMO QUE O DE CIMA
//        numeroAleatorios.forEach(System.out::println); MESMO QUE O DE CIMA

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set");
        numeroAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

//        System.out.println("Transforme esta lista de String em uma lista de números inteiros:");
//        numeroAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        System.out.println("Pegue os numeros pares e maiores que 2 coloque em uma lista: ");
        List<Integer> numeroParesMaioresque2 = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i->i % 2 == 0 && i > 2) .collect(Collectors.toList());
        System.out.println(numeroParesMaioresque2);

        System.out.println("Mostre a media dos números: ");
        numeroAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

//        O stream não modifica a fonte de variaveis
        System.out.println("Remova os valores ímpares: ");
//        Como tinha transformado  lista de String em uma lista de números inteiros:  faço->
        List<Integer> numeroAleatoriosInteiros = numeroAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numeroAleatoriosInteiros.removeIf(i1->( i1 % 2 !=0 ));

        System.out.println(numeroAleatoriosInteiros);

    }
                }




//.filter(new Predicate<Integer>() { numeroParesMaioresque2 poe isso...fiz por lambda
//@Override
//public boolean test(Integer i) {
//        if (i % 2 == 0 && i > 2) return true;
//        return false;
//        }
//        }).collect(Collectors.toList());