/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author juans
 */

import modelo.Calculadora;
import vista.CalculadoraVista;

public class CalculadoraControlador {

    private final Calculadora modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(Calculadora modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        // TODO: conectar los botones de la vista con el modelo
        vista.setVisible(true);
    }
}