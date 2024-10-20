/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conectar = null;
    private final String URL = "jdbc:mysql://localhost:3306/ecoapp.login";
    private final String usuario = "root";
    private final String contraseña = "";

    public Connection estableceConexion() {
        try {
            // Conectar a la base de datos.
            conectar = DriverManager.getConnection(URL, usuario, contraseña);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        
        return conectar; // Devolver la conexión establecida.
    }
}