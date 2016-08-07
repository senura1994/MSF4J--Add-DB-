package com.connection;

/**
 * Created by senura on 8/7/2016.
 */


        import java.net.URL;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.util.logging.Level;
        import java.util.logging.Logger;
        import static javax.ws.rs.Priorities.USER;


public class ConnectionFactory {

    private static Connection con;

    public static Connection getConnection(){
        try {
            if (con == null) {
                String connectionURL = "jdbc:mysql://localhost:3306/bank";
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(connectionURL, "root", "");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
        return con;
    }

}
