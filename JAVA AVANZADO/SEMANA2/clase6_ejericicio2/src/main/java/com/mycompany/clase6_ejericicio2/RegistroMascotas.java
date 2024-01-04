package com.mycompany.clase6_ejericicio2;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    // 1. Agregar Mascotas al Registro con java.util y ArrayList
    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    // 2. Buscar Mascotas por Nombre con Collections o Arrays
    public List<Mascota<T>> buscarPorNombre(String nombre) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equals(nombre)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }

    // 2. Buscar Mascotas por Especie con Collections o Arrays
    public List<Mascota<T>> buscarPorEspecie(T especie) {
        List<Mascota<T>> mascotasEncontradas = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                mascotasEncontradas.add(mascota);
            }
        }
        return mascotasEncontradas;
    }
    
    

    // 3. Contar la Cantidad Total de Mascotas Registradas con metodo java.util
    public int contarMascotasRegistradas() {
        return registro.size();
    }

    // 4. Generar Datos Aleatorios con Random 
    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Max", "Luna", "Luz", "Mia", "Charlie", "Bella", "Coco", "Lucas", "Molly", "Toby"};
        String[] especies = {"Perro", "Gato", "Iguana", "Paloma", "Conejo", "Gecko", "Loro", "Hámster"};

        for (int i = 0; i < cantidad; i++) {
            int codigo = i + 1;
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(10) + 1;
            T especie = (T) especies[random.nextInt(especies.length)];

            Mascota<T> mascota = new Mascota<>(codigo, nombre, edad, especie);
            registro.add(mascota);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{registro=[");
        for (Mascota<T> mascota : registro) {
            sb.append("\n").append(mascota).append(",");
        }
        // Eliminar la coma adicional al final de la lista
        if (!registro.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("\n]}");
        return sb.toString();
    }
    
    
}
