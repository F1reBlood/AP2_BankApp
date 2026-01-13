module turki {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens turki to javafx.fxml;
    opens turki.Controller to javafx.fxml;
    exports turki;
}
