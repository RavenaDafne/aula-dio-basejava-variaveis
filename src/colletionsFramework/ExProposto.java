package colletionsFramework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ExProposto {
    public static void main(String[] args) {
        System.out.println("---\tTemperaturas Médias de Janeiro a Junho: ");
        List<Double> mediaTemperaturas = new ArrayList<Double>();
        mediaTemperaturas.add(30d);
        mediaTemperaturas.add(18.9);
        mediaTemperaturas.add(32.1);
        mediaTemperaturas.add(30.8);
        mediaTemperaturas.add(25.9);
        mediaTemperaturas.add(37d);
        System.out.println(mediaTemperaturas);

        System.out.println("Temperatura Média de Janeiro: " + mediaTemperaturas.get(0));
        System.out.println("Temperatura Média de Fevereiro: " + mediaTemperaturas.get(1));
        System.out.println("Temperatura Média de Março: " + mediaTemperaturas.get(2));
        System.out.println("Temperatura Média de Abril: " + mediaTemperaturas.get(3));
        System.out.println("Temperatura Média de Maio: " + mediaTemperaturas.get(4));
        System.out.println("Temperatura Média de Junho: " + mediaTemperaturas.get(5));



        Iterator<Double> iterator = mediaTemperaturas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A Média das Temperaturas Semestrais é: " + (soma)/6 + "°C");
        System.out.println("Temperaturas Médias Acima da Média Semestral: ");
        Iterator<Double> iterator01 = mediaTemperaturas.iterator();
        while (iterator01.hasNext()) {
            Double next = iterator01.next();
            if (next < (soma / 6)) iterator01.remove();
        }
        System.out.println(mediaTemperaturas);
        System.out.println("Temperatura Média de Janeiro: " + mediaTemperaturas.get(0));
        System.out.println("Temperatura Média de Março: " + mediaTemperaturas.get(1));
        System.out.println("Temperatura Média de Abril: " + mediaTemperaturas.get(2));
        System.out.println("Temperatura Média de Junho: " + mediaTemperaturas.get(3));

    }
}

