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


/**
 *
 * @author Moises Sepulveda
 */

@Entity
@Table(name="idioma")

public class Editorial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_editorial;
    private String nombre_editorial;

    public Editorial() {
    }

    public Editorial(int id_editorial, String nombre_editorial) {
        this.id_editorial = id_editorial;
        this.nombre_editorial = nombre_editorial;
    }

    public int getId_editorial() {
        return id_editorial;
    }

    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }
    
      
    
}
