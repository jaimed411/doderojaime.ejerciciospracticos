package com.mycompany.clase11_ejericicio1.servlets;


import com.mycompany.clase11_ejericicio1.logica.ControladoraPartido;
import com.mycompany.clase11_ejericicio1.logica.Equipo;
import com.mycompany.clase11_ejericicio1.logica.Partido;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@WebServlet("/PartidoSv")
public class PartidoSv extends HttpServlet {

    private ControladoraPartido controlPartido = new ControladoraPartido();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreEquipoLocal = request.getParameter("equipoLocal");
        String nombreEquipoVisitante = request.getParameter("equipoVisitante");
        String fechaStr = request.getParameter("fecha");
        String resultadoLocalStr = request.getParameter("resultadoLocal");
        String resultadoVisitanteStr = request.getParameter("resultadoVisitante");

        try {
            // Convertir fecha y resultados a los tipos adecuados (Date e int)
            Date fecha = new SimpleDateFormat("yyyy-MM-dd").parse(fechaStr);
            int resultadoLocal = Integer.parseInt(resultadoLocalStr);
            int resultadoVisitante = Integer.parseInt(resultadoVisitanteStr);

            // Obtener id de los equipos
            List<Equipo> equiposLocal = controlPartido.obtenerEquiposPorNombre(nombreEquipoLocal);
            List<Equipo> equiposVisitante = controlPartido.obtenerEquiposPorNombre(nombreEquipoVisitante);

            if (!equiposLocal.isEmpty() && !equiposVisitante.isEmpty()) {
                Equipo equipoLocal = equiposLocal.get(0);
                Equipo equipoVisitante = equiposVisitante.get(0);

                // Registrar el partido
                controlPartido.registrarPartido(fecha, equipoLocal, equipoVisitante, resultadoLocal, resultadoVisitante);

                // Redirige a la página principal
                response.sendRedirect("index.jsp");
            } else {
                // Maneja el caso en el que no se encuentren equipos
                response.getWriter().println("No se encontraron equipos con los nombres proporcionados.");
            }
        } catch (ParseException | NumberFormatException e) {
            e.printStackTrace();
            // Maneja el caso en el que haya errores en la conversión
            response.getWriter().println("Error en el formato de la fecha o los resultados.");
        }
    }




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Partido> partidos = controlPartido.listarPartidos();
        request.setAttribute("partidos", partidos);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
