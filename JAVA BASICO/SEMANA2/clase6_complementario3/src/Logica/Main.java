package Logica;

public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarAraniazo();
        pikachu.atacarImpacTrueno();
        pikachu.atacarAraniazo();
    }
}
