package org.example.proyectoformsfx;

import Matematicas.Ecuacion;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    /*
        Label label = new Label("Mi primer formulario JavaFX");

        Scene scene = new Scene(new StackPane(label), 400, 300);

        stage.setTitle("Formulario Fx");
        stage.setScene(scene);
        stage.show();

        GridPane grid = new GridPane();

        Insets padding = new Insets(20,0,0,30);

        grid.setPadding(padding); //padding

//grid.setGridLinesVisible(true);



        grid.setHgap(10); //espaciado horizontal

        grid.setVgap(10); //espaciado vertical



        Label lblNombre = new Label("Nombre:"); //Etiqueta

        TextField txtNombre = new TextField(); //cuadro de entrada



        Label lblEmail = new Label("Email:");

        TextField txtEmail = new TextField();



        Button btnGuardar = new Button("Guardar");//Botón de comando

        Label labelMsg = new Label("Hola JavaFX");

        Label labelPrueba = new Label("Mensaje de Prueba");

        //agrega los controles al GridPane​

        grid.add(lblNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(labelPrueba, 2, 0);


        grid.add(lblEmail, 0, 1);
        grid.add(txtEmail, 1, 1);
        grid.add(btnGuardar, 1, 2);



//Permite que el label user 2 columnas
        GridPane.setColumnSpan(labelMsg,2);
        grid.add(labelMsg, 0, 3);
        Scene scene = new Scene(new StackPane(grid), 400, 300);
        stage.setTitle("Título del formulario");
        stage.setScene(scene);

        scene.getStylesheets().add("estilos.css");
        stage.show();


        //Manejar el clic del botón de comando
        btnGuardar.setOnAction(e -> {

            if (txtNombre.getText().isEmpty()) {

                labelMsg.setText("Debes ingresar el nombre");

                System.out.println("El nombre es obligatorio");

                return;

            }

            String nombre = txtNombre.getText();

            labelMsg.setText("Nombre guardado " + nombre);

            System.out.println("Nombre guardado: " + nombre);

        });
        */
        //Ecuaciones de segundo grado
        GridPane grid = new GridPane();
        Insets padding = new Insets(20, 0, 0, 30);
        grid.setPadding(padding);

        //grid.setGridLinesVisile(true);
        grid.setHgap(10); //Espaciado Horizontal
        grid.setVgap(10);//Espaciado vertical

        Label lblA = new Label("Ingrese el valor de A: ");
        TextField txtA = new TextField();

        Label lblB = new Label("Ingrese el valor de B: ");
        TextField txtB = new TextField();

        Label lblC = new Label("Ingrese el valor de C: ");
        TextField txtC = new TextField();

        Label lblx1 =new Label("Respuesta X1: ");
        TextField txtX1 = new TextField();

        Label lblx2 = new Label("Respuesta X2: ");
        TextField txtX2 =new TextField();

        Label lblMensaje = new Label("");

        Button btnCalcular = new Button("Calcular");
        Button btnNuevo = new Button("Nuevo");

        //Agrego los nodos(controles) al grid
        grid.add(lblA, 0, 0);
        grid.add(txtA, 1, 0);

        grid.add(lblB, 0, 1);
        grid.add(txtB, 1, 1);

        grid.add(lblC, 0, 2);
        grid.add(txtC, 1, 2);

        grid.add(lblx1, 0, 3);
        grid.add(txtX1, 1, 3);

        grid.add(lblx2, 0, 4);
        grid.add(txtX2, 1, 4);

        grid.add(lblMensaje, 0, 5);
        GridPane.setColumnSpan(lblMensaje, 2);

        grid.add(btnCalcular, 0, 6);
        grid.add(btnNuevo, 1, 6);

        Scene scene = new Scene(new StackPane(grid), 400, 300);
        stage.setTitle("Ecuacion de Segundo Grado");
        stage.setScene(scene);

        scene.getStylesheets().add("estilos.css");
        stage.show();

        btnCalcular.setOnAction(e -> {

            if (txtA.getText().isEmpty()) {
                lblMensaje.setText("Debes ingresar el valor de A: ");
                return;

            }
            if(txtB.getText().isEmpty()){
                lblMensaje.setText("Debes ingresar el valor de B: ");
                return;
            }
            if(txtC.getText().isEmpty()){
                lblMensaje.setText("Debes ingresar el valor de c: ");
                return;
            }
            //LLamada

            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());


            Ecuacion ec1 = new Ecuacion(a, b, c);

            ec1.calcular();

            if (!ec1.getError().isEmpty()) {
                lblMensaje.setText(ec1.getError());
                txtX1.clear();
                txtX2.clear();
                return;
            }


            txtX1.setText(String.valueOf(ec1.getX1()));
            txtX2.setText(String.valueOf(ec1.getX2()));
            lblMensaje.setText("Cálculo realizado correctamente");

        });
    }
}
