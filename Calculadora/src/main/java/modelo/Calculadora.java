/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author all of us
 */

import java.util.ArrayList;

public class Calculadora {

    private final ArrayList<Operacion> operaciones = new ArrayList<>();

    public void registrar(Operacion operacion) {
        operaciones.add(operacion);
    }

    public Operacion obtener(String simbolo) {
        for (Operacion op : operaciones) {
            if (op.getSimbolo().equals(simbolo)) {
                return op;
            }
        }
        return null;
    }

    public ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }

    public double ejecutar(String simbolo, double a, double b) {
        Operacion op = obtener(simbolo);
        if (op == null) {
            throw new IllegalArgumentException("Operación no registrada: " + simbolo);
        }
        return op.calcular(a, b);
    }
}