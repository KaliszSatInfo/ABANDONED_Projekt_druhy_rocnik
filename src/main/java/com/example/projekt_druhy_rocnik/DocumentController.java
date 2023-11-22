package com.example.projekt_druhy_rocnik;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DocumentController {
    @FXML
    private Label test;

    @FXML
    protected void onDoklad1ClickButton(){
        test.setText("testuju jestli funguje");
    }
}