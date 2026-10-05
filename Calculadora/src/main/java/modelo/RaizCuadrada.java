/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */
//Raiz cuadrada
public class RaizCuadrada extends OperacionUnaria { 
    public RaizCuadrada() {
        super("Raíz cuadrada", "√");
    }
 
    @Override
    public double calcular(double a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}
