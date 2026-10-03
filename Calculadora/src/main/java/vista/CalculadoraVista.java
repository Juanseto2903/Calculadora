/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author all of us
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CalculadoraVista extends JFrame {

    public CalculadoraVista() {
        setTitle("Calculadora POO");
        setSize(380, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // TODO: construir la interfaz gráfica (pantalla, botones, etc.)
        add(new JLabel("Calculadora en construcción", SwingConstants.CENTER));
    }
}
