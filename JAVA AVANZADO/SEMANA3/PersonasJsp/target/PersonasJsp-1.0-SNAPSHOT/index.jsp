<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.personasjsp.logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Datos Personales</title>
    <!-- Agregar estilos de Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/superhero/bootstrap.min.css">
    
    <style>
        /* Estilo para el degradado de verde a morado en los botones */
        .btn-degradado {
            background: radial-gradient(circle, #750202, #fa5c07); /* Cambia estos colores según tus preferencias */
            color: #fff; /* Color del texto */
        }
    </style>
    
</head>
<body>
    <div class="container mt-4">
        <h2>Datos Personales</h2>
        <!-- Formulario para crear una nueva persona -->
        <form action="PersonaSv" method="post">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" class="form-control" id="nombre" name="nombre">
            </div>
            <div class="form-group">
                <label for="apellido">Apellido:</label>
                <input type="text" class="form-control" id="apellido" name="apellido">
            </div>
            <div class="form-group">
                <label for="telefono">Teléfono:</label>
                <input type="text" class="form-control" id="telefono" name="telefono">
            </div>
            <button type="submit" class="btn btn-primary btn-degradado">Enviar</button>
        </form>

        <hr>

        <h2>Consultar por Apellido</h2>
        <!-- Formulario para buscar personas por apellido -->
        <form action="PersonaSv" method="get">
            <div class="form-group">
                <label for="consultaApellido">Consultar por Apellido:</label>
                <input type="text" class="form-control" id="consultaApellido" name="consultaApellido">
            </div>
            <button type="submit" class="btn btn-primary btn-degradado">Buscar</button>
        </form>
   
        <br>
        <br>
        <!-- Resultados en tabla -->
        <div class="results-table">
            <!-- Verifica si hay resultados en la solicitud -->
            <% if (request.getAttribute("resultados") != null) { %>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Teléfono</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- Itera sobre la lista de personas y muestra los detalles en la tabla -->
                        <% for (Persona persona : (ArrayList<Persona>) request.getAttribute("resultados")) { %>
                            <tr>
                                <td><%= persona.getNombre() %></td>
                                <td><%= persona.getApellido() %></td>
                                <td><%= persona.getTelefono() %></td>
                            </tr>
                        <% } %>
                    </tbody>
                </table>
            <% } %>
        </div>
    </div>
    <!-- Scripts de Bootstrap -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</body>
</html>
