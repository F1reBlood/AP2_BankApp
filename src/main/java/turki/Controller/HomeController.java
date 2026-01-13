package turki.Controller;

import turki.App;

import java.io.IOException;

public class HomeController {
    public void openCreationClient() throws IOException {
        App.setRoot("CreationClient");
    }
    public void openCreationCompte() throws IOException {
        App.setRoot("CreationCompte");
    }
    public void openGestionClient() throws IOException {
        App.setRoot("GestionClient");
    }
    public void openGestionCompte() throws IOException {
        App.setRoot("GestionCompte");
    }
}
