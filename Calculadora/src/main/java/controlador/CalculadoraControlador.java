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

        // Binarias
        vista.btnSumar.addActionListener(e -> ejecutarBinaria("sumar"));
        vista.btnRestar.addActionListener(e -> ejecutarBinaria("restar"));
        vista.btnMultiplicar.addActionListener(e -> ejecutarBinaria("multiplicar"));
        vista.btnDividir.addActionListener(e -> ejecutarBinaria("dividir"));

        // Unarias
        vista.btnRaizCuadrada.addActionListener(e -> ejecutarUnaria("raizCuadrada"));
        vista.btnRaizCubica.addActionListener(e -> ejecutarUnaria("raizCubica"));
        vista.btnLogaritmo.addActionListener(e -> ejecutarUnaria("logaritmoNatural"));

        // Limpiar
        vista.btnLimpiar.addActionListener(e -> {
            vista.txtNum1.setText("");
            vista.txtNum2.setText("");
            vista.txtResultado.setText("");
        });
    }

    private void ejecutarBinaria(String nombreOperacion) {
        try {
            double a = Double.parseDouble(vista.txtNum1.getText());
            double b = Double.parseDouble(vista.txtNum2.getText());
            double resultado = modelo.ejecutarBinaria(nombreOperacion, a, b);
            vista.txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                "Debe ingresar números válidos en ambos campos.",
                "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(),
                "Error matemático", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                "Error inesperado: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ejecutarUnaria(String nombreOperacion) {
        try {
            double a = Double.parseDouble(vista.txtNum1.getText());
            double resultado = modelo.ejecutarUnaria(nombreOperacion, a);
            vista.txtResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                "Debe ingresar un número válido en el primer campo.",
                "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null,
                ex.getMessage(),
                "Error matemático", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                "Error inesperado: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}