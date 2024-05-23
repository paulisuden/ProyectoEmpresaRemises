/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.data;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author spaul
 */
public class ExportarDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExportarDatos exportarDatos = new ExportarDatos();
        exportarDatos.exportTableToCSV("cliente", "C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\cliente.csv");
        exportarDatos.exportTableToCSV("reserva", "C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\reserva.csv");
        JOptionPane.showMessageDialog(null, "Datos exportados correctamente");
            
    }
    
    public void exportTableToCSV(String tableName, String filePath) {
        String sqlQuery = "SELECT * FROM " + tableName;
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/uncuyo", "postgres", "basededatos");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery);
             FileWriter writer = new FileWriter(filePath)) {
            // Escribir encabezados de columna
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                writer.append(metaData.getColumnName(i));
                if (i < columnCount) {
                    writer.append(",");
                }
            }
            writer.append("\n");

            // Escribir datos
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    writer.append(resultSet.getString(i));
                    if (i < columnCount) {
                        writer.append(",");
                    }
                }
                writer.append("\n");
            }
            writer.flush();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
    
}
