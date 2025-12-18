package viacheslav.javaproject2.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import viacheslav.javaproject2.db.Customer;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        // first hibernate usage
        Customer customer = new Customer();
        customer.setId(1L);
        System.out.println(customer.getId());
    }

    public static void main(String[] args) {
        launch(Main.class, args);
    }
}
