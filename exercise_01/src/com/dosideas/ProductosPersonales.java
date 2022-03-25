package com.dosideas;

public class ProductosPersonales extends Productos {

    public ProductosPersonales(String nombreProducto, double contenido, int precio) {
        super(nombreProducto, contenido, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreProducto + " /// Contenido: " + (int) contenido + "ml /// Precio: $" + precio;
    }

}
