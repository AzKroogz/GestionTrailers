package Modelos;

import java.sql.Timestamp;

public class pedidos {
    int id_pedido;
    int id_mesa;
    int id_mesero;
    Timestamp fecha;

    String estado;

    public pedidos(int id_pedido, int id_mesa, int id_mesero, Timestamp fecha, String estado) {
        this.id_pedido = id_pedido;
        this.id_mesa = id_mesa;
        this.id_mesero = id_mesero;
        this.fecha = fecha;
        this.estado = estado;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(int id_mesero) {
        this.id_mesero = id_mesero;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
