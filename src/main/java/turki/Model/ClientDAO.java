package turki.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClientDAO {
    public ArrayList<Client> getClients() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.get();
        ArrayList<Client> clients = new ArrayList<>();

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from client");
        while (rs.next()) {
            clients.add(new Client(rs.getInt(1), rs.getString(2), rs.getString(3),
                    rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7),
                    rs.getString(8), new ArrayList<Compte>()));
        }
        return clients;
    }
}
