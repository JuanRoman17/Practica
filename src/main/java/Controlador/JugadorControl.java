/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Jugador;
import Servicio.JugadorServiceImpl;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public class JugadorControl {

    private JugadorServiceImpl jugadorServiceImpl;

    public JugadorControl() {

        jugadorServiceImpl = new JugadorServiceImpl();
    }

    public JugadorControl(String[] data) {

        var nombre = data[0];
        var posicion = data[1];
        var numero = Integer.valueOf(data[2]).intValue();
        var pais = data[3];
        var jugador = new Jugador(nombre, posicion, numero, pais);
        this.jugadorServiceImpl.Crear(jugador);

    }

    public List<Jugador> listar() {

        return this.jugadorServiceImpl.listar();

    }

}
