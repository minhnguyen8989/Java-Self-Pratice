module com.example.javaselfpractice {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javaselfpractice to javafx.fxml;
    exports com.example.javaselfpractice;
}