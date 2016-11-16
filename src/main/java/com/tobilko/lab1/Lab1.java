package com.tobilko.lab1;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

/**
 *
 * Created by Andrew Tobilko on 10/12/2016.
 *
 */
public class Lab1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextInputDialog dialog = new TextInputDialog();

        dialog.setTitle("Password is required!");
        dialog.setHeaderText("Enter a password to go forth.");
        dialog.setContentText("Your password:");

        Optional<String> password = dialog.showAndWait();
        if (password.isPresent() && password.get().equalsIgnoreCase("password")) {
            System.out.println("My program gets started.");
        } else {
            System.out.println("You are wrong!");
        }

    }

}
