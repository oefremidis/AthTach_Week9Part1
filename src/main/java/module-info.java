module gr.athtech.athtach_week9part1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens gr.athtech.athtach_week9part1 to javafx.fxml;
    exports gr.athtech.athtach_week9part1;
}