package Logica;

public class Pikachu extends Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy pikachu y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy pikachu y este es mi ataque arañazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy pikachu y este es mi ataque mordisco");

    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Soy pikachu y este es mi impacto trueno");

    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy pikachu y este es mi puño trueno");

    }
}
