/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uncuyo.proyecto.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author spaul
 */
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @Column(name="cod_cliente")
    private Long cod_cliente;
    @Column(name="dni")
    private String dni;
    @Column(name="nombre")
    private String nombre;
    @Column(name="ubicacion")
    private String ubicacion;
    @Column(name="celular")
    private String celular;
    @OneToMany(mappedBy = "cliente",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Reserva> reserva;
    

    public Cliente(Long cod_cliente, String dni, String nombre, String ubicacion, String celular) {
        this.cod_cliente = cod_cliente;
        this.dni = dni;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.celular = celular;
    }
    
    public Cliente() {
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "codigo cliente=" + cod_cliente + ", dni=" + dni + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", celular=" + celular + '}';
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Long getCodCliente() {
        return cod_cliente;
    }

    public void setCodCliente(Long cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }


}
