/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sebas
 */
public class RaizCubica extends OperacionUnaria {

    public RaizCubica() {
        super("Raíz cúbica", "∛");
    }

    @Override
    public double calcular(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cúbica de un número negativo");
        }
        return Math.cbrt(a);
    }
}
