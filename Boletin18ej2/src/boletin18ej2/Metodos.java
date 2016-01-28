/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18ej2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Metodos {
   int notas[]=new int[30];
    public int pedirNota(){
         Scanner aux = new Scanner(System.in);
         System.out.println("Introducir nota del alumnado: ");
        int notaAlum = aux.nextInt();
        return notaAlum;
    }
    public void CargarArray(){
        for(int i=0;i<notas.length;i++){
            notas[i]=pedirNota();
      
        }
    }
    public void calcularAprobados(){
        int contador_aprobado=0;
        int contador_suspenso=0;
        
         for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                contador_aprobado++;
                
    
            }else{
                contador_suspenso++;
            }
            
    }
         JOptionPane.showMessageDialog(null,"Numero de aprobados ="+contador_aprobado);
         JOptionPane.showMessageDialog(null,"Numero de suspensos ="+contador_suspenso);
    }
    public void NotaMedia(){
         int acum_notas=0;
        for(int i =0;i<notas.length;i++){
            acum_notas+=notas[i];
        }
        JOptionPane.showMessageDialog(null,"Media de clase: " + acum_notas/notas.length);
    }
    
    
    
    
    
    
    
    
    
    
}
