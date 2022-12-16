/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan Diego Roman
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String cedula;
    private double comsumo;
    private int telefono;

    public Cliente(String nombre, String apellido, String cedula, double comsumo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.comsumo = comsumo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getComsumo() {
        return comsumo;
    }

    public void setComsumo(double comsumo) {
        this.comsumo = comsumo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido 
                + ", cedula=" + cedula + ", comsumo=" + comsumo + ", telefono=" 
                + telefono + '}';
    }
    
    

    

}
