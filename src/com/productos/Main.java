package com.productos;

public class Main
{
    public static void main(String[] args)
    {
        Product product1 = new Product(1, "escoba", "barre el suelo", 6.8);
        Product product2 = new Product(2, "valleta", "de mano", 6.8);
        Product product3 = new Product(3, "agua", "se bebe", 0.0);
        Product product4 = new Product(4, "chupa-chups", "esta rico", 0.25);
        Product product5 = new Product(5, "ventana", "transparente", 200.0);

        Product[] arrayDeProductos = new Product[]{product1, product2, product3, product4, product5};

        System.out.printf("%-15s %-15s %-15s %-15s\n%-50s\n",
                "NumProducto", "Nombre", "Descripcion", "Precio",
                "******************************************************");

        for (int i = 0; i < arrayDeProductos.length; i++) {
            System.out.println(arrayDeProductos[i].toString());
        }
    }

}


