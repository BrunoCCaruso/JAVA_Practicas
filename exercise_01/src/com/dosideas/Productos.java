package com.dosideas;

public class Productos implements Comparable<Productos>{
    protected String nombreProducto;
    protected double contenido;
    protected int precio;

    public Productos(String nombreProducto, double contenido, int precio) {
        this.nombreProducto = nombreProducto;
        this.contenido = contenido;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }


    @Override
    public int compareTo(Productos productos) {
        if(precio==productos.precio)
            return 0;
        else if(precio>productos.precio)
            return -1;
        else
            return 1;
    }
}
