package com.pb.titova.hw15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.nio.file.Paths;


public class Client extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Paths.get("src/com/pb/titova/hw15/fxml_chat_window.fxml").toUri().toURL());

        Scene scene = new Scene(root);

        stage.setTitle("Chat");
        stage.setScene(scene);
        stage.show();
    }

}
