package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String access = "jdbc:ucanaccess://C://Users//PC//Desktop//Proyecto//BDSistemaVenta.accdb";
            //String myBD = "jdbc:mysql://localhost:3306/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(access);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;

    }
}
