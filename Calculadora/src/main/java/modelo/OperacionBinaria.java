/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author all of us
 */

public abstract class OperacionBinaria extends Operacion {

    public OperacionBinaria(String nombre, String simbolo) {
        super(nombre, simbolo);
    }

    @Override
    public boolean esUnaria() {
        return false;
    }
}