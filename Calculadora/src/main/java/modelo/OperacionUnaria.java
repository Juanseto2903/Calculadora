/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author all of us
 */

public abstract class OperacionUnaria extends Operacion {

    public OperacionUnaria(String nombre, String simbolo) {
        super(nombre, simbolo);
    }

    // Cálculo con un solo operando
    public abstract double calcular(double a);

    @Override
    public boolean esUnaria() {
        return true;
    }

    // Ignora el segundo operando
    @Override
    public double calcular(double a, double b) {
        return calcular(a);
    }
}
