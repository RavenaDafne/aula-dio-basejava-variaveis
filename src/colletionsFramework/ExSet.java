package colletionsFramework;


import java.util.*;

public class ExSet {
    public static void main(String[] args) {
        System.out.println("Crie um Conjunto e Adicione as Notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        /*System.out.println("Exiba  a posição  da nota 5.0: ");Não conseguimos pesquisar os dados*/

        /*System.out.println("Adicione a nota 8 na Posição 4: "); Não Conseguimos fazer */

        /*System.out.println("Subistitua a nota 5.0 pela nota 6.0: "); Não Conseguimos fazer*/

        System.out.println("Confira se a nota 5 está no Conjunto: " + notas.contains(5d));
        System.out.println(notas);

        /*System.out.println("Exiba a terceira nota adiciona"); Não é possivel pois nao tem indices*/

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println(notas);

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println(notas);

        Iterator<Double> iterator = notas.iterator();
        Double  soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma das notas: " + soma );

        System.out.println("Média das notas : " + (soma/ notas.size()));

        System.out.println("Remova a nota 0:" + notas.remove(0d));
        System.out.println(notas);

//        System.out.println("Remova a nota da posição 0:"); Não tem como saber e fazer!

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba as notas na ordem que foi inseriadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba as notas  na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o Conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " +notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " +notas3.isEmpty());





    }

}
