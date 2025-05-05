package Menu;

import DAO.ProductoDAO;
import Modelos.productos;

public class Main {
    public static void main(String[] args) {
        productos producto = new productos(1,"coca","bebida",20,"normal",true);
        ProductoDAO.insertar(producto);
    }
}