/*
    Nombre: José Javier Cruz de la Cruz
    Codigo Técnico: IN5AM
    Carne: 2018059
    Fecha de creacion: 21-03-2022
    Fecha de modificación: 07-04-2022
*/

package org.josecruz.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("VistaCalculadora.fxml"));
        Scene escena = new Scene(root);     
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
