package com.mycompany.clase10_ejericicio1.servlets;




import com.mycompany.clase10_ejericicio1.logica.Controladora;
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/VotosSv")
public class VotosSv extends HttpServlet {
    private Controladora control = new Controladora();

    // Método para procesar las solicitudes HTTP POST (registro)
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener el partido votado desde los parámetros de la solicitud
        String partidoVotado = request.getParameter("partidoVotado");
        
        // Registrar el voto en la lógica de negocio
        control.registrarVoto(partidoVotado);
        
        // Redirigir de vuelta a la página principal
        response.sendRedirect("index.jsp");
    }

    // Método para procesar las solicitudes HTTP GET (resultados)
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Verificar si la acción solicitada es "MostrarResultados"
        if ("MostrarResultados".equals(request.getParameter("accion"))) {
            // Obtener los resultados de la votación desde la lógica de negocio
            Map<String, Long> resultados = control.contarVotos();
            
            // Almacenar los resultados en el objeto de solicitud para su uso en la página JSP
            request.setAttribute("resultados", new LinkedHashMap<>(resultados));
            
            // Redirigir a la página principal para mostrar los resultados
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}