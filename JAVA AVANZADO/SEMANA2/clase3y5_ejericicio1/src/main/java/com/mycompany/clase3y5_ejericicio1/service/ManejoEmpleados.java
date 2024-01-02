package com.mycompany.clase3y5_ejericicio1.service;


import com.mycompany.clase3y5_ejericicio1.model.Empleado;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ManejoEmpleados {

    // Filtra los salario mayor q
    public static List<Empleado> filtrarPorSalario(List<Empleado> empleados, double salarioMinimo) {
        return empleados.stream()
                .filter(e -> e.getSalario() > salarioMinimo)
                .collect(Collectors.toList());
    }

    // Agrupa empleados x categoría y calcula el salario promedio
    public static Map<String, Double> salarioPromedioPorCategoria(List<Empleado> empleados) {
        return empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));
    }

    // Empleado con el salario más alto con Optionals.
    public static Optional<Empleado> encontrarEmpleadoSalarioMaximo(List<Empleado> empleados) {
        return empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
    }

}
