package Interface;



public class Main {

    public static void main (String[] args) {

        Rectangulo r1;
        Triangulo t1;

        r1 = new Rectangulo(12,7);
        t1 = new Triangulo(2,5);

        System.out.println("El área del rectangulo es: " + r1.area());
        System.out.println("El área del triangulo es: " + t1.area());

    }
}