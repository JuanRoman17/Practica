/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Jugador;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public interface JugadorServicio {
    
    public void Crear (Jugador jugador);
    
    public List<Jugador> listar();
    
    
}
