package Interface;

public class Triangulo implements Figura{

    int base, altura;

    public Triangulo (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int area() {
        return  base * altura / 2;
    }
}
