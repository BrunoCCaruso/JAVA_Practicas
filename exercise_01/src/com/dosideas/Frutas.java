package com.dosideas;

public class Frutas extends Productos{
    private String unidadVenta;


    public Frutas(String nombreProducto, double contenido, int precio, String unidadVenta) {
        super(nombreProducto, contenido, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreProducto + " /// Precio: $" + (int) precio +" /// Unidad de venta: " + unidadVenta;
    }
}
