/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_moises_sepulveda.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.metamodel.SingularAttribute;
/**
 *
 * @author USUARIO
 */
@Entity
@Table(name="autor")

public class Autor {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_autor;
    private String nombre_autor;

    public Autor() {
    }

    public Autor(int id_autor, String nombre_autor) {
        this.id_autor = id_autor;
        this.nombre_autor = nombre_autor;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre_autor() {
        return nombre_autor;
    }

    public void setNombre_autor(String nombre_autor) {
        this.nombre_autor = nombre_autor;
    }

    void setNombre_autor(SingularAttribute<Autor, String> nombre_autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
