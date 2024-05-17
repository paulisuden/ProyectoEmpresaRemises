//FUNCIONA!!!, FALTA GENERAR CODCLIENTE ALEATORIO!
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uncuyo.proyecto.dao;

import com.uncuyo.proyecto.controller.ClienteController;
import com.uncuyo.proyecto.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author spaul
 */
public class ClienteDAOImp implements ClienteDAO{
private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");    

    public static void main(String[] args) {
        ClienteDAO clientedao = new ClienteDAOImp();
        ////////Falta genrerar el codCliente
        /**Cliente cliente = new Cliente();
        cliente.setCodCliente(3L);
        cliente.setNombre("Pauli");
        cliente.setUbicacion("Maipu 123");
        cliente.setDni("45345567");
        cliente.setCelular("2614567890");
        clientedao.insertarCliente(cliente); //insertamos a la base el cliente */
           
        List<Cliente> clientes = clientedao.getClientes();
        for(Cliente v:clientes){
            System.out.println(v.toString());
        }
    }
    //Las operaciones de persistencia (insertar, actualizar o eliminar entidades) en JPA generalmente 
    //se realizan dentro de una transacción para garantizar la consistencia de los datos:
    @Override
    public void insertarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager(); //EntityManager: interfaz de JPA. Se utiliza para realizar
                                                      //operaciones de persistencia en la base de datos.
        em.getTransaction().begin(); //Se comienza la transacción
        em.persist(cliente); //indica al EntityManager que el cliente debe ser persistido en la base de datos. 
                             //Esto marca el objeto cliente para ser insertado en la base de datos durante la próxima 
                             //operación de flush (volcado) de la transacción.
        em.getTransaction().commit(); //Se confirma la transacción: 
                                      //confirma todas las operaciones de persistencia realizadas dentro de la
                                      //transacción, incluida la inserción del cliente en la base de datos.
        em.close(); //Se cierra el EntityManager 
                   //Es importante cerrarlo después de su uso para liberar recursos y 
                   //evitar problemas de fuga de memoria.
    }

    @Override
    public void modificarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();        
        Cliente a = em.find(Cliente.class,cliente.getCodCliente());
        //El método find() del EntityManager busca una entidad Cliente en la base de datos (Cliente.class) 
        //con su correspondiente CP (cliente.getCodCliente()).
        em.getTransaction().begin();
        a.setNombre(cliente.getNombre());
        a.setUbicacion(cliente.getUbicacion());
        a.setCelular(cliente.getCelular()); 
        a.setDni(cliente.getDni());
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Cliente a = em.find(Cliente.class,cliente.getCodCliente());
        em.remove(a); //Elimina dicho cliente.
        em.getTransaction().commit();
        em.close();
    }
    
    /////////Corregir con el codCliente
    @Override
    public Cliente getClientes(Long id){
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes= (List<Cliente>) em.createQuery("From Cliente").getResultList();     
        //"From Cliente" recupera todas las instancias de la entidad Cliente de la base de datos. 
        //getResultList() obtiene el resultado como una lista de objetos Cliente.
        return clientes.getFirst(); 
        //getFirst() obtiene el primer cliente de la lista (que va a ser el único por su CP).
    }
    
    @Override
    public List<Cliente> getClientes() {
        EntityManager em = emf.createEntityManager();
        List<Cliente> clientes = null;
        try{
            clientes = (List<Cliente>) em.createQuery("From Cliente").getResultList();        
        }catch(Exception e){
            e.printStackTrace();
            //proporciona información sobre la excepción que ocurrió (Caso en que no haya clientes creo)
        }
        em.close();
        return clientes;
    } 
    
    @Override
    public Long ultimoCodCliente() {
        List<Cliente> clientes;
        ClienteController clientectrl = new ClienteController();
        clientes = clientectrl.getClientes();
        Cliente ultimoC; 
        ultimoC = clientes.getLast();
        Long ultimoCod;
        ultimoCod = ultimoC.getCodCliente();
        return ++ultimoCod;  
    }

}
