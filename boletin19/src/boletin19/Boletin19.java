/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buzon mensaje = new Buzon();
    String repetir;
        do {
            int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1)Numero de correos\n2)Engadir\n3)Por leer\n5)Enseñar primero no leido\n6)Enseñar correos\n7)Eliminar un correo que pongas entre los parámetros"));
            switch (seleccion) {
                case 1:
                    mensaje.numeroCorreos();
                    break;
                case 2:
                    mensaje.engade(new Correo(JOptionPane.showInputDialog("Introduce el contenido del correo")));
                    break;
                case 3:
                    mensaje.porLer();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,mensaje.amosaPrimerNoLeido());
                    mensaje.amosaPrimerNoLeido();
                    break;
                case 6:
                    int posicion=Integer.parseInt( JOptionPane.showInputDialog("Elije posicion del correo que quieres mostrar"));
                    JOptionPane.showMessageDialog(null,mensaje.amosa(posicion));
                   
                    break;
                case 7:
                    mensaje.elimina(seleccion);
                    break;
                case 8:
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Introduce algún valor ");
            }repetir=JOptionPane.showInputDialog("Quieres hacer otra operacion");
        } while (repetir.equalsIgnoreCase("si"));
    }
}
