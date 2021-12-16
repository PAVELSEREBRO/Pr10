module com.example.pr10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.mirea.gibo01.pr10.nasledovanie to javafx.fxml;
    exports ru.mirea.gibo01.pr10.nasledovanie;
}