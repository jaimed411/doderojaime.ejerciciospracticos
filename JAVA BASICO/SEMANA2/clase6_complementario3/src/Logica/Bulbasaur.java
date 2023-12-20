package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy bulbasaur y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy bulbasaur y este es mi ataque arañazo");


    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy bulbasaur y este es mi ataque mordisco");


    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasaur y este es mi ataque drenaje");


    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy bulbasaur y este es mi ataque paralizar");



    }
}
