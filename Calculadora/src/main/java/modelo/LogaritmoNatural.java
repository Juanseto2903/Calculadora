/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sebas
 */
public class LogaritmoNatural extends OperacionUnaria {

    public LogaritmoNatural() {
        super("Logaritmo natural", "ln");
    }

    @Override
    public double calcular(double a) {
        if (a <= 0) {
            throw new ArithmeticException("El logaritmo natural solo está definido para números mayores que cero");
        }
        return Math.log(a);
    }
}
