/*
Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, 
para ello, se solicita la definición de una clase genérica Mascota<T> con atributos como nombre, 
edad, y especie (no olvides el código o id de mascota para identificar a cada una). Crea una clase 
utilitaria propia llamada RegistroMascotas que cuente con métodos genéricos para:
1. Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos 
para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al 
registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
2. Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections 
o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del 
registro de mascotas.
3. Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el 
tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
4. Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos 
aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
 */

package com.mycompany.clase6_ejericicio2;


public class Main {
    public static void main(String[] args) {
        // Crear instancias de mascotas para probar el funcionamiento
        Mascota<String> perro1 = new Mascota<>(1, "Eska", 3, "Perro");
        Mascota<String> perro2 = new Mascota<>(2, "Jara", 11, "Perro");
        Mascota<String> iguana1 = new Mascota<>(3, "Nala", 1, "Iguana");
        Mascota<String> ave1 = new Mascota<>(4, "Polly", 5, "Ave");
        Mascota<String> perro3 = new Mascota<>(5, "Kira", 1, "Perro");
        Mascota<String> gato1 = new Mascota<>(6, "Krusty", 2, "Gato");
        Mascota<String> conejo1 = new Mascota<>(7, "Eska", 4, "Conejo");
        Mascota<String> conejo2 = new Mascota<>(8, "Gus", 3, "Conejo");
        Mascota<String> gecko1 = new Mascota<>(9, "Bru", 2, "Gecko");
        Mascota<String> loro1 = new Mascota<>(10, "Brownie", 5, "Loro");
        Mascota<String> gato2 = new Mascota<>(11, "Marley", 6, "Gato");
        Mascota<String> hamster1 = new Mascota<>(12, "Triki", 1, "Hámster");

        // Crear el registro de mascotas
        RegistroMascotas<String> registro = new RegistroMascotas<>();

        // Agregar mascotas al registro
        registro.agregarMascota(perro1);
        registro.agregarMascota(perro2);
        registro.agregarMascota(iguana1);
        registro.agregarMascota(perro3);
        registro.agregarMascota(gato1);
        registro.agregarMascota(conejo1);
        registro.agregarMascota(conejo2);
        registro.agregarMascota(gecko1);
        registro.agregarMascota(loro1);
        registro.agregarMascota(gato2);
        registro.agregarMascota(hamster1);

        // Buscar mascotas por nombre y especie
        System.out.println("- Mascotas encontradas por nombre: " + registro.buscarPorNombre("Eska"));
        System.out.println("- Mascotas encontradas por especie: " + registro.buscarPorEspecie("Gato"));

        // Contar la cantidad total de mascotas registradas
        System.out.println("- Cantidad mascotas registradas y aleatorias: " + registro.contarMascotasRegistradas());

        // Generar datos aleatorios y agregar mascotas al registro (implementar esta funcionalidad en RegistroMascotas)
        registro.generarDatosAleatorios(2);

        // Mostrar el registro completo de mascotas
        System.out.println("- Lista completa de mascotas (lista y aleatorias): " + registro);
    }
}
