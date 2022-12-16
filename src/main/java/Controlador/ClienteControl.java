/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Servicio.ClienteServicioImpl;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public class ClienteControl {

    private ClienteServicioImpl clienteServicioImpl;
    
    public ClienteControl(){
        
        clienteServicioImpl = new ClienteServicioImpl();
    }

    public void ClienteControl(String[] data) {

        var nombre = data[0];
        var apellido = data[1];
        var cedula = data[2];
        var consumo = Double.valueOf(data[3]).doubleValue();
        var telefono = Integer.valueOf(data[4]).intValue();
        var cliente = new Cliente(nombre, apellido, cedula, consumo, telefono);
        this.clienteServicioImpl.crear(cliente);

    }

    public List<Cliente> listar() {

        return this.clienteServicioImpl.listar();

    }

}
