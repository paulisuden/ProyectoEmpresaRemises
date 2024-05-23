/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.data;

import com.uncuyo.proyecto.controller.ClienteController;
import com.uncuyo.proyecto.controller.ReservaController;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class ExportarPDF {

    public void generatePdf(String filePath, List<Reserva> reservas, List<Cliente> clientes) throws DocumentException, FileNotFoundException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
        
        PdfPTable reservaTable = createReservaTable(reservas);
        document.add(new Paragraph("Reservas"));
        document.add(reservaTable);
        document.add(Paragraph.getInstance("\n\n")); // Add some space between tables

        PdfPTable clienteTable = createClienteTable(clientes);
        document.add(new Paragraph("Clientes"));
        document.add(clienteTable);
        JOptionPane.showMessageDialog(null, "PDF generado correctamente");
        document.close();
    }

    private PdfPTable createReservaTable(List<Reserva> reservas) {
        PdfPTable table = new PdfPTable(5); // Number of columns
        table.setWidthPercentage(100);
        
        String[] headers = {"Codigo reserva", "Destino", "Fecha", "Hora", "Codigo cliente"};
        for (String header : headers) {
            PdfPCell cell = new PdfPCell(new Phrase(header));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
        }
        
        for (Reserva reserva : reservas) {
            table.addCell(reserva.getCodReserva().toString());
            table.addCell(reserva.getDestino());
            table.addCell(reserva.getFecha().toString());
            table.addCell(reserva.getHora().toString());
            table.addCell(reserva.getCliente().getCodCliente().toString());
        }
        
        return table;
    }

    private PdfPTable createClienteTable(List<Cliente> clientes) {
        PdfPTable table = new PdfPTable(5); // Number of columns
        table.setWidthPercentage(100);
       
        String[] headers = {"Codigo cliente", "Nombre", "DNI", "Celular", "Ubicación"};
        for (String header : headers) {
            PdfPCell cell = new PdfPCell(new Phrase(header));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);
        }
        
        for (Cliente cliente : clientes) {
            table.addCell(cliente.getCodCliente().toString());
            table.addCell(cliente.getNombre());
            table.addCell(cliente.getDni());
            table.addCell(cliente.getCelular());
            table.addCell(cliente.getUbicacion());
        }
        
        return table;
    }

    public static void main(String[] args) {
        ReservaController reservactrl = new ReservaController();
        ClienteController clientectrl = new ClienteController();
        List<Reserva> reservas = reservactrl.getReservas();
        List<Cliente> clientes = clientectrl.getClientes();

        ExportarPDF generator = new ExportarPDF();
        try {
            generator.generatePdf("C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\reporte.pdf", reservas, clientes);
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

