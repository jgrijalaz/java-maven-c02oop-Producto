package com.productos;

public class Product
{
    private int numReg;
    private String name;
    private String description;
    private double precio;

    public Product(){}

    public Product(int numReg, String name, String description, double precio) {
        this.numReg = numReg;
        this.name = name;
        this.description = description;
        this.precio = precio;
    }

    public int getNumReg() {return numReg;}
    public void setNumReg(int numReg) {this.numReg = numReg;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}


    @Override
    public String toString() {
        return String.format("%d  %s  %s  %.2d",this.numReg, this.name, this.description, this.precio);
    }
}
