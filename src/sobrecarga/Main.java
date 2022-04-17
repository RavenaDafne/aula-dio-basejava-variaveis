package sobrecarga;

public class Main {

    public static void main(String[] args) {
        
        // Quadrilátero
        System.out.println("Exercicio Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area( 8, 7, 9);
        float diagonal1 = 8;
        float diagonal2 = 10;
        Quadrilatero.area(diagonal1, diagonal2);
    }
}
