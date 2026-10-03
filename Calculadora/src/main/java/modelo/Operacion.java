/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author all of us
 */

public abstract class Operacion {

    private final String nombre;
    private final String simbolo;

    public Operacion(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    // true si necesita un solo operando (raíces, logaritmo)
    public abstract boolean esUnaria();

    // Polimorfismo: cada operación implementa su propio cálculo
    public abstract double calcular(double a, double b);

    @Override
    public String toString() {
        return nombre + " (" + simbolo + ")";
    }
}
