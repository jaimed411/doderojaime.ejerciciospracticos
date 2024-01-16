<%@page import="com.mycompany.clase11_ejericicio1.logica.Partido"%>
<%@ page import="java.util.List" %>
<%@ page import="com.mycompany.clase11_ejericicio1.logica.Equipo" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Sistema de Equipos</title>
    <!-- Enlace a Bootstrap CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Estilos adicionales -->
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin-top: 20px; /* Ajusta según sea necesario */
            margin-bottom: 20px; /* Ajusta según sea necesario */
        }

        h2, h3, h4 {
            color: #00b3aa;
        }

        .btn-primary {
            background-color: #00b371;
            border: none;
        }

        .btn-primary:hover {
            background-color: #b3002d;
        }

        .mt-4 {
            margin-top: 20px; 
        }

        /* Ajuste del ancho de las líneas del formulario */
        .form-group {
            max-width: 400px; 
            margin: 0 auto; 
        }
    </style>
</head>
<body>
    <h1 style="text-align: center; color: #b3002d;">____________ Gestión Torneo ACB 2024 ____________</h1>
        
    <!-- Caja 1 -->
    <div class="container text-center">
        <h2>Registrar Equipo</h2>

        <!-- Formulario para registrar equipo -->
        <form action="EquipoSv" method="post" class="mt-3">
            <div class="form-group">
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="ciudad">Ciudad:</label>
                <input type="text" name="ciudad" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="entrenador">Entrenador:</label>
                <input type="text" name="entrenador" class="form-control" required>
            </div>
            <p>
                
            </p>
            <button type="submit" class="btn btn-primary">Registrar Equipo</button>
        </form>
    </div>

    <!-- Caja 2 -->
    <div class="container text-center mt-4">
        <h3>Equipos Registrados</h3>
        <form action="EquipoSv" method="get">
            <input type="hidden" name="accion" value="MostrarEquipos">
            <button type="submit" class="btn btn-primary mt-3">Ver Equipos</button>
        </form>
        <%
            List<Equipo> equipos = (List<Equipo>) request.getAttribute("equipos");
            if (equipos != null && !equipos.isEmpty()) {
        %>
            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Ciudad</th>
                        <th>Entrenador</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Equipo equipo : equipos) {
                    %>
                        <tr>
                            <td><%= equipo.getId() %></td>
                            <td><%= equipo.getNombre() %></td>
                            <td><%= equipo.getCiudad() %></td>
                            <td><%= equipo.getEntrenador() %></td>
                        </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        <%
            } else {
        %>
        <%
            }
        %>
    </div>

    <!-- Caja 3 -->
    <div class="container text-center mt-4">
        <h3>Buscar Información de Equipo</h3>
        <form action="EquipoSv" method="get">
            <input type="hidden" name="accion" value="BuscarEquipo">
            <div class="form-group">
                <label for="nombreEquipo">Nombre del Equipo:</label>
                <input type="text" name="nombreEquipo" class="form-control" required>
            </div>
            <p>
                
            </p>
            <button type="submit" class="btn btn-primary">Buscar Equipo</button>
        </form>

        <!-- Mostrar información del equipo buscado -->
        <%
            Equipo equipoBuscado = (Equipo) request.getAttribute("equipoBuscado");
            if (equipoBuscado != null) {
        %>
            <div class="container text-center mt-4">
                <h4>Información del Equipo:</h4>
                <table class="table table-bordered table-striped">
                    <thead class="thead-dark">
                        <tr>
                            <th>ID</th>
                            <th>Nombre</th>
                            <th>Ciudad</th>
                            <th>Entrenador</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><%= equipoBuscado.getId() %></td>
                            <td><%= equipoBuscado.getNombre() %></td>
                            <td><%= equipoBuscado.getCiudad() %></td>
                            <td><%= equipoBuscado.getEntrenador() %></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        <%
            }
        %>
    </div>

    <!-- Caja 4 -->
    <div class="container text-center mt-4">
        <h3>Registrar Partido</h3>
        
        <!-- Formulario para registrar partido -->
        <form action="PartidoSv" method="post" class="mt-4">
            <div class="form-group">
                <label for="equipoLocal">Equipo Local:</label>
                <input type="text" name="equipoLocal" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="equipoVisitante">Equipo Visitante:</label>
                <input type="text" name="equipoVisitante" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="fecha">Fecha:</label>
                <input type="date" name="fecha" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="resultadoLocal">Resultado Equipo Local:</label>
                <input type="text" name="resultadoLocal" class="form-control" required>
            </div>
            <div class="form-group">
                <label for="resultadoVisitante">Resultado Equipo Visitante:</label>
                <input type="text" name="resultadoVisitante" class="form-control" required>
            </div>
            <p>
                
            </p>
            <button type="submit" class="btn btn-primary">Registrar Partido</button>
        </form>
    </div>

    <!-- Caja 5 -->
    <div class="container text-center mt-4">
        <h3>Partidos Registrados</h3>
        <form action="PartidoSv" method="get">
            <input type="hidden" name="accion" value="MostrarPartidos">
            <button type="submit" class="btn btn-primary mt-3">Ver Partidos</button>
        </form>
        <%
            List<Partido> partidos = (List<Partido>) request.getAttribute("partidos");
            if (partidos != null && !partidos.isEmpty()) {
        %>
            <table class="table table-bordered table-striped">
                <thead class="thead-dark">
                    <tr>
                        <th>ID</th>
                        <th>Fecha</th>
                        <th>Resultado Local</th>
                        <th>Resultado Visitante</th>
                        <th>ID Equipo Local</th>
                        <th>ID Equipo Visitante</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (Partido partido : partidos) {
                    %>
                        <tr>
                            <td><%= partido.getId() %></td>
                            <td><%= partido.getFecha() %></td>
                            <td><%= partido.getResultadoEquipoLocal() %></td>
                            <td><%= partido.getResultadoEquipoVisitante() %></td>
                            <td><%= partido.getEquipoLocal().getId() %></td>
                            <td><%= partido.getEquipoVisitante().getId() %></td>
                        </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        <%
            } else {
        %>
        <%
            }
        %>
    </div>

    <!-- Scripts de Bootstrap -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
