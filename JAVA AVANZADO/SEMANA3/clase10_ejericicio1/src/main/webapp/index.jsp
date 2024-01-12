<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="java.util.Map" %>
<%@ page import="com.mycompany.clase10_ejericicio1.logica.Controladora" %>
<%@ page import="com.mycompany.clase10_ejericicio1.logica.Voto" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sistema de Votación</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/superhero/bootstrap.min.css">
    <style>
        body {
            display: flex;
            min-height: 100vh;
            flex-direction: column;
        }

        .container {
            flex: 1;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        
        .table-narrow {
            max-width: 50%; /* Puedes ajustar el porcentaje según tus necesidades */
            margin: 0 auto; /* Centra la tabla horizontalmente */
        }
        
        /* Estilo para el botón 'Votar' */
        .btn-votar {
            background: #212121; 
            color: #FFFFFF;
        }

        /* Estilo para el botón 'Ver Resultados' */
        .btn-ver-resultados {
            background: #212121; 
            color: #FFFFFF; 
        }
        
        /* Estilo de hover para los botones */
        .btn-votar:hover,
        .btn-ver-resultados:hover {
            background: #517fa4;
            color: #212121;
        }
        
        /* Tamaño de fuente para el formulario */
        .form-group label,
        .form-check-input,
        .btn {
            font-size: 1.3em;
        }
    </style>
</head>
<body>
    <div class="container mt-4 text-center">
        <!-- Cambio de color del título -->
        <h1 style="color: #517fa4;">Sistema de Votación Alumnos 4º ESO</h1>
        
        <!-- Formulario de votación -->
        <form action="VotosSv" method="post">
            <div class="form-group">
                <label>Selecciona tu partido:</label>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="partidoVotado" value="Partido A"> PARTIDO A
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="partidoVotado" value="Partido B"> PARTIDO B
                </div>
                <div class="form-check">
                    <input type="radio" class="form-check-input" name="partidoVotado" value="Partido C"> PARTIDO C
                </div>
            </div>
            <button type="submit" class="btn btn-votar">Votar</button>
        </form>

        <br>

        <!-- Botón para mostrar resultados -->
        <form action="VotosSv" method="get">
            <input type="hidden" name="accion" value="MostrarResultados">
            <button type="submit" class="btn btn-ver-resultados">Mostrar Resultados</button>
        </form>
   
        <br>
        <br>

        <!-- Mostrar resultados -->
        <%
            Controladora controladora = new Controladora();
            Map<String, Long> resultados = (Map<String, Long>) request.getAttribute("resultados");
            if (resultados != null) {
                // Ordenar resultados por cantidad de votos de mayor a menor
                List<Map.Entry<String, Long>> list = new ArrayList<>(resultados.entrySet());
                list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

                // Mostrar la tabla ordenada
        %>
                <!-- Cambio de color del título -->
                <h3 style="color: #517fa4;">Resultados de la votación:</h3>
                <table class="table table-striped table-dark table-narrow">
                    <thead>
                        <tr>
                            <th>Partido</th>
                            <th>Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Map.Entry<String, Long> entry : list) {
                        %>
                            <tr>
                                <td><%= entry.getKey() %></td>
                                <td><%= entry.getValue() %></td>
                            </tr>
                        <%
                            }
                        %>
                    </tbody>
                </table>
        <%
            }
        %>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

