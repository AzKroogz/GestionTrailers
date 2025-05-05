package Modelos;

public class metodospago {
    int id_pago;
    String nombre;

    public metodospago(int id_pago, String nombre) {
        this.id_pago = id_pago;
        this.nombre = nombre;
    }

    public int getId_pago() {
        return id_pago;
    }

    public String getNombre() {
        return nombre;
    }
}
