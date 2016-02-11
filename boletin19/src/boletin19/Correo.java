/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author aabalalonso
 */
public class Correo {
    private boolean leido=false;
    private String contenidoCorreo ;

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getContenidoCorreo() {
        return contenidoCorreo;
    }

    public void setContenidoCorreo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
    }

    public Correo(String contenidoCorreo) {
        this.contenidoCorreo = contenidoCorreo;
    }
   
    
    
}
