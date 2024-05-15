/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.view;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
         // Crear una instancia de MainFrame
        MainFrame mainFrame = new MainFrame();
       
        
        // Configurar la operación de cierre de la ventana principal
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Mostrar la ventana principal
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
    
}