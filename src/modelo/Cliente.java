/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente {
    private int cntrIdCliente;
    private String cntrNombreCliente;
    private String cntrEmailCliente;
    private int cntrTelefonoCliente;
    private String cntrDireccionPostal;

    public Cliente(int id, String nombre, String email, int telefono, String direccion) {
        this.cntrIdCliente = id;
        this.cntrNombreCliente = nombre;
        this.cntrEmailCliente = email;
        this.cntrTelefonoCliente = telefono;
        this.cntrDireccionPostal = direccion;
    }

    // Getters y Setters
    public int getCntrIdCliente() { return cntrIdCliente; }
    public void setCntrIdCliente(int id) { this.cntrIdCliente = id; }

    public String getCntrNombreCliente() { return cntrNombreCliente; }
    public void setCntrNombreCliente(String nombre) { this.cntrNombreCliente = nombre; }

    public String getCntrEmailCliente() { return cntrEmailCliente; }
    public void setCntrEmailCliente(String email) { this.cntrEmailCliente = email; }

    public int getCntrTelefonoCliente() { return cntrTelefonoCliente; }
    public void setCntrTelefonoCliente(int telefono) { this.cntrTelefonoCliente = telefono; }

    public String getCntrDireccionPostal() { return cntrDireccionPostal; }
    public void setCntrDireccionPostal(String direccion) { this.cntrDireccionPostal = direccion; }

    // Método imprimir
    public void imprimir() {
        System.out.println("Cliente ID: " + cntrIdCliente + ", Nombre: " + cntrNombreCliente +
                ", Email: " + cntrEmailCliente + ", Teléfono: " + cntrTelefonoCliente +
                ", Dirección: " + cntrDireccionPostal);
    }
}
