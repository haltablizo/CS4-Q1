
package ex13_gra_tablizohl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EX13_GRA_TablizoHL extends Application {

    @Override
    public void start(Stage stage) throws Exception {    
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);        
        stage.setTitle("Tablizo - Exercise 13");
        stage.show();
    }

    public static void main(String[] args) {
        
        launch(args);
    }
    
}
