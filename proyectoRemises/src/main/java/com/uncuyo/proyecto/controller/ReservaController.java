//
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.controller;

import com.uncuyo.proyecto.dao.ReservaDAO;
import com.uncuyo.proyecto.dao.ReservaDAOImp;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author spaul
 */
public class ReservaController {
    ReservaDAO reservadao;
    
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        ReservaController controller = new ReservaController();
        reserva.setCodReserva(2L);
        reserva.setDestino("Regatas Mendoza");
        reserva.setFecha(LocalDate.parse("2024-05-11"));
        reserva.setHora(LocalTime.of(8, 30)); 
        controller.insertarReserva(reserva);
        
        List<Reserva> reservas = controller.getReservas();
        for(Reserva v:reservas){
            System.out.println(v.toString());
        }
    }
    
    public void insertarReserva(Reserva reserva){
        reservadao.insertarReserva(reserva);
    }
    
    public Cliente modificarReserva(Reserva reserva){
        return reservadao.modificarReserva(reserva);
    }
    
    public void eliminarReserva(long cod_reserva){
        reservadao.eliminarReserva(cod_reserva);
    }
    

    public Reserva getReserva(Long id){
        return reservadao.getReserva(id);
    }
    

    public List<Reserva> getReservas() {
        return reservadao.getReservas();
    } 
    
    public ReservaController() {
        reservadao = new ReservaDAOImp();
    }
}
