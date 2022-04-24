package colletionsFramework;
//Dada a população estimada de alguns estados do NE brasileiro, faça:
//        Estado = PE - População = 9.616.621
//        Estado = AL - População = 3.351.543
//        Estado = CE - População = 9.187.103
//        Estado = RN - População = 3.534.265
//        Crie um dicionário e relacione os estados e suas populações;
//        Substitua a população do estado do RN por 3.534.165;
//        Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
//        Exiba a população PE;
//Exiba todos os estados e suas populações na ordem que foi informado;
//        Exiba os estados e suas populações em ordem alfabética;
//        Exiba o estado com o menor população e sua quantidade;
//        Exiba o estado com a maior população e sua quantidade;
//        Exiba a soma da população desses estados;
//        Exiba a média da população deste dicionário de estados;
//        Remova os estados com a população menor que 4.000.000;
//        Apague o dicionário de estados;
//        Confira se o dicionário está vazio.



import java.util.*;

public class ExPropostoMap {
    public static void main(String[] args) {
        Map<String, Double> estadoPopulacao = new HashMap<>() {{
            put("Estado:PE", 9616621d);
            put("Estado:AL", 3351543d);
            put("Estado:CE", 9187103d);
            put("Estado:RN", 3534265d);

        }};
        System.out.println(estadoPopulacao);

        System.out.println("---\tSubstitua a população do estado do RN por 3.534.165\t--- ");
        estadoPopulacao.put("Estado:RN", 3534165d);
        System.out.println(estadoPopulacao);

        System.out.println("---\tConfirindo se o estado PB está no dicionário\t--- " + estadoPopulacao.containsKey("Estado:RB"));
        System.out.println("---\tAdicionando o Estado:PB - 4.039.277 habitantes\t--- ");
        estadoPopulacao.put("Estado:PB", 4039277d);
        System.out.println(estadoPopulacao);

        System.out.println("---\tExiba a população PE\t--- " + estadoPopulacao.get("Estado:PE"));

        System.out.println("---\tExiba todos os estados e suas populações na ordem que foi informado\t---");
        Map<String, Double> estadoPopulacao2 = new LinkedHashMap<>() {{
            put("Estado:PE", 9616621d);
            put("Estado:AL", 3351543d);
            put("Estado:CE", 9187103d);
            put("Estado:RN", 3534265d);

        }};
        System.out.println(estadoPopulacao2);

        System.out.println("---\tExiba o estado com o menor população e sua quantidade\t---");
        Double menorPopulacao = Collections.min(estadoPopulacao.values());
        Set<Map.Entry<String, Double>> entries = estadoPopulacao.entrySet();
        String estadoMenorPopulacao = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado : " + estadoMenorPopulacao + " - " + menorPopulacao + " habitantes ");
            }

        }
        System.out.println("---\tExiba o estado com o maior população e sua quantidade---\t");
        Double maiorPopulacao = Collections.max(estadoPopulacao.values());
        Set<Map.Entry<String, Double>> entries1 = estadoPopulacao.entrySet();
        String estadoMaiorPopulacao = "";

        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado : " + estadoMaiorPopulacao + " - " + maiorPopulacao + " habitantes ");
            }


        }

        System.out.println("---\tExiba a soma da população desses estados\t---");
        Iterator<Double> iterator = estadoPopulacao.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("A soma da população desses estados é: " + soma);

        System.out.println("---\tExiba a média da população deste dicionário de estados\t---");
        System.out.println("A soma da população desses estados é: " + (soma / estadoPopulacao.size()));

        System.out.println("---\tRemova os estados com a população menor que 4.000.000\t---");
        Iterator<Double> iterator1 = estadoPopulacao.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 4000000d) iterator1.remove();
        }
        System.out.println(estadoPopulacao);

        System.out.println("---\tApague o dicionário de estados\t---");
        estadoPopulacao.clear();
        System.out.println(estadoPopulacao);

        System.out.println("---\tConfira se o dicionário está vazio\t---" + estadoPopulacao.isEmpty());


    }
}
