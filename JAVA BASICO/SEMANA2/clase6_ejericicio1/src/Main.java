/*
Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal

Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación
para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases
abstractas como interfaces para modelar este sistema.

a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.

b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia()
y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases,
deben mostrar un mensaje de qué tipo de recarga están haciendo.

c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico.
Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs).
Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.

d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion.
Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion.
Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor.
Implementa los métodos abstractos de la clase abstracta y los de la interfaz.

f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos,
camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo.
Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía
o combustible según corresponda.

g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.

Nota: Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación del auto. Por ejemplo: 2023 - 2018= 5 años de antigüedad
 */

//-----------------------------------------

/*
f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos,
camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo.
Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía
o combustible según corresponda.
*/

import models.Auto;
import models.Camioneta;
import models.Moto;
import models.Vehiculo;
import interfaces.Electrico;
import interfaces.Combustion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos de vehículos
        Auto autoElectrico = new Auto(1, "J9234", "Tesla", "Model S", 2020, 80000, 10000, 8);
        Camioneta camionetaCombustion = new Camioneta(2, "H4820", "Toyota", "Hilux", 2019, 60000, 80, 12);
        Moto motoCombustion = new Moto(3, "L5840", "Honda", "CBR 600 RR", 2021, 12000, 600, "4 tiempos");
        Moto motoElectrica = new Moto(4, "P4950", "Kawasaki", "Ninja 650", 2023, 30000, 650, "4 tiempos");

        // Añadirlos a ArrayList Vehiculo
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(autoElectrico);
        listaVehiculos.add(camionetaCombustion);
        listaVehiculos.add(motoCombustion);
        listaVehiculos.add(motoElectrica);

/*
g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
 */
        // Mostrar información sobre cada vehículo utilizando polimorfismo
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("ID: " + vehiculo.id);
            System.out.println("Placa: " + vehiculo.placa);
            System.out.println("Marca: " + vehiculo.marca);
            System.out.println("Modelo: " + vehiculo.modelo);
            System.out.println("Año: " + vehiculo.anio);
            System.out.println("Costo: " + vehiculo.costo + " euros");
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            // Verificar si el vehículo implementa la interfaz Electrico o Combustion
            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

            System.out.println();

        }
    }
}
