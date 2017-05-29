package ru.itis.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label labelFirstName;

    @FXML
    private Label labelLastName;

    @FXML
    public void initialize() {
        labelFirstName.setText("Marsel");
        labelLastName.setText("Sidikov");
    }
}
