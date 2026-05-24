package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // Creo una etiqueta con el mensaje inicial
        Label mensaje = new Label("Pulsa el botón para cambiar el mensaje");

        // Creo el botón que usará el usuario
        Button boton = new Button("Haz clic aquí");

        // Evento que cambia el texto de la etiqueta al pulsar el botón
        boton.setOnAction(event -> {
            mensaje.setText("¡Has hecho clic en el botón!");
        });

        // VBox coloca los elementos uno debajo del otro
        VBox root = new VBox(15);
        root.getChildren().addAll(mensaje, boton);

        // Aplico un pequeño estilo para que la interfaz se vea mejor
        root.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Creo la escena con el contenido y el tamaño de la ventana
        Scene scene = new Scene(root, 450, 250);

        // Configuro el título de la ventana principal
        stage.setTitle("Ejercicio 3 - JavaFX");

        // Añado la escena al Stage
        stage.setScene(scene);

        // Muestro la ventana
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}