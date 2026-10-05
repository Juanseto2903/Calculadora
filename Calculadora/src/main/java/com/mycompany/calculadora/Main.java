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
import modelo.Dividir;
import modelo.Multiplicar;
import modelo.Restar;
import modelo.Sumar;
import vista.CalculadoraVista;
import modelo.LogaritmoNatural;
import modelo.RaizCubica;
import modelo.RaizCuadrada;

public class Main {

    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();

        // Operaciones binarias
        modelo.registrar(new Sumar());
        modelo.registrar(new Restar());
        modelo.registrar(new Multiplicar());
        modelo.registrar(new Dividir());

        // Operaciones unarias
        modelo.registrar(new RaizCuadrada());
        modelo.registrar(new RaizCubica());
        modelo.registrar(new LogaritmoNatural());

        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(modelo, vista);
        controlador.iniciar();
    }
}
