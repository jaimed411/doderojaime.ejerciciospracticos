/*
Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. 
Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase 
utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
1. Agregar Autos al Inventario: Utiliza un método genérico para agregar autos 
al inventario de la concesionaria.
2. Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos 
por marca o año dentro del inventario.
3. Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el 
valor total de todos los autos en el inventario. 
*/

package com.mycompany.clase6_ejericicio1;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de autos
        Auto auto1 = new Auto("BMW", "Serie 3", 2021, 45000.0);
        Auto auto2 = new Auto("Mercedes-Benz", "Clase C", 2022, 48000.0);
        Auto auto3 = new Auto("Audi", "A4", 2020, 40000.0);
        Auto auto4 = new Auto("Volkswagen", "Golf", 2021, 32000.0);
        Auto auto5 = new Auto("Volvo", "XC60", 2022, 55000.0);
        Auto auto6 = new Auto("Jaguar", "F-PACE", 2020, 60000.0);
        Auto auto7 = new Auto("Land Rover", "Discovery", 2022, 65000.0);
        Auto auto8 = new Auto("Porsche", "911", 2021, 120000.0);
        Auto auto9 = new Auto("Ferrari", "Portofino", 2020, 250000.0);
        Auto auto10 = new Auto("Lamborghini", "Huracán", 2022, 300000.0);
        Auto auto11 = new Auto("Alfa Romeo", "Giulia", 2021, 40000.0);
        Auto auto12 = new Auto("Maserati", "Quattroporte", 2020, 80000.0);
        Auto auto13 = new Auto("Aston Martin", "DB11", 2022, 250000.0);
        Auto auto14 = new Auto("Bentley", "Continental GT", 2021, 220000.0);
        Auto auto15 = new Auto("Bugatti", "Chiron", 2020, 3000000.0);
        Auto auto16 = new Auto("McLaren", "720S", 2022, 300000.0);
        Auto auto17 = new Auto("Rolls-Royce", "Phantom", 2021, 450000.0);
        Auto auto18 = new Auto("Mini", "Cooper", 2020, 25000.0);
        Auto auto19 = new Auto("Smart", "ForTwo", 2022, 18000.0);
        Auto auto20 = new Auto("Tesla", "Model S", 2021, 80000.0);

        //1. Agregar Autos al Inventario
        InventarioAutos<Auto> inventario = new InventarioAutos<>();
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);
        inventario.agregarAuto(auto4);
        inventario.agregarAuto(auto5);
        inventario.agregarAuto(auto6);
        inventario.agregarAuto(auto7);
        inventario.agregarAuto(auto8);
        inventario.agregarAuto(auto9);
        inventario.agregarAuto(auto10);
        inventario.agregarAuto(auto11);
        inventario.agregarAuto(auto12);
        inventario.agregarAuto(auto13);
        inventario.agregarAuto(auto14);
        inventario.agregarAuto(auto15);
        inventario.agregarAuto(auto16);
        inventario.agregarAuto(auto17);
        inventario.agregarAuto(auto18);
        inventario.agregarAuto(auto19);
        inventario.agregarAuto(auto20);

        
        System.out.println("INVENTARIO COCHES 2024 DODRACING:");
        System.out.println(".................................");
        System.out.println("");

        //2. Buscar Autos por Marca
        List<Auto> maserati = inventario.buscarPorMarca("Maserati");
        System.out.println("COCHES DE MARCA MASERATI:");
        for (Auto auto : maserati) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }
        
        List<Auto> Volkswagen = inventario.buscarPorMarca("Volkswagen");
        System.out.println("COCHES DE MARCA VOLKSWAGEN:");
        for (Auto auto : Volkswagen) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }
        

        //2. Buscar Autos por Año
        List<Auto> autos2021 = inventario.buscarPorAño(2021);
        System.out.println("\nCOCHES DEL AÑO 2021:");
        for (Auto auto : autos2021) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }
        
        List<Auto> autos2022 = inventario.buscarPorAño(2022);
        System.out.println("\nCOCHES DEL AÑO 2022:");
        for (Auto auto : autos2021) {
            System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAño());
        }

        //3. Calcular el Valor Total del Inventario
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("\nVALOR TOTAL DEL INVENTARIO: " + valorTotal + "€");
    }
}