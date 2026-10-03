/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author all of us
 */

public class Sumar extends OperacionBinaria {

    public Sumar() {
        super("Suma", "+");
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
