/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ClienteControl;
import Controlador.JugadorControl;

/**
 *
 * @author Juan Diego Roman
 */
public class Principal {

    public static void main(String[] args) {

        var cliente1 = new ClienteControl();
        String[] data = new String[5];
        data[0] = "Jose";
        data[1] = "Palacios";
        data[2] = "0106636608";
        data[3] = "25.5";
        data[4] = "2856500";
        
        cliente1.ClienteControl(data);
        
       
        
        

    }

}
