package Modelos;

import java.sql.Timestamp;

public class ventas {
    int id_venta;
    int id_pedido;
    double monto;
    int id_metodo;
    int id_cobrador;
    Timestamp fecha;

    public ventas(int id_venta, int id_pedido, double monto, int id_metodo, int id_cobrador, Timestamp fecha) {
        this.id_venta = id_venta;
        this.id_pedido = id_pedido;
        this.monto = monto;
        this.id_metodo = id_metodo;
        this.id_cobrador = id_cobrador;
        this.fecha = fecha;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getId_metodo() {
        return id_metodo;
    }

    public void setId_metodo(int id_metodo) {
        this.id_metodo = id_metodo;
    }

    public int getId_cobrador() {
        return id_cobrador;
    }

    public void setId_cobrador(int id_cobrador) {
        this.id_cobrador = id_cobrador;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
