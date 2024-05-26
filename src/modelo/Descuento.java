/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Descuento {
    private int cntrIdDescuento;
    private double cntrPorcentajeDescuento;
    private String cntrTipoDescuento;
    private String cntrDescripcionDescuento;

    public Descuento(int id, double porcentaje, String tipo, String descripcion) {
        this.cntrIdDescuento = id;
        this.cntrPorcentajeDescuento = porcentaje;
        this.cntrTipoDescuento = tipo;
        this.cntrDescripcionDescuento = descripcion;
    }

    // Getters y Setters
    public int getCntrIdDescuento() { return cntrIdDescuento; }
    public void setCntrIdDescuento(int id) { this.cntrIdDescuento = id; }

    public double getCntrPorcentajeDescuento() { return cntrPorcentajeDescuento; }
    public void setCntrPorcentajeDescuento(double porcentaje) { this.cntrPorcentajeDescuento = porcentaje; }

    public String getCntrTipoDescuento() { return cntrTipoDescuento; }
    public void setCntrTipoDescuento(String tipo) { this.cntrTipoDescuento = tipo; }

    public String getCntrDescripcionDescuento() { return cntrDescripcionDescuento; }
    public void setCntrDescripcionDescuento(String descripcion) { this.cntrDescripcionDescuento = descripcion; }

    // Método imprimir
    public void imprimir() {
        System.out.println("Descuento ID: " + cntrIdDescuento + ", Porcentaje: " + cntrPorcentajeDescuento +
                ", Tipo: " + cntrTipoDescuento + ", Descripción: " + cntrDescripcionDescuento);
    }
}
