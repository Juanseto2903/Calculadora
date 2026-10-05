
package vista;

/**
 *
 * @author all of us
 */


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
 
public class CalculadoraVista extends JFrame {
 
    // Componentes públicos: el controlador (compañero 4) los usa directamente
    public JTextField txtNum1, txtNum2, txtResultado;
    public JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;
    public JButton btnRaizCuadrada, btnRaizCubica, btnLogaritmo;
    public JButton btnLimpiar;
 
    public CalculadoraVista() {
        setTitle("Calculadora POO");
        setMinimumSize(new Dimension(340, 440));
        setSize(380, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
 
        add(crearPanelPantalla(), BorderLayout.NORTH);
        add(crearPanelOperaciones(), BorderLayout.CENTER);
        add(crearPanelLimpiar(), BorderLayout.SOUTH);
 
        setVisible(true);
    }
 
    // Pantalla: operando 1, operando 2 y resultado
    private JPanel crearPanelPantalla() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));
 
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
 
        Font fuente = new Font("SansSerif", Font.PLAIN, 18);
        txtNum1.setFont(fuente);
        txtNum2.setFont(fuente);
        txtResultado.setFont(fuente.deriveFont(Font.BOLD));
        txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
 
        panel.add(new JLabel("Número 1:"));
        panel.add(txtNum1);
        panel.add(new JLabel("Número 2:"));
        panel.add(txtNum2);
        panel.add(new JLabel("Resultado:"));
        panel.add(txtResultado);
        return panel;
    }
    
 // Pantalla: operando 1, operando 2 y resultado
    private JPanel crearPanelPantalla() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 5, 15));
 
        txtNum1 = new JTextField();
        txtNum2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
 
        Font fuente = new Font("SansSerif", Font.PLAIN, 18);
        txtNum1.setFont(fuente);
        txtNum2.setFont(fuente);
        txtResultado.setFont(fuente.deriveFont(Font.BOLD));
        txtNum1.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNum2.setHorizontalAlignment(SwingConstants.RIGHT);
        txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
 
        panel.add(new JLabel("Número 1:"));
        panel.add(txtNum1);
        panel.add(new JLabel("Número 2:"));
        panel.add(txtNum2);
        panel.add(new JLabel("Resultado:"));
        panel.add(txtResultado);
        return panel;
    }
    
// Panel con los botones de operaciones
    private JPanel crearPanelOperaciones() {
        JPanel panel = new JPanel(new GridLayout(2, 1, 8, 8));
        panel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
 
        // Fila de operaciones binarias
        JPanel filaBinarias = new JPanel(new GridLayout(1, 4, 8, 8));
        btnSumar = crearBoton("+");
        btnRestar = crearBoton("-");
        btnMultiplicar = crearBoton("×");
        btnDividir = crearBoton("÷");
        filaBinarias.add(btnSumar);
        filaBinarias.add(btnRestar);
        filaBinarias.add(btnMultiplicar);
        filaBinarias.add(btnDividir);
        

// Fila de operaciones unarias (solo usan el Número 1)
        JPanel filaUnarias = new JPanel(new GridLayout(1, 3, 8, 8));
        btnRaizCuadrada = crearBoton("√");
        btnRaizCubica = crearBoton("∛");
        btnLogaritmo = crearBoton("ln");
        filaUnarias.add(btnRaizCuadrada);
        filaUnarias.add(btnRaizCubica);
        filaUnarias.add(btnLogaritmo);
 
        panel.add(filaBinarias);
        panel.add(filaUnarias);
        return panel;
    }
    
// Botón limpiar (parte inferior)
    private JPanel crearPanelLimpiar() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(5, 15, 15, 15));
        btnLimpiar = crearBoton("C");
        btnLimpiar.setForeground(Color.WHITE);
        btnLimpiar.setBackground(new Color(200, 60, 60));
        btnLimpiar.setOpaque(true);
        btnLimpiar.setPreferredSize(new Dimension(0, 45));
        panel.add(btnLimpiar, BorderLayout.CENTER);
        return panel;
    }
 
    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("SansSerif", Font.BOLD, 20));
        boton.setFocusPainted(false);
        return boton;
    }
}
