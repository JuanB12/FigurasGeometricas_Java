/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author salacomputocentro.ba
 */
import java.util.*;
import javax.swing.*;

public class main {

    public static void main(String[] args) {
        
        int opc = 0;
        ArrayList<Figuras> Figura = new ArrayList();
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione:")
                    + "\n 1.Crear rectángulo"
                    + "\n 2.Crear cuadrado"
                    + "\n 3.Crear triangulo"
                    + "\n 4.ver figura"
                    + "\n 5. Salir");
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Fin del programa.");

            }
        } while (opc != 4);
    }

}
