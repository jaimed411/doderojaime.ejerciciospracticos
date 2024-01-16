package com.mycompany.clase11_ejericicio1.servlets;


import com.mycompany.clase11_ejericicio1.logica.ControladoraEquipo;
import com.mycompany.clase11_ejericicio1.logica.Equipo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EquipoSv")
public class EquipoSv extends HttpServlet {
    private ControladoraEquipo control = new ControladoraEquipo();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String ciudad = request.getParameter("ciudad");
        String entrenador = request.getParameter("entrenador");
        control.registrarEquipo(nombre, ciudad, entrenador);
        response.sendRedirect("index.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("MostrarEquipos".equals(request.getParameter("accion"))) {
            List<Equipo> equipos = control.listarEquipos();
            request.setAttribute("equipos", equipos);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("BuscarEquipo".equals(request.getParameter("accion"))) {
            String nombreEquipo = request.getParameter("nombreEquipo");
            Equipo equipoBuscado = control.obtenerEquipoPorNombre(nombreEquipo);

            if (equipoBuscado != null) {
                System.out.println("Equipo encontrado: " + equipoBuscado);
            } else {
                System.out.println("Equipo no encontrado");
            }

            request.setAttribute("equipoBuscado", equipoBuscado);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

}
