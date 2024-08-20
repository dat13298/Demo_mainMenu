package com.aptech.testloginfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML Label lbOut;
    @FXML
    TextField txtText;
    @FXML
    Button btnLogin;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                AppProperties.setProperty("test.txt", txtText.getText());
                lbOut.setText(AppProperties.getProperty("test.txt"));
            }
        });
    }
}
