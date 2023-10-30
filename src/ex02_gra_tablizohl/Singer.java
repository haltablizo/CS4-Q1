/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_gra_tablizohl;

/**
 *
 * @author hannah angela
 */
public class Singer {
    String singerName; 
    int noOfPerformances; 
    double earnings; 
    Song favoriteSong; 
    
    public Singer(String n, Song f) {
        singerName = n; 
        noOfPerformances = 0; 
        earnings = 0.0; 
        favoriteSong = f; 
    }
    
    public void performForAudience(int p) {
        noOfPerformances += 1; 
        earnings += p*100; 
        System.out.println(singerName + " performed for " + p + " people, and earned PhP " + earnings); 
    }
    
    public void changeFavSong(Song n) {
        favoriteSong = n; 
        System.out.println(singerName + "'s favorite song has been changed to \"" + n.name + "\" by " + n.artist); 
    }
}