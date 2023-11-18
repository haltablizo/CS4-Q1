
package ex07_gra_tablizohl;

public class EX07_GRA_TablizoHL {

    public static void main(String[] args) {
        
        Trainer ash = new Trainer("Ash"); 
        FireType charmander = new FireType("Charmander", 100, 20); 
        NPC gio = new NPC("Gio");
        Location xianzhou = new Location("Xianzhou","Songlotus"); 
        
        ash.inspect(charmander);         
        ash.inspect(gio); 
        ash.inspect(xianzhou); 
        

    }
    
}
