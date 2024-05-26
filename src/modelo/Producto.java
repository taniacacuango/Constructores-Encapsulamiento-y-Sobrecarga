/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pc1
 */
public class Producto {
    private int cntrIdProducto;
    private String cntrNombreProducto;
    private double cntrPrecioProducto;
    private String cntrCategoria;
    private String cntrTallaProducto;
    private String cntrMarcaProducto;
    private String cntrColorProducto;

    public Producto(int id, String nombre, double precio, String categoria, String talla, String marca, String color) {
        this.cntrIdProducto = id;
        this.cntrNombreProducto = nombre;
        this.cntrPrecioProducto = precio;
        this.cntrCategoria = categoria;
        this.cntrTallaProducto = talla;
        this.cntrMarcaProducto = marca;
        this.cntrColorProducto = color;
    }

    // Getters y Setters
    public int getCntrIdProducto() { return cntrIdProducto; }
    public void setCntrIdProducto(int id) { this.cntrIdProducto = id; }

    public String getCntrNombreProducto() { return cntrNombreProducto; }
    public void setCntrNombreProducto(String nombre) { this.cntrNombreProducto = nombre; }

    public double getCntrPrecioProducto() { return cntrPrecioProducto; }
    public void setCntrPrecioProducto(double precio) { this.cntrPrecioProducto = precio; }

    public String getCntrCategoria() { return cntrCategoria; }
    public void setCntrCategoria(String categoria) { this.cntrCategoria = categoria; }

    public String getCntrTallaProducto() { return cntrTallaProducto; }
    public void setCntrTallaProducto(String talla) { this.cntrTallaProducto = talla; }

    public String getCntrMarcaProducto() { return cntrMarcaProducto; }
    public void setCntrMarcaProducto(String marca) { this.cntrMarcaProducto = marca; }

    public String getCntrColorProducto() { return cntrColorProducto; }
    public void setCntrColorProducto(String color) { this.cntrColorProducto = color; }

    // Método imprimir
    public void imprimir() {
        System.out.println("Producto ID: " + cntrIdProducto + ", Nombre: " + cntrNombreProducto +
                ", Precio: " + cntrPrecioProducto + ", Categoría: " + cntrCategoria +
                ", Talla: " + cntrTallaProducto + ", Marca: " + cntrMarcaProducto +
                ", Color: " + cntrColorProducto);
    }
}
