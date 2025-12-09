module viacheslav.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.beans;
    requires spring.context;
    requires java.sql;


    opens viacheslav.javaproject2 to javafx.fxml;
    exports viacheslav.javaproject2;
}