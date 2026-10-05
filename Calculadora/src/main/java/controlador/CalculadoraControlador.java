package controlador;

import modelo.Calculadora;
import vista.CalculadoraVista;
import javax.swing.JOptionPane;

public class CalculadoraControlador {

    private Calculadora modelo;
    private CalculadoraVista vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        // Binarias (se pasa el símbolo con el que está registrada cada operación)
        vista.btnSumar.addActionListener(e -> ejecutarBinaria("+"));
        vista.btnRestar.addActionListener(e -> ejecutarBinaria("-"));
        vista.btnMultiplicar.addActionListener(e -> ejecutarBinaria("*"));
        vista.btnDividir.addActionListener(e -> ejecutarBinaria("/"));

        // Unarias (los símbolos deben coincidir con los del compañero 2)
        vista.btnRaizCuadrada.addActionListener(e -> ejecutarUnaria("√"));
        vista.btnRaizCubica.addActionListener(e -> ejecutarUnaria("∛"));
        vista.btnLogaritmo.addActionListener(e -> ejecutarUnaria("ln"));

        // Limpiar
        vista.btnLimpiar.addActionListener(e -> {
            vista.txtNum1.setText("");
            vista.txtNum2.setText("");
            vista.txtResultado.setText("");
        });
    }

    private void ejecutarBinaria(String simbolo) {
        try {
            double a = Double.parseDouble(vista.txtNum1.getText().trim());
            double b = Double.parseDouble(vista.txtNum2.getText().trim());
            double resultado = modelo.ejecutar(simbolo, a, b);
            vista.txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista,
                "Debe ingresar números válidos en ambos campos.",
                "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(vista,
                ex.getMessage(),
                "Error matemático", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista,
                "Error inesperado: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ejecutarUnaria(String simbolo) {
        try {
            double a = Double.parseDouble(vista.txtNum1.getText().trim());
            // Las unarias ignoran el segundo operando
            double resultado = modelo.ejecutar(simbolo, a, 0);
            vista.txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista,
                "Debe ingresar un número válido en el primer campo.",
                "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(vista,
                ex.getMessage(),
                "Error matemático", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista,
                "Error inesperado: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}