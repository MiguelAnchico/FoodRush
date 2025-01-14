/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import pila.Base;

/**
 *
 * @author miguel.anchico
 */
public class Producto extends Base{
    
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(){
        
    }

    public Producto(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    @Override
    public Base copy() {
        return new Producto(nombre, cantidad, precio);
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad = " + cantidad + ", precio = " + precio + '}';
    }
}
