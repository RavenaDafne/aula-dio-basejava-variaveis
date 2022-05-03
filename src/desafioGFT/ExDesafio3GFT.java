package desafioGFT;
//Entrada
//        A primeira linha contém um inteiro N (1 ≤ N ≤ 100) indicando o número total de figurinhas e espaços no álbum.
//        A segunda linha contém um inteiro M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas.
//        Cada uma das M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma figurinha já comprada.
//
//
//        Saída
//        Seu programa deve produzir uma única linha contendo um inteiro representando o número de figurinhas que falta para completar o álbum.
import java.util.HashSet;
import java.util.*;


public class ExDesafio3GFT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTotal = scan.nextInt();

        int numFigCompradas = scan.nextInt();

        Set<Integer> setFig = new HashSet<>();
        for (int i = 0; i < numFigCompradas; i++) {
            int entrada = scan.nextInt();
            if (entrada <= numTotal) {
                setFig.add(entrada);
            }

        }
        System.out.println(numTotal - setFig.size());

    }
}





