package colletionsFramework;
//Dados as seguintes informações  sobre  meus livros  favoritos e seus  autores , crie um dicionario e ordene este dicionario:
//exibindo(Nome Autor - Nome Livro);
//
//Autor = Hawking, Stephen - Livro  =  nome: Uma Breve Historia do Tempo.Paginas: 256;
//Autor = Duhigg, Charles - Livro = nome: O poder  do hábito.Paginas:488;
//Autor = Harari, Yuval Noah - Livro = nome: 21 Lições para o Século 21.Paginas:432;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("---\tOrdem Aléatoria\t---");
        Map<String, Livro> meusLivros = new HashMap<>(){{
             put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
             put("Duhigg, Charles", new Livro("O poder  do hábito", 488));
             put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));


        }};

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet())
        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("---\tOrdem de Inserção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O poder  do hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));


        }};

        for(Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("---\tOrdem Alfabetica Autores:\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("---\tOrdem Alfabetica dos Livros:\t---");
         Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>( new ComparatorNome());
         meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        System.out.println("Ordem por Numero de Paginas");

    }
}
class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, int paginas) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}