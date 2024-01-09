/*
1.  Inicia creando una clase Vehículo con los atributos modelo, marca y costo, 
luego crea una lista de vehículos. Crea además los constructores de las clases 
y los métodos Setter y Getter.
2.  Crea una clase con el método main para representar un escenario donde se crea una 
lista de vehículos según la siguiente tabla:
Marca           Modelo          Precio
Ford            Fiesta          1000
Ford            Focus           1200
Ford            Explorer        2500
Fiat            Uno             500
Fiat            Cronos          1000
Fiat            Torino          1250
Chevrolet       Aveo            1250
Chevrolet       Spin            2500
Toyota          Corolla         1200
Toyota          Fortuner        3000
Renault         Logan           950
3. Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, 
obtén una lista de vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
4. De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
5. Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios 
mayor o igual 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
*/



/*
2. Crea una clase con el método main para representar un escenario donde se crea una lista
de vehículos según la siguiente tabla:
*/
package com.mycompany.clase8_masterclass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Vehiculo("Fiesta", "Ford", 1000));
        listaVehiculos.add(new Vehiculo("Focus", "Ford", 1200));
        listaVehiculos.add(new Vehiculo("Explorer", "Ford", 2500));
        listaVehiculos.add(new Vehiculo("Uno", "Fiat", 500));
        listaVehiculos.add(new Vehiculo("Cronos", "Fiat", 1000));
        listaVehiculos.add(new Vehiculo("Torino", "Fiat", 1250));
        listaVehiculos.add(new Vehiculo("Aveo", "Chevrolet", 1250));
        listaVehiculos.add(new Vehiculo("Spin", "Chevrolet", 2500));
        listaVehiculos.add(new Vehiculo("Corolla", "Toyota", 1200));
        listaVehiculos.add(new Vehiculo("Fortuner", "Toyota", 3000));
        listaVehiculos.add(new Vehiculo("Logan", "Renault", 950));

        // ver lista con id
        System.out.println("\nVehículos ordenado por id:");
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("ID: " + vehiculo.getId() + ", " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - " + vehiculo.getCosto() + " €");
        }
        
        /*
        3. Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, 
        */
        listaVehiculos.sort(Comparator.comparingDouble(Vehiculo::getCosto));

        // obtén una lista de vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.
        System.out.println("\nVehículos ordenados por precio de menor a mayor:");
        listaVehiculos.forEach(vehiculo -> System.out.println("ID: " + vehiculo.getId() + ", " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - " + vehiculo.getCosto() + " €"));

        /*
        4. De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
        */
        listaVehiculos.sort(Comparator.comparing(Vehiculo::getMarca).thenComparingDouble(Vehiculo::getCosto));

        // Imprimir
        System.out.println("\nVehículos ordenados por marca y precio:");
        listaVehiculos.forEach(vehiculo -> System.out.println("ID: " + vehiculo.getId() + ", " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - " + vehiculo.getCosto() + " €"));

        
        /*
        5. lista de vehículos con precio no mayor a 1000
        */
        List<Vehiculo> precioMenor1000 = listaVehiculos.stream().filter(v -> v.getCosto() <= 1000).collect(Collectors.toList());

        System.out.println("\nVehículos con precio menor a 1000 €:");
        precioMenor1000.forEach(vehiculo -> System.out.println("ID: " + vehiculo.getId() + ", " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - " + vehiculo.getCosto() + " €"));

        // otra con precios mayor o igual 1000
        List<Vehiculo> precioMayor1000 = listaVehiculos.stream().filter(v -> v.getCosto() > 1000).collect(Collectors.toList());
        
        System.out.println("\nLista de vehículos con precio mayor a 1000 €:");
        precioMayor1000.forEach(vehiculo -> System.out.println("ID: " + vehiculo.getId() + ", " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " - " + vehiculo.getCosto() + " €"));

        // promedio total de precios de toda la lista de vehículos
        /*double promedioTotal = listaVehiculos.stream().mapToDouble(Vehiculo::getCosto).average().orElse(0);
        System.out.println("\nPromedio total de los vehículos: " + promedioTotal + "€");
        */
        
        // otra forma de promedio total de precios de toda la lista de vehículos
        double promedioTotal = listaVehiculos.stream().mapToInt(v -> (int) v.getCosto()).average().orElse(0);
        System.out.println("\nPromedio total de los vehículos: " + promedioTotal + "€");

    }
}