package com.aptech.testloginfx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainmenuController implements Initializable {


    @FXML StackPane stackPaneContent;
    @FXML Button btnAppointment;
    @FXML Button btnMedicine;
    @FXML Button btnDashboard;

    public void setContent(Parent newContentPane){
        stackPaneContent.getChildren().clear();
        stackPaneContent.getChildren().add(newContentPane);
    }

    public void getContentPane(String fileFXML) {
        Parent newContentPane;
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fileFXML));
            newContentPane = loader.load();
            setContent(newContentPane);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        stackPaneContent.widthProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("New width: " + newValue);
        });

        stackPaneContent.heightProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println("New height: " + newValue);
        });
        getContentPane("dashboard.fxml");
        btnAppointment.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getContentPane("appointment.fxml");
            }
        });
        btnDashboard.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getContentPane("dashboard.fxml");
            }
        });
        btnMedicine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getContentPane("medicine.fxml");
            }
        });
    }
}
