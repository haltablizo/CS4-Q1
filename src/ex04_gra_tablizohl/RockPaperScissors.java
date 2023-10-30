package ex04_gra_tablizohl;
import java.util.Scanner;

public class RockPaperScissors{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        boolean cont = true; 
        
        Move[] moves = {rock, paper, scissors}; 
        
        System.out.println("Welcome to my RPS game :D");
         
        
        do {
            System.out.println("\nPlease select an option."); 
            System.out.println("1. Start the game!");
            System.out.println("2. Change number of rounds to win.");
            System.out.println("3. Exit the application.");
            
            System.out.print("\nResponse: "); 
            int ans = sc.nextInt(); 
            
            switch (ans) {
                case 1: 
                    System.out.println("\nFirst to " + roundsToWin + " wins!"); 
                    int random; 
                    Move progMove;
                    Move playerMove; 
                    int player = 0; //score of player 
                    int prog = 0; //score of program 
                    
                    String winner; 
                    
                    
                    while (player != roundsToWin && prog != roundsToWin) {
                        random = (int) Math.floor(Math.random()*3); 
                        progMove = moves[random]; 
                        System.out.println("I've made my move. Your turn!"); 
                        System.out.println("1. Rock\n2. Paper\n3. Scissors");
                        
                        System.out.print("\nResponse: "); 
                        int choice = sc.nextInt(); 
                        
                        while (choice < 1 || choice > 3) {
                            System.out.print("Invalid choice! Select a number from 1 - 3: "); 
                            choice = sc.nextInt(); 
                        }
                         
                       playerMove = moves[choice-1];
                       
                       System.out.print("\nPlayer chose " + playerMove.getName() + ", and I chose " + progMove.getName()); 
  
                       if (playerMove.getName().equals(progMove.getName())) { 
                            System.out.println(". Its a tie!");
                       }
                       
                       else if(playerMove.getStrongAgainst() == progMove) {
                            System.out.println(". Player wins this round! :)");
                            player++; 
                       }
                       
                       else {
                           System.out.println(". I win this round! :D");
                           prog++; 
                       }     
                        
                       System.out.println("Player: " + player + " || " + "Me: " + prog); 
                    }
                    
                    winner = player > prog ? "\nPlayer wins! :D" : "\nI win! :)"; 
                    
                    System.out.println(winner); 
                    break; 
                    
                case 2: 
                    System.out.print("Please enter a number from 1 - 10: "); 
                    int temp = sc.nextInt(); 
                    
                    while (temp < 1 || temp > 10) {
                        System.out.print("Invalid choice! Please try again: "); 
                        temp = sc.nextInt(); 
                    }
                    
                    roundsToWin = temp;
                    System.out.println("\nNumber of rounds has been changed to " + roundsToWin); 

                    break; 
                    
                case 3: 
                    System.out.println("Successfully exited application."); 
                    System.out.println("Thank you for playing!"); 
                    cont = false; 
                    break; 
                    
                default: 
                    System.out.print("Selection invalid!");
                    break; 
            }
        }
        
        while(cont); 

    }
}