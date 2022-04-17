package sobrecarga;

public class Main {

    public static void main(String[] args) {
        
        // Quadrilátero
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area( 8, 7, 9);
        float diagonal1 = 5f;
        float diagonal2 = 5f;
        Quadrilatero.area(diagonal1, diagonal2);
    }
}
