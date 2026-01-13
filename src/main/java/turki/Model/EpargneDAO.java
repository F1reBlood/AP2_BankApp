package turki.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EpargneDAO {
    public ArrayList<Epargne> getEpargnes() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionFactory.get();
        ArrayList<Epargne> epargnes = new ArrayList<>();

        ClientDAO clientDAO = new ClientDAO();
        ArrayList<Client> clients = clientDAO.getClients();
        Client currentClient = null;
        Epargne currentCompte = null;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select compte.*, epargne.* from compte join epargne on compte.numero=epargne.numCompte");
        while (rs.next()) {
            for (Client client : clients) {
                if (client.getId() == rs.getInt(4)){
                    currentClient = client;
                    currentCompte = new Epargne(rs.getString(1), rs.getFloat(2), rs.getString(3),
                            currentClient, rs.getInt(5));
                    client.getLstcompte().add(currentCompte);
                }
                else{
                    currentCompte = new Epargne(rs.getString(1), rs.getFloat(2), rs.getString(3),
                            currentClient, rs.getInt(5));
                }
            }
            epargnes.add(currentCompte);
        }
        return epargnes;
    }
}
