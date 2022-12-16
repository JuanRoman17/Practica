/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Cliente;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public interface ClienetServicio {
    
    public void crear (Cliente clienet);
    
    public List<Cliente> listar();
    
}
