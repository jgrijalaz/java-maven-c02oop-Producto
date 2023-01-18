package com.productos;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //================  CREAR VARIABLES Y OBJETOS  ========================

        Product product1 = new Product(1, "escoba", "barre el suelo", 6.8);
        Product product2 = new Product(2, "valleta", "de mano", 6.8);
        Product product3 = new Product(3, "agua", "se bebe", 0.0);
        Product product4 = new Product(4, "chupa-chups", "esta rico", 0.25);
        Product product5 = new Product(5, "ventana", "transparente", 200.0);

        Double precioTotal = 0.0;
        Double precioMedio = 0.0;

        ArrayList<Product> carrito = new ArrayList<>();
        carrito.add(product1);
        carrito.add(product2);
        carrito.add(product3);
        carrito.add(product4);
        carrito.add(product5);

        //================  IMPRIMIR INFO. GENERAL  ===========================

        System.out.printf("%-15s %-15s %-15s %-15s\n%-50s\n",
                "NumProducto", "Nombre", "Descripcion", "Precio",
                "******************************************************");

        for (int i = 0; i < carrito.size(); i++) {
            System.out.println(carrito.get(i).toString());
        }

        //=================  CALCULAR ESTADISTICAS  =============================

        for (Product p : carrito) {
            precioTotal += p.getPrecio();
        }
        System.out.printf("\nPrecio total: %.2f", precioTotal);


        System.out.printf("\nPrecio total: %.2f", precioTotal);

        int[] nan = {1,2,3,4};

        //System.out.println(Math.max(nan));

    }



}


