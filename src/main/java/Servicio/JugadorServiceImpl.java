/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public class JugadorServiceImpl implements JugadorServicio {

    private List<Jugador> jugadorList;

    public JugadorServiceImpl() {

        jugadorList = new ArrayList<>();

    }

    @Override
    public void Crear(Jugador jugador) {
       
        this.jugadorList.add(jugador);
        
    }

    @Override
    public List<Jugador> listar() {
        
        return this.jugadorList;
    }

}
