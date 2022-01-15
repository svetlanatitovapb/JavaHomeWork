package com.pb.titova.hw15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatWindowController {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Pane pane;

    String serverIp = "127.0.0.1";
    int serverPort = 1234;

    String dataFromServer;
    Socket server;

    {
        try {
            server = new Socket(serverIp, serverPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BufferedReader inServer;

    {
        try {
            inServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    PrintWriter outServer;

    {
        try {
            outServer = new PrintWriter(server.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        String clientMessage = textField.getText();
        outServer.println(clientMessage);
        try {
            dataFromServer = inServer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        textArea.setText(textArea.getText() + "\n" + dataFromServer);
        textField.clear();
        if ("bye".equalsIgnoreCase(clientMessage)) {
            javafx.application.Platform.exit();

        }
    }


}