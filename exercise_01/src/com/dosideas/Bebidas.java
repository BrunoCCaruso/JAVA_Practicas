package com.dosideas;

public class Bebidas extends Productos{

    public Bebidas(String nombreProducto, double contenido, int precio) {
        super(nombreProducto, contenido, precio);
    }


    @Override
    public String toString() {
        return "Nombre: " + nombreProducto + " /// Litros: " + contenido +" /// Precio: $" + precio;
    }

}
