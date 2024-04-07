module com.example.chitchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chitchat to javafx.fxml;
    exports com.example.chitchat;
}