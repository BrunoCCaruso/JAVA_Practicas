package com.dosideas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductoServicio {
    private List<Productos> listaProductos = new ArrayList<>();

    public ProductoServicio() {
    }

    public void crearProductos() {
        Bebidas cocaZero = new Bebidas("Coca-Cola Zero", 1.5, 20);
        listaProductos.add(cocaZero);
        Bebidas cocaCola = new Bebidas("Coca-Cola", 1.5, 18);
        listaProductos.add(cocaCola);
        ProductosPersonales shampoo = new ProductosPersonales("Shampoo Sedal", 500, 19);
        listaProductos.add(shampoo);
        Frutas frutilla = new Frutas("Frutillas", 0, 64, "kilo");
        listaProductos.add(frutilla);
    }

    public void visualizarProductos() {
        for (Productos producto : listaProductos) {
            System.out.println(producto);
        }
    }

    public void ordenarProductos() {
        Collections.sort(listaProductos);
    }

    public void visualizarProductosMayoresYMenores() {
        System.out.println("\n=============================\n");
        System.out.println("Producto más caro: " + listaProductos.get(0).getNombreProducto());
        System.out.println("Producto más barato: " + listaProductos.get(listaProductos.size() - 1).getNombreProducto());
    }


}
