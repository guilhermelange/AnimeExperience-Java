package conf;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Guilherme
 */
public class ConnectionFactory {
    private Connection con;

    public ConnectionFactory() {
        try {
            this.con = DriverManager.getConnection("postgresql://localhost/anex", "postgres", "postgres");
        } catch(Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
