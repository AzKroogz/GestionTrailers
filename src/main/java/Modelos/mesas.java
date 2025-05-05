package Modelos;

public class mesas {
    int id_mesa;
    int numero;
    String estado;

    public mesas(int id_mesa, int numero, String estado) {
        this.id_mesa = id_mesa;
        this.numero = numero;
        this.estado = estado;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
