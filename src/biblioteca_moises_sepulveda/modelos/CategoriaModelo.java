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
public class CategoriaModelo {
    
private EntityManagerFactory entityManagerFactory;
   private EntityManager entityManager;  
   
       public CategoriaModelo() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("biblioteca_moises_sepulvedaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }
    
   public Categoria crearCategoria(String nombre_categoria){
    Categoria categoria =new Categoria();
     categoria.setNombre_categoria(nombre_categoria);
     this.entityManager.getTransaction().begin();
     this.entityManager.persist(categoria);
     this.entityManager.getTransaction().commit();
       
        return categoria;
 }
 
 public boolean eliminarCategoriaPorId(int idCategoria){
        // Encontrar la venta
        Categoria categoria = this.entityManager.find(Categoria.class, idCategoria);
        
        // Eliminar
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(categoria);
        this.entityManager.getTransaction().commit();
        return true;
    }
 
 
 
 
     public List<Categoria> listaCategoria(){
        List<Categoria> lista = this.entityManager.createQuery("SELECT i FROM categoria i").getResultList();
        
        return lista;
    }
     public Categoria porId(int id){
        Categoria categoria = this.entityManager.find(Categoria.class, id);
        
        return categoria;
    }
       
       
}
