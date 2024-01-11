package com.mycompany.personasjsp.servlets;



import com.mycompany.personasjsp.logica.Controladora;
import com.mycompany.personasjsp.logica.Persona;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PersonaSv") // Anotación que define la ruta del servlet
public class PersonaSv extends HttpServlet {

    // Lista de personas (ya no se utiliza directamente, se maneja en la lógica)
    private List<Persona> listaPersonas = new ArrayList<>();
    private Controladora control = new Controladora();

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String consultaApellido = request.getParameter("consultaApellido");

        // Utilizamos el nuevo método en la Controladora para filtrar personas por apellido
        List<Persona> personasCoincidentes = control.filtrarPersonasPorApellido(consultaApellido);

        // Establecer los resultados en la solicitud para que se muestren en el JSP
        request.setAttribute("resultados", personasCoincidentes);

        // Redirigir de vuelta al formulario
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        // Crear una nueva instancia de Persona con los datos del formulario
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setTelefono(telefono);

        // Llamar al método crearPersona en la Controladora para agregar la persona a la base de datos
        control.crearPersona(persona);

        // Redirigir de vuelta al formulario
        response.sendRedirect("index.jsp");
    }
}