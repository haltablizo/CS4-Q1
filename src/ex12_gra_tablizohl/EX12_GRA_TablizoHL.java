
package ex12_gra_tablizohl;

import javax.swing.*; 
import java.awt.*; 

public class EX12_GRA_TablizoHL {

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
        frame.setTitle("Tablizo - Exercise 12"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500); 
                
        JLabel name = new JLabel();
        JLabel image = new JLabel(); 
        JLabel unit = new JLabel(); 
        JLabel grade = new JLabel();
        JButton button = new JButton("Next");
        
        name.setText(displayedSubject.getName());
        unit.setText("Subject units: " + displayedSubject.getUnits());
        grade.setText("Grade: " + displayedSubject.getGrade());
        button.setSize(200,100);
        ImageIcon img = new ImageIcon(EX12_GRA_TablizoHL.class.getResource(displayedSubject.getImgFileName())); 
        image.setIcon(img);
      
        JPanel north = new JPanel(); 
        north.add(name);
        
        JButton bioButton = new JButton("Biology");
        bioButton.setSize(200,100);
        JButton chemButton = new JButton("Chemistry"); 
        chemButton.setSize(200,100);
        JButton csButton = new JButton("CS"); 
        csButton.setSize(200,100);
        JButton mathButton = new JButton("Math"); 
        mathButton.setSize(200,100);
        JButton physButton = new JButton("Physics");
        physButton.setSize(200,100);
        
        JPanel south = new JPanel(); 
        south.add(bioButton);        
        south.add(chemButton);
        south.add(csButton);
        south.add(mathButton);
        south.add(physButton);
        south.setLayout(new BoxLayout(south, BoxLayout.X_AXIS));

        JPanel center = new JPanel(); 
        center.add(image); 
        
        JPanel east = new JPanel(); 
        east.add(button);
        
        JPanel west = new JPanel(); 
        west.add(unit);         
        west.add(grade); 
        west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));

        frame.add(north, BorderLayout.NORTH);        
        frame.add(center, BorderLayout.CENTER);        
        frame.add(west, BorderLayout.WEST);
        frame.add(east, BorderLayout.EAST);
        frame.add(south, BorderLayout.SOUTH);

        frame.setVisible(true); 

    }
}
