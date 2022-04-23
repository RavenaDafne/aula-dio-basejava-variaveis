package colletionsFramework;

import java.util.*;

// Dados Os modelos  dos carros  e seus  respectivos  consumos na estrada ,faça:
//modelo = gol - consumo 14,4 hm/l
//modelo = uno - consumo 15,6 hm/l
//modelo = mobi - consumo 16,1 hm/l
//modelo = hb20  - consumo 14,5 hm/l
//modelo = kwid  - consumo 15,6 hm/l
public class ExMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares);
        System.out.println("Substitua  o consumo do Gol por 15,2km/l: ");
        carrosPopulares.put("gol", 16.0);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//        System.out.println("Mostre o terceiro  modelo adicionado:"); Não mostra

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("Exiba o modelo mais eficiente: ");
        Double consumoMaisEfieciente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEfieciente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEfieciente)) {
                modeloMaisEfieciente = entry.getKey();
                System.out.println("Modelo : " + modeloMaisEfieciente + " - " + consumoMaisEfieciente + " km/l ");
            }

        }
        System.out.println("Exiba o modelo menos eficiente: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEfieciente = "";

        for (Map.Entry<String, Double> entry: entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEfieciente = entry.getKey();
                System.out.println("Modelo : " + modeloMenosEfieciente + " - " + consumoMenosEficiente + " km/l ");
            }

        }
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma );

        System.out.println("Exiba a média dos consumos  dete dicionario de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com o consumo igual a 15,6km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);
        System.out.println("Exiba todos os carros na ordem em que forma informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares1);

        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares2);

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Verifique se o dicionario esta vazio: " + carrosPopulares.isEmpty());

    }
}
