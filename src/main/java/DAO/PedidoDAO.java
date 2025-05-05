package DAO;

import Modelos.pedidos;
import Util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PedidoDAO {
    public static boolean insertar(pedidos pedido) {
        String sql = "INSERT INTO pedidos(id_mesa, id_mesero, fecha, estado) VALUES(?,?,?,?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pedido.getId_mesa());
            stmt.setInt(2, pedido.getId_mesero());
            stmt.setTimestamp(3, pedido.getFecha());
            stmt.setString(4, pedido.getEstado());
            int filas = stmt.executeUpdate();
            return filas > 0;
        } catch (SQLException e) {
            System.err.println("Error al insertar pedido:  " + e.getMessage());
            return false;
        }
    }

}
