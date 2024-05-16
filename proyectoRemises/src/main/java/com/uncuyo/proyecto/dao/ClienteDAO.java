/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uncuyo.proyecto.dao;

import com.uncuyo.proyecto.model.Cliente;
import java.util.List;

public interface ClienteDAO {
    public void insertarCliente(Cliente cliente);
    public void modificarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
    public List<Cliente> getClientes();
    public Cliente getClientes(Long cod_cliente);
    public Long ultimoCodCliente();
}   
