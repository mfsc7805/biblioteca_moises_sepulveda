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

public class Idioma {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ididioma;
    private String nombre_idioma;

    public Idioma() {
    }

    public Idioma(int ididioma, String nombre_idioma) {
        this.ididioma = ididioma;
        this.nombre_idioma = nombre_idioma;
    }

    public int getIdidioma() {
        return ididioma;
    }

    public void setIdidioma(int ididioma) {
        this.ididioma = ididioma;
    }

    public String getNombre_idioma() {
        return nombre_idioma;
    }

    public void setNombre_idioma(String nombre_idioma) {
        this.nombre_idioma = nombre_idioma;
    }

    public Object getIdIdioma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
