/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_moises_sepulveda.controladores;
import biblioteca_moises_sepulveda.modelos.Idioma;
import biblioteca_moises_sepulveda.modelos.IdiomaModelo;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class IdiomaControlador {
    
    private IdiomaModelo idiomaModelo;

    public IdiomaControlador() {
        idiomaModelo = new IdiomaModelo();
    }
    
    public List<Idioma> listaIdiomas(){
        List<Idioma> lista = this.idiomaModelo.listaIdiomas();
        
        return lista;
    }
    
    public Idioma crearIdioma(String nombre_idioma){        
        Idioma idioma = this.idiomaModelo.crearIdioma(nombre_idioma);
        
        return idioma;
    }
    
    public Idioma porId(int id){
        Idioma cliente = this.idiomaModelo.porId(id);
        
        return cliente;
    }
    
}
