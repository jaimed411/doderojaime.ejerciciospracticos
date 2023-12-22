/*
b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia()
y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases,
deben mostrar un mensaje de qué tipo de recarga están haciendo.
*/

package interfaces;

public interface Combustion {
    // Método para recargar combustible
    void recargarCombustible();
}
