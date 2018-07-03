/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_moises_sepulveda.modelos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class AutorModelo {
    
    private EntityManagerFactory entityManagerFactory;
   private EntityManager entityManager; 
      

public AutorModelo() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("biblioteca_moises_sepulvedaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

 public Autor crearAutor(String nombre_autor){
     Autor autor =new Autor();
     autor.setNombre_autor(nombre_autor);
     this.entityManager.getTransaction().begin();
     this.entityManager.persist(autor);
     this.entityManager.getTransaction().commit();
       
        return autor;
 }
 
 public boolean eliminarAutorPorId(int idAutor){
        // Encontrar la venta
        Autor autor = this.entityManager.find(Autor.class, idAutor);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(autor);
        this.entityManager.getTransaction().commit();
        return true;
    }
 
 
 
 
     public List<Autor> listaAutores(){
        List<Autor> lista = this.entityManager.createQuery("SELECT a FROM autor a").getResultList();
        
        return lista;
    }
     public Autor porId(int id){
        Autor autor = this.entityManager.find(Autor.class, id);
        
        return autor;
    }
}