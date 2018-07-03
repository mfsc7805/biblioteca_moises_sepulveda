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
public class IdiomaModelo {
   private EntityManagerFactory entityManagerFactory;
   private EntityManager entityManager;     

    public IdiomaModelo() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("biblioteca_moises_sepulvedaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

 public Idioma crearIdioma(String nombre_idioma){
     Idioma idioma =new Idioma();
     idioma.setNombre_idioma(nombre_idioma);
     this.entityManager.getTransaction().begin();
     this.entityManager.persist(idioma);
     this.entityManager.getTransaction().commit();
       
        return idioma;
 }
 
 public boolean eliminarIdiomaPorId(int idIdioma){
        // Encontrar la venta
        Idioma idioma = this.entityManager.find(Idioma.class, idIdioma);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(idioma);
        this.entityManager.getTransaction().commit();
        return true;
    }
 
 
 
 
     public List<Idioma> listaIdiomas(){
        List<Idioma> lista = this.entityManager.createQuery("SELECT i FROM idioma i").getResultList();
        
        return lista;
    }
     public Idioma porId(int id){
        Idioma idioma = this.entityManager.find(Idioma.class, id);
        
        return idioma;
    }
}
