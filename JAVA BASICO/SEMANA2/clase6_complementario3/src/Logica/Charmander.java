package Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy charmander y este es mi ataque arañazo");


    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy charmander y este es mi ataque puño de fuego");

    }
    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy charmander y este es mi ataque lanzallamas");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y este es mi ataque de ascuas");

    }
}
