module com.example.shrinkgrow {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shrinkgrow to javafx.fxml;
    exports com.example.shrinkgrow;
}