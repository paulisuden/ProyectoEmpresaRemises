/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uncuyo.proyecto.model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author spaul
 */
@Entity
@Table(name="reserva")
public class Reserva {
    @Id
    @Column(name="cod_reserva")
    private Long cod_reserva;
    @Column(name="destino")
    private String destino;
    @Column(name="existe")
    private Boolean existe;
    @Column(name="fecha")
    private LocalDate fecha;
    @Column(name="hora")
    private LocalTime hora; 
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cod_cliente")
    private Cliente cliente;

    public Reserva(Long cod_reserva, String destino, LocalDate fecha, LocalTime hora, Boolean existe) {
        this.cod_reserva = cod_reserva;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.existe = existe;
    }

    public Reserva() {
    }

    @Override
    public String toString() {
        return "Reserva{" + "codigo reserva=" + cod_reserva + ", destino=" + destino + ", fecha=" + fecha + ", hora=" + hora + '}';
    } 
    
    /**
    @Override
    public String toString() {
        return "Reserva{" + "codigo reserva=" + cod_reserva + ", destino=" + destino + ", fecha=" + fecha + ", hora=" + hora + ", cod_cliente= " + cliente.getCodCliente() + '}';
    }*/
    

    public Long getCodReserva() {
        return cod_reserva;
    }

    public void setCodReserva(Long codReserva) {
        this.cod_reserva = codReserva;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getExiste() {
        return existe;
    }

    public void setExiste(Boolean existe) {
        this.existe = existe;
    }


}
