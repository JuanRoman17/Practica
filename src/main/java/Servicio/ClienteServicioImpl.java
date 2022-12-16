/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Diego Roman
 */
public class ClienteServicioImpl implements ClienetServicio {

    private List<Cliente> clienteList;

    public ClienteServicioImpl() {

        clienteList = new ArrayList<>();
    }

    @Override
    public void crear(Cliente clienet) {

        this.clienteList.add(clienet);
    }

    @Override
    public List<Cliente> listar() {

        return this.clienteList;

    }

}

