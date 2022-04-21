package colletionsFramework;

import java.util.*;

public class ExLista {
    public static void main(String[] args) {

        // List notas = new ArrayList();
        //<Double> --> Generics ... final não é obrigatorio <Double>
        //<> Diamond Operator;
        // ArrayList<Double> notas = new ArrayList<Double>(); (Não é Recomendado se iniciarlizar com a implementação e sim com a interface)
        //List<Double> notas = new ArrayList<>(7d, 8d, 6.5, 9.4, 7d, 5.6, 7.7);
        /*List<Double> notas = Arrays.asList(7d, 8d, 6.5, 9.4, 7d, 5.6, 7.7);
        notas.add(10d);
        System.out.println(notas); Esse metodo não permite adicionar ou remover elementos no array e ao compilar essa adição drá erro */
       /* List<Double> notas = List.of(7d, 8d, 6.5, 9.4, 7d, 5.6, 7.7);
        notas.add(10d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma Lista  e Adicione sete notas:  ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8d);
        notas.add(6.5);
        notas.add(9.4);
        notas.add(7d);
        notas.add(5.6);
        notas.add(7.7);
        System.out.println(notas);
        /*System.out.println(notas.toString());*/

        System.out.println("Exiba a posição da nota 8.0: " + notas.indexOf(8d));

        System.out.println("Adicione na Lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a Nota 8 pela nota 5: ");
        notas.set(notas.indexOf(8d), 5.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " +  notas.contains(5d));

        /*System.out.println("Exiba  todas a notas  na ordem em que  foram informados: ");
        for (Double nota: notas) System.out.println(nota);*/
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " +  soma );

        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota sete: ");
        notas.remove(7d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista:  ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
    }


}
