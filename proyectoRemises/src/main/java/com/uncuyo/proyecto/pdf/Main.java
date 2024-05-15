/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String outputFile = "C:\\Users\\spaul\\OneDrive\\Documentos\\Base de Datos\\Proyecto Remises\\reporte.pdf";
        //String outputFile = "reporte.pdf";
        
        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);
        
        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        
        contentStream.beginText();
        contentStream.newLineAtOffset(100, 700); // Posición de inicio del primer texto
        contentStream.showText("Reporte de la información contenida en la base de datos:");
        contentStream.newLineAtOffset(0, -25); // Nueva línea
        contentStream.showText("En el presente proyecto, el cual se trata de una empresa de Remises, se ha incluido a la");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("base de datos las entidades referidas al mismo, tales como Empleado, Reserva, Empresa, ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("Cliente, Área y Factura. Estas representan el modelo relacional previamente diseñado y ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("luego normalizado.");
        contentStream.newLineAtOffset(0, -25); // Nueva línea
        contentStream.showText("Por otro lado, en NetBeans, se han incluido únicamente las tablas de Cliente y Reserva, con");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("el objetivo de realizar las ventanas que representen el momento en el que un cliente realiza ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("una reserva, la modifica, cancela o consulta. Para esto, se han utilizado archivos de ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("configuración de Hibernate y de Persistence de Java, los cuales son esenciales para ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("establecer la conexión con la base de datos y configurar cómo se gestionan y mapean ");
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("los objetos Java a las tablas de dicha base de datos, la cual se encuentra en PostgreSQL.");
        contentStream.newLineAtOffset(0, -25); // Nueva línea
        contentStream.showText("También, se ha configurado el archivo pom.xml, el cual es esencial para este proyecto, que ");   
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("se realiza en Java Maven y lo utiliza para compilar el proyecto, gestionar dependencias, "); 
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("ejecutar pruebas y realizar otras tareas. Por ejemplo, para poder realizar este reporte pdf "); 
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("desde NetBeans, se agregó a dicho archivo las dependencias de Apache PDFBox."); 
        contentStream.newLineAtOffset(0, -25); // Nueva línea
        contentStream.showText("En resumen, para poder realizar un desarrollo parcial del sistema en Java para realizar el "); 
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("alta, baja y modificación de datos que involucren las dos tablas de la base de datos "); 
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("previamente mencionada, y para realizar el presente archivo pdf, se realizó la configuración "); 
        contentStream.newLineAtOffset(0, -15); // Nueva línea
        contentStream.showText("de los archivos Hibernate, Persistence y pom.xml y luego se desarrolló el código necesario."); 
                
        contentStream.endText();
        
        
        contentStream.close(); // Importante cerrar el flujo de contenido
        
        document.save(outputFile);
        document.close();
        System.out.println("El archivo PDF se ha creado correctamente.");
    }
}
