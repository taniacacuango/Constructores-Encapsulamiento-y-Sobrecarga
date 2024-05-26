/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int cntrIdPedido;
    private Cliente cntrCliente;
    private Date cntrFechaPedido;
    private String cntrEstadoPedido;
    private List<Producto> cntrProductos;
    private String cntrDireccionPedido;
    private Date cntrFechaEntrega;
    private double cntrTotal;

public Pedido(int id, Cliente cliente, Date fechaPedido, String estado, List<Producto> productos, String direccionPedido, Date fechaEntrega, double total) {
    // Código del constructor
    this.cntrIdPedido = id;
    this.cntrCliente = cliente;
    this.cntrFechaPedido = fechaPedido;
    this.cntrEstadoPedido = estado;
    this.cntrProductos = productos;
    this.cntrDireccionPedido = direccionPedido;
    this.cntrFechaEntrega = fechaEntrega;
    this.cntrTotal = total;
}


    // Getters y Setters
    public int getCntrIdPedido() { return cntrIdPedido; }
    public void setCntrIdPedido(int id) { this.cntrIdPedido = id; }

    public Cliente getCntrCliente() { return cntrCliente; }
    public void setCntrCliente(Cliente cliente) { this.cntrCliente = cliente; }

    public Date getCntrFechaPedido() { return cntrFechaPedido; }
    public void setCntrFechaPedido(Date fechaPedido) { this.cntrFechaPedido = fechaPedido; }

    public String getCntrEstadoPedido() { return cntrEstadoPedido; }
    public void setCntrEstadoPedido(String estado) { this.cntrEstadoPedido = estado; }

    public List<Producto> getCntrProductos() { return cntrProductos; }
    public void setCntrProductos(List<Producto> productos) { this.cntrProductos = productos; }

    public String getCntrDireccionPedido() { return cntrDireccionPedido; }
    public void setCntrDireccionPedido(String direccion) { this.cntrDireccionPedido = direccion; }

    public Date getCntrFechaEntrega() { return cntrFechaEntrega; }
    public void setCntrFechaEntrega(Date fechaEntrega) { this.cntrFechaEntrega = fechaEntrega; }

    public double getCntrTotal() { return cntrTotal; }
    public void setCntrTotal(double total) { this.cntrTotal = total; }

    // Método imprimir
    public void imprimir() {
        System.out.println("Pedido ID: " + cntrIdPedido + ", Cliente: " + cntrCliente.getCntrNombreCliente() +
                ", Fecha Pedido: " + cntrFechaPedido + ", Estado: " + cntrEstadoPedido +
                ", Dirección: " + cntrDireccionPedido + ", Fecha Entrega: " + cntrFechaEntrega +
                ", Total: " + cntrTotal);
    }
}

