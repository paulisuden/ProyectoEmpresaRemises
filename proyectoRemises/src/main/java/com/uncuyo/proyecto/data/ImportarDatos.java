/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.data;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author spaul
 */
public class ImportarDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImportarDatos importarDatos = new ImportarDatos();
        importarDatos.importTableFromCSV("C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\cliente.csv", "cliente");
        importarDatos.importTableFromCSV("C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\reserva.csv", "reserva"); 
        JOptionPane.showMessageDialog(null, "Datos importados correctamente");
        
    }
    
    public void importDataFromCSV() {
    importTableFromCSV("ruta_cliente.csv", "cliente");
    importTableFromCSV("ruta_reserva.csv", "reserva");
}

    public void importTableFromCSV(String filePath, String tableName) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/uncuyo", "postgres", "basededatos");
             FileReader fileReader = new FileReader(filePath);
             CSVReader csvReader = new CSVReader(fileReader)) {
            String[] nextRecord;
            // Ignorar la primera fila (encabezados de columna)
            csvReader.skip(1);
            while ((nextRecord = csvReader.readNext()) != null) {
                // Generar la sentencia SQL para insertar datos en la tabla
                String sqlQuery = generateInsertQuery(tableName, nextRecord);
                try (Statement statement = connection.createStatement()) {
                    statement.executeUpdate(sqlQuery);
                }
            }
        } catch (SQLException | IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }

    public String generateInsertQuery(String tableName, String[] values) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("INSERT INTO ").append(tableName).append(" VALUES (");
        for (int i = 0; i < values.length; i++) {
            queryBuilder.append("'").append(values[i]).append("'");
            if (i < values.length - 1) {
                queryBuilder.append(",");
            }
        }
        queryBuilder.append(")");
        return queryBuilder.toString();
    }

    
}
