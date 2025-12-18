module viacheslav.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;

    exports viacheslav.javaproject2.application;
    opens viacheslav.javaproject2.application to javafx.fxml;
}