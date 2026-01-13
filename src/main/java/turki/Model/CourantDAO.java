package turki.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourantDAO {
    public ArrayList<Courant> getCourants() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.get();
        ArrayList<Courant> courants = new ArrayList<>();

        ClientDAO clientDAO = new ClientDAO();
        ArrayList<Client> clients = clientDAO.getClients();
        Client currentClient;
        Courant currentCompte = null;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select compte.*, courant.* from courant join compte on courant.numCompte=compte.numero");
        while (rs.next()) {
            for (Client client : clients) {
                if (client.getId() == rs.getInt(4)){
                    currentClient = client;
                    currentCompte = new Courant(rs.getString(1), rs.getFloat(2), rs.getString(3),
                            currentClient, rs.getInt(5), rs.getFloat(6));
                    client.getLstcompte().add(currentCompte);
                }
                else{
                    currentCompte = new Courant(rs.getString(1), rs.getFloat(2), rs.getString(3),
                            null, rs.getInt(5), rs.getFloat(6));
                }
            }
            courants.add(currentCompte);
        }
        return courants;
    }
}
