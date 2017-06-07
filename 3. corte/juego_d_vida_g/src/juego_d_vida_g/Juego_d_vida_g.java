
package juego_d_vida_g;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JApplet;
import javax.swing.JFrame;

/**
 *
 * @author manuel
 */
public class Juego_d_vida_g {

    public static void main(String[] args) {
         //Crear un marco para la simulación
        JFrame frame = new JFrame("Juego de la Vida");

        //Agregar un oyente al marco
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Crear el applet que mostrará la simulación
        JApplet applet = new logica();

        //Agregar el applet al marco
        frame.getContentPane().add("Center", applet);

        //Inicializar el applet y ejecutar la simulación
        applet.init();

        //Añadir propiedades al marco
        frame.pack();
        frame.setSize(new Dimension(750, 650));
        frame.setVisible(true);
    }

}

    
    

