package colletionsFramework;

import java.sql.Array;
import java.util.*;

public class OrdenacaoLista {
    public static void main(String[] args) {
        List<Dog> meusDogs = new ArrayList<Dog>(){{
            add(new Dog("Raj",11,"Caramelo"));
            add(new Dog("Raj",5,"Branca"));
            add(new Dog("Sky",1,"Preta"));
        }};
        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusDogs);

        System.out.println("---\tOrdem Aleatória\t---");
        Collections.shuffle(meusDogs);
        System.out.println(meusDogs);

        System.out.println("---\tOrdem Natural(Nome)\t---");
        Collections.sort(meusDogs);
        System.out.println(meusDogs);

        System.out.println("---\tOrdem Idade\t---");
        /*Collections.sort(meusDogs, new ComparatorIdade());*/
        meusDogs.sort(new ComparatorIdade());
        System.out.println(meusDogs);

        System.out.println("--\tOrdem Cor\t---");
        /*Collections.sort(meusDogs, new ComparatorCor());*/
        meusDogs.sort(new ComparatorCor());
        System.out.println(meusDogs);

        System.out.println("---\tOrdem de Nome/Cor/Idade\t---");
        meusDogs.sort(new ComparatorNomeCorIdade());
        System.out.println(meusDogs);


    }
}
class Dog implements Comparable<Dog>{
     private String nome;
     private Integer idade;
     private String cor;

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    public Dog(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public int compareTo(Dog dog) {
        return this.getNome().compareToIgnoreCase(dog.getNome());
    }
}
class ComparatorIdade implements Comparator<Dog>{

    @Override
    public int compare(Dog d1, Dog d2) {
        return Integer.compare(d1.getIdade(), d2.getIdade());
    }
}
class ComparatorCor implements Comparator<Dog>{


    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.getCor().compareToIgnoreCase(d2.getCor()) ;
    }
}
class ComparatorNomeCorIdade implements Comparator<Dog>{

    @Override
    public int compare(Dog d1, Dog d2) {
        int nome = d1.getNome().compareToIgnoreCase(d2.getNome());
        if (nome != 0) return  nome;

        int cor = d1.getCor().compareToIgnoreCase(d2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(d1.getIdade(), d2.getIdade());

    }
}

