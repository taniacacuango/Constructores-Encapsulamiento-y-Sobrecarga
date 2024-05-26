/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class FormaDePago {
    private int cntrIdFDP;
    private String cntrMetodo;
    private boolean cntrPagoRealizado;
    private String cntrDetallesPago;

    public FormaDePago(int id, String metodo, boolean pagoRealizado, String detalles) {
        this.cntrIdFDP = id;
        this.cntrMetodo = metodo;
        this.cntrPagoRealizado = pagoRealizado;
        this.cntrDetallesPago = detalles;
    }

    // Getters y Setters
    public int getCntrIdFDP() { return cntrIdFDP; }
    public void setCntrIdFDP(int id) { this.cntrIdFDP = id; }

    public String getCntrMetodo() { return cntrMetodo; }
    public void setCntrMetodo(String metodo) { this.cntrMetodo = metodo; }

    public boolean isCntrPagoRealizado() { return cntrPagoRealizado; }
    public void setCntrPagoRealizado(boolean pagoRealizado) { this.cntrPagoRealizado = pagoRealizado; }

    public String getCntrDetallesPago() { return cntrDetallesPago; }
    public void setCntrDetallesPago(String detalles) { this.cntrDetallesPago = detalles; }

    // Método imprimir
    public void imprimir() {
        System.out.println("Forma de Pago ID: " + cntrIdFDP + ", Método: " + cntrMetodo +
                ", Pago Realizado: " + cntrPagoRealizado + ", Detalles: " + cntrDetallesPago);
    }
}
