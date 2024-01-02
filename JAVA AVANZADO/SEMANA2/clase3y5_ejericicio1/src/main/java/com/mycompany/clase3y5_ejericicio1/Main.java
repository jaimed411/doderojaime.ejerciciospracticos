/*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, 
un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). 
Implementa las siguientes operaciones utilizando Streams y Optionals:
1.Filtra los empleados cuyo salario sea mayor a cierto valor específico.
2.Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
3.Encuentra al empleado con el salario más alto utilizando Optionals.
*/


package com.mycompany.clase3y5_ejericicio1;


import com.mycompany.clase3y5_ejericicio1.model.Empleado;
import com.mycompany.clase3y5_ejericicio1.service.ManejoEmpleados;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Información sobre empleados\n");

        // Lista de empleados
        List<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado("Jaime", 3000, "Desarrollador"),
                new Empleado("Jose", 2500, "Diseñador gráfico"),
                new Empleado("Eva", 2650, "Diseñador gráfico"),
                new Empleado("Pedro", 3500, "Gerente"),
                new Empleado("Bea", 4500, "Desarrollador"),
                new Empleado("Johana", 4480, "Desarrollador"),
                new Empleado("Miryam", 5000, "Analista datos"),
                new Empleado("Silvia", 5100, "Analista datos"),
                new Empleado("Diego", 4200, "Desarrollador")
        ));

        // Paso 1
        double salarioMinimo = 4000;
        List<Empleado> empleadosFiltrados = ManejoEmpleados.filtrarPorSalario(empleados, salarioMinimo);
        System.out.println("1. Empleados con salario mayor a " + salarioMinimo + ":");
        empleadosFiltrados.forEach(System.out::println);
        System.out.println();

        // Paso 2
        System.out.println("2. Salario promedio por categoría:");
        ManejoEmpleados.salarioPromedioPorCategoria(empleados).forEach((categoria, promedio) ->
                System.out.println("   " + categoria + ": " + promedio));
        System.out.println();

        // Paso 3
        Optional<Empleado> empleadoSalarioMaximo = ManejoEmpleados.encontrarEmpleadoSalarioMaximo(empleados);
        System.out.println("3. Empleado con salario más alto:");
        empleadoSalarioMaximo.ifPresent(empleado -> System.out.println("   " + empleado));
    }
}
