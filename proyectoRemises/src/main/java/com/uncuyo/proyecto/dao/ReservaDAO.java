/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uncuyo.proyecto.dao;

import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import java.util.List;

public interface ReservaDAO {
    public void insertarReserva(Reserva reserva);
    public Cliente modificarReserva(Reserva reserva);
    public void eliminarReserva(long cod_reserva);
    public Reserva getReserva(Long id);
    public List<Reserva> getReservas();
    public  Long ultimoCodReserva();
}
    
    
