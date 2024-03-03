
package ex13_gra_tablizohl;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


public class FXMLDocumentController implements Initializable {
    Subject math = new Subject("Math", "math.png", 4, 1.75);
    Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
    Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
    Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
    Subject cs = new Subject("CS", "computer science.png", 1, 1.5);  
    Subject[] subjects = {math, bio, chem, physics, cs}; 
    int counter = 0; 
    Subject displayedSubject = subjects[counter]; 
    
    @FXML Button prev, next, searchButton;
    @FXML Text sub, units, grade, errorMsg;
    @FXML ImageView img; 
    @FXML TextField searchField; 
    
    @FXML
    private void searchSub (ActionEvent event) {
        String sm = searchField.getText();
        try {
            counter = Subject.getSubjectIndex(Subject.searchSubject(sm));
            display();
            errorMsg.setText("");
        }
        catch (NullPointerException e) {
            errorMsg.setText("Invalid subject searched.");
            errorMsg.setStyle("-fx-text-fill: red;");
        }
        
    }
    
    @FXML
    private void prevSub(ActionEvent event) {
        counter--; 

        display();
    }
    
    private void display() {
        if (counter==0) {
            prev.setDisable(true);
        }
        if (counter!=4) {
            next.setDisable(false);
        }
        if (counter==4) {
            next.setDisable(true);
        }
        if (counter!=0) {
            prev.setDisable(false);
        }
        displayedSubject = subjects[counter];
        sub.setText("Subject: " + displayedSubject.getName());
        units.setText("Subject units: " + displayedSubject.getUnits());
        grade.setText("Subject: " + displayedSubject.getGrade());
        Image image = new Image(getClass().getResourceAsStream(displayedSubject.getImgFileName()));
        img.setImage(image);
    }
    
    @FXML
    private void nextSub (ActionEvent event) {
        counter++; 
        display();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        display();
        prev.setDisable(true);

    }    
    
}
