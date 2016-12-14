package jdbcserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class JDBCServer {

    public static void main(String[] args) throws IOException, SQLException {
        ServerSocket ss = new ServerSocket(3333);
        Facade f = new CustomerDAO();
        for (;;) {
            System.out.println("waiting for client");
            Socket s = ss.accept();
            new ClientTask(s, f).start();
        }
    }

}
