
package ex03_gra_tablizohl;

public class Singer {
    private String singerName; 
    private int noOfPerformances; 
    private double earnings; 
    private Song favoriteSong; 
    private static int totalPerformances; 
    
    public Singer(String n, Song f) {
        singerName = n; 
        noOfPerformances = 0; 
        earnings = 0.0; 
        favoriteSong = f; 
    }
    
    public void changeFavSong(Song n) {
        favoriteSong = n; 
        System.out.println(singerName + "'s favorite song has been changed to \"" + n.getName() + "\" by " + n.getArtist()); 
    }
    
    public void performForAudience(int p) {
        noOfPerformances++; 
        totalPerformances++;
        earnings += p*100; 
        System.out.println(singerName + " performed for " + p + " people, and earned PhP " + p*100.0); 
    }

    public void performForAudience(int p, Singer n) { 
       noOfPerformances++;  
       n.noOfPerformances++; 
       n.earnings += p*50; 
       earnings += p*50; 
       
       totalPerformances += 1; 
       System.out.println(singerName + " performed with " + n.singerName + " for " + p + " people. Their total earnings were PhP " + p*100.0); 

    }
    
}