
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.controller;

import com.uncuyo.proyecto.dao.ClienteDAO;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.dao.ClienteDAOImp;
import com.uncuyo.proyecto.model.Cliente;
import java.util.List;

/**
 *
 * @author spaul
 */
public class ClienteController {
    ClienteDAO clientedao;

    public static void main(String[] args) {
        // prueba:
    
        Cliente cliente = new Cliente();
        ClienteController controller = new ClienteController(); 
        cliente.setCodCliente(1L);
        cliente.setDni("45256630");
        cliente.setNombre("Paulina Suden");
        cliente.setUbicacion("San martin 123");
        cliente.setCelular("2613045678");
        controller.insertarCliente(cliente); 
    }
    
    //Llamamos a las funciones de ABM y obtención de datos que estan en ClienteDAO
    
    public void insertarCliente(Cliente cliente) {
        clientedao.insertarCliente(cliente);
    }
    
    public void modificarCliente(Cliente cliente) {
        clientedao.modificarCliente(cliente);
    }
    
    public void eliminarCliente(Cliente cliente) {
        clientedao.eliminarCliente(cliente);
    }
    
    public List<Cliente> getClientes(){
        return clientedao.getClientes();
    }
    
    public Cliente getClientes(Long id) {
        return clientedao.getClientes(id);
    }

    public ClienteController() {
        clientedao = new ClienteDAOImp();
    }
    public Long ultimoCodCliente() {
        return clientedao.ultimoCodCliente();
    }
    
}
