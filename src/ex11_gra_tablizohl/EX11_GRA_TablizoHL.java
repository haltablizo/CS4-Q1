
package ex11_gra_tablizohl;

import javax.swing.*; 
import java.awt.*; 

public class EX11_GRA_TablizoHL {

    public static void main(String[] args) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject[] subjects = {math, bio, chem, physics, cs}; 
        int counter = 0; 
        Subject displayedSubject = subjects[counter]; 
        
        JFrame frame = new JFrame(); 
        frame.setTitle("Tablizo - Exercise 11"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500); 
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10)); 
        frame.setVisible(true); 
        
        JLabel name = new JLabel();
        JLabel image = new JLabel(); 
        JLabel unit = new JLabel(); 
        JLabel grade = new JLabel();
        
        JButton button = new JButton("Next"); 
        
        
        frame.add(name);         
        frame.add(image); 
        frame.add(unit); 
        frame.add(grade); 
        frame.add(button); 
        
        name.setText(displayedSubject.getName());
        unit.setText(Double.toString(displayedSubject.getUnits()));
        grade.setText(Double.toString(displayedSubject.getGrade()));

        button.setSize(200,100); 

        
        ImageIcon img = new ImageIcon(EX11_GRA_TablizoHL.class.getResource(displayedSubject.getImgFileName())); 
        image.setIcon(img);
      

    }
    
}
