//FUNCIONA
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.dao;


import com.uncuyo.proyecto.controller.ReservaController;
import com.uncuyo.proyecto.model.Cliente;
import com.uncuyo.proyecto.model.Reserva;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ReservaDAOImp implements ReservaDAO {
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");   

    public static void main(String[] args) {
        ReservaDAO reservadao = new ReservaDAOImp();
        /**
        List<Reserva> reservas = reservadao.getReservas();
        for(Reserva v:reservas){
            System.out.println(v.toString());
        }*/
    }
    
    @Override
    public void insertarReserva(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); 
        em.persist(reserva); 
        em.getTransaction().commit(); 
        em.close(); 
    }

    @Override
    public Cliente modificarReserva(Reserva reserva) {
        EntityManager em = emf.createEntityManager();
        Cliente c = null; 
            em.getTransaction().begin();
            Reserva a = em.find(Reserva.class, reserva.getCodReserva());
            if (a != null) {
                a.setDestino(reserva.getDestino());
                a.setFecha(reserva.getFecha());
                a.setHora(reserva.getHora());
                em.getTransaction().commit();
                c = a.getCliente();
            } else {
                System.out.println("La reserva con código " + reserva.getCodReserva() + " no existe.");
            }
        return c;
    }
    
    @Override
    public void eliminarReserva(long cod_reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, cod_reserva);
            if (reserva != null) {
                reserva.setExiste(false);
                em.getTransaction().commit();
            } else {
                System.out.println("La reserva con codigo " + cod_reserva + " no existe.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace(); 
        } finally {
            em.close();
        }
    }

    /**
    @Override
    public void eliminarReserva(long cod_reserva) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Reserva reserva = em.find(Reserva.class, cod_reserva);
            if (reserva != null) {
                em.merge(reserva);
                em.remove(reserva);
                em.getTransaction().commit();
            } else {
                System.out.println("La reserva con codigo " + cod_reserva + " no existe.");
            }
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace(); 
        } finally {
            em.close();
        }
    }
*/ 
/**
    @Override
    public Reserva getReserva(Long id){
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas= (List<Reserva>) em.createQuery("From Reserva").getResultList();
        return reservas.getFirst(); 
    } */
    @Override
    public Reserva getReserva(Long id) {
    EntityManager em = emf.createEntityManager();
    Reserva reserva = em.find(Reserva.class, id); // Buscar la reserva por su id
    em.close(); // Cerrar el EntityManager cuando ya no se necesite
    return reserva;
}

    
    @Override
    public List<Reserva> getReservas() {
        EntityManager em = emf.createEntityManager();
        List<Reserva> reservas = null;
        try{
            reservas = (List<Reserva>) em.createQuery("From Reserva").getResultList();        
        }catch(Exception e){
            e.printStackTrace();
        }
        em.close();
        return reservas;
    }
    
    @Override
    public  Long ultimoCodReserva() {
        List<Reserva> reservas;
        ReservaController reservactrl = new ReservaController();
        reservas = reservactrl.getReservas();
        Reserva ultimaR; 
        ultimaR = reservas.getLast();
        Long ultimoC;
        ultimoC = ultimaR.getCodReserva();
        return ++ultimoC;  
    }
    
    
}
