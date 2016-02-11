/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Buzon {
    
    ArrayList<Correo> correosElectronicos=new ArrayList();
    
    public int numeroCorreos() {
        int contador = 0;
        for (int i = 0; i < correosElectronicos.size(); i++) {
            if (correosElectronicos.get(i) != null) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null,"Este es el numero de correos que existen"+contador);
        return contador;
  
    }
    
    public void engade(Correo k) {
        correosElectronicos.add(k);
        
    }
    
    public boolean porLer() {
        for (int i = 0; i < correosElectronicos.size(); i++) {
            if (correosElectronicos.get(i).isLeido() == false) {
                JOptionPane.showMessageDialog(null, "Quedan correos por leer");
                return false;
                
            }
            
        }
        JOptionPane.showMessageDialog(null, "No quedan correos por leer");
        return true;
        
    }
    
    public String amosaPrimerNoLeido() {
        for (int i = 0; i < correosElectronicos.size(); i++) {
            if (correosElectronicos.get(i).isLeido() == false) {
                return correosElectronicos.get(i).getContenidoCorreo();
                
            }
            
        }
        return "Estan todos leidos";
    }
    
    public String amosa(int k) {
        correosElectronicos.get(k).setLeido(true);
        
        return correosElectronicos.get(k).getContenidoCorreo();
    }
     public void elimina(int k){
        correosElectronicos.remove(k);
    }
}
