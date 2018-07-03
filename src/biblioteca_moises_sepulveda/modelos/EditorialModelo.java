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
public class EditorialModelo {
      private EntityManagerFactory entityManagerFactory;
   private EntityManager entityManager;     

    public EditorialModelo() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("biblioteca_moises_sepulvedaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

 public Editorial crearEditorial(String nombre_editorial){
     Editorial editorial =new Editorial();
     editorial.setNombre_editorial(nombre_editorial);
     this.entityManager.getTransaction().begin();
     this.entityManager.persist(editorial);
     this.entityManager.getTransaction().commit();
       
        return editorial;
 }
 
 public boolean eliminarEditorialPorId(int id_Editorial){
        // Encontrar la venta
        Editorial editorial = this.entityManager.find(Editorial.class, id_Editorial);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(editorial);
        this.entityManager.getTransaction().commit();
        return true;
    }
 
 
 
 
     public List<Editorial> listaEditoriales(){
        List<Editorial> lista = this.entityManager.createQuery("SELECT e FROM editorial e").getResultList();
        
        return lista;
    }
     public Editorial porId(int id){
        Editorial editorial = this.entityManager.find(Editorial.class, id);
        
        return editorial;
    }
   
}
