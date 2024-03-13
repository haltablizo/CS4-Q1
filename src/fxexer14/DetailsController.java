
package fxexer14;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;


public class DetailsController implements Initializable {
    private int counter; 
    private int page; 
    
    @FXML Button prev, next, searchButton, back;
    @FXML Text sub, units, grade, errorMsg;
    @FXML ImageView img; 
    @FXML TextField searchField; 
    
    public void display(Subject s) {
        counter = Subject.getSubjectIndex(s);
        sub.setText("Subject: " + s.getName());
        units.setText("Subject units: " + s.getUnits());
        grade.setText("Subject: " + s.getGrade());
        Image image = new Image(getClass().getResourceAsStream("imgs/" + s.getImgFileName()));
        img.setImage(image);
        checkLimit();
    }
    
    public void display() {
        Subject temp = Subject.getSubjectByIndex(counter);
        display(temp);
    }
    
    public void pageUpdater() {
        if (counter>=0 && counter <= 2) page = 0;
        if (counter>=3 && counter <= 5) page = 1;
        if (counter>=6 && counter <= 8) page = 2;             
    }
    
    @FXML
    private void searchSub (ActionEvent event) {
        String sm = searchField.getText();
        try {
            counter = Subject.getSubjectIndex(Subject.searchSubject(sm));
            display();
            errorMsg.setText("");
        }
        catch (NullPointerException e) {
            errorMsg.setText("");
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Not found");
            alert.setHeaderText("Error!!!");
            alert.setContentText("Sorry!! That subject could not be found x_x");
                
            alert.showAndWait();
            searchField.setText("");
        }     
    }
    
    @FXML
    private void prevSub(ActionEvent event) {
        counter--; 
        display();
        checkLimit(); 
    }
    
    @FXML
    private void nextSub (ActionEvent event) {
        counter++; 
        display();
        checkLimit(); 
    }
    
    
    @FXML
    private void back (ActionEvent event) throws IOException { 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        Parent root = loader.load(); 
        MenuController controller = loader.getController();
        System.out.println(counter); 
        pageUpdater();
        System.out.println(page);
        controller.setSubjectIcons(page);
        
        Scene subjectScene = new Scene(root);
        Stage thisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        thisStage.hide();
        thisStage.setScene(subjectScene);
        thisStage.show();
    }
    
    public void checkLimit(){
        if(counter == Subject.getListLength()-1) next.setDisable(true);
        else next.setDisable(false);
        if(counter == 0) prev.setDisable(true);
        else prev.setDisable(false);
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        display();
        checkLimit();

    }    
    
}
