/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_moises_sepulveda;

import biblioteca_moises_sepulveda.modelos.IdiomaModelo;
import biblioteca_moises_sepulveda.vistas.jframes.Main;

/**
 *
 * @author USUARIO
 */
public class Biblioteca_moises_sepulveda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//    System.out.println("Crear idioma");
//    IdiomaModelo idioModelo = new IdiomaModelo();
//    idioModelo.crearIdioma("Español");
//            System.out.println("Cliente Creado");
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

}
    

