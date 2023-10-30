
package ex02_gra_tablizohl;

public class EX02_GRA_TablizoHL {

    public static void main(String[] args) {
        Anime firstAnime = new Anime("Horimiya",13,8.1);         
        Anime secondAnime = new Anime("Summertime Rendering",25, 8.2); 
        Anime thirdAnime = new Anime("Hunter x Hunter",148,9.0); 

        Song firstSong = new Song("The Spins", "Mac Miller", 504692596, true);  
        Song secondSong = new Song("I know it won't work", "Gracie Abrams", 32985033, false); 
        
        Singer firstSinger = new Singer("Mitski", firstSong); 
        
        firstSinger.performForAudience(12);         
        firstSinger.changeFavSong(secondSong); 
        
        System.out.println("-------------    END    ----------------"); 
    }
}