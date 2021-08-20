package conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConexao {
    private static Connection connection;

    public static Connection conectar() {
        if (connection == null) {
            try {
                var props = new Properties();
                props.setProperty("user", "postgres");
                props.setProperty("password", "postgres");
                props.setProperty("connectTimeout", "300");
                props.setProperty("socketTimeout", "300");

                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anex", props);
                return connection;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public static void desconectar()
    {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        connection = null;
    }
}
