/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Cliente;
import modelo.Descuento;
import modelo.FormaDePago;
import modelo.Pedido;
import modelo.Producto;

public class Main {
    public static void main(String[] args) {
        // Lista de Productos
        List<Producto> productos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            productos.add(new Producto(i, "Producto" + i, 10.0 * i, "Categoria" + i, "Talla" + i, "Marca" + i, "Color" + i));
        }

        // Lista de Clientes
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            clientes.add(new Cliente(i, "Cliente" + i, "cliente" + i + "@mail.com", 123456 + i, "Direccion" + i));
        }

        // Lista de Pedidos
        List<Pedido> pedidos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
    pedidos.add(new Pedido(i, clientes.get(i), new Date(), "Estado" + i, productos, "Direccion" + i, new Date(), 100.0 * i));
}
    

        // Lista de Formas de Pago
        List<FormaDePago> formasDePago = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            formasDePago.add(new FormaDePago(i, "Metodo" + i, true, "Detalles" + i));
        }

        // Lista de Descuentos
        List<Descuento> descuentos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            descuentos.add(new Descuento(i, 10.0 * i, "Tipo" + i, "Descripcion" + i));
        }

        // Imprimir todos los objetos
        for (Producto producto : productos) {
            producto.imprimir();
        }

        for (Cliente cliente : clientes) {
            cliente.imprimir();
        }

        for (Pedido pedido : pedidos) {
            pedido.imprimir();
        }

        for (FormaDePago formaDePago : formasDePago) {
            formaDePago.imprimir();
        }

        for (Descuento descuento : descuentos) {
            descuento.imprimir();
        }
    }
}
