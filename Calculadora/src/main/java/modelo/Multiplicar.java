/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juans
 */

public class Multiplicar extends OperacionBinaria {

    public Multiplicar() {
        super("Multiplicación", "*");
    }

    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
