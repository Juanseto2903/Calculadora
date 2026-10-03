/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

/**
 *
 * @author all of us
 */
import controlador.CalculadoraControlador;
import modelo.Calculadora;
import vista.CalculadoraVista;

public class Main {

    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();
        // TODO: registrar aquí las operaciones a medida que se creen

        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);
        controlador.iniciar();
    }
}
