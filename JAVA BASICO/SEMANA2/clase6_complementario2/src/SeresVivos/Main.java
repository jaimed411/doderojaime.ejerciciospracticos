package SeresVivos;



public class Main {
    public static void main (String[] args) {
        Planta planta  = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();
        AnimalHerbivoro animalHerbivoro = new AnimalHerbivoro();
        AnimalIOmnivoro animalIOmnivoro = new AnimalIOmnivoro();

        planta.alimentarse();
        animalCarnivoro.alimentarse();
        animalHerbivoro.alimentarse();
        animalIOmnivoro.alimentarse();
    }
}