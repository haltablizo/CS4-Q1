
package ex06_gra_tablizohl;

public class EX06_GRA_TablizoHL {

    public static void main(String[] args) {

        FireType charmander = new FireType("charmander",100,30);
        WaterType squirtle = new WaterType("squirtle",100,30); 
        GrassType bulbasaur = new GrassType("bulbasaur", 100, 30);
        
        //Grass vs Fire  
        System.out.println("Bulbasaur vs Charmander"); 
        
        while(bulbasaur.getHP()!=0 || charmander.getHP()!=0) {
            bulbasaur.attack(charmander);
            if (charmander.getHP()!=0) {
                charmander.attack(bulbasaur);

                if (bulbasaur.getHP()==0) break; 
            }
            else break; 
        }
                
        System.out.println("--------------------------------------\n"); 
        bulbasaur.restoreHealth();
        charmander.restoreHealth();

        // Fire vs Water
        System.out.println("Charmander vs Squirtle"); 
        while (charmander.getHP()!=0 || squirtle.getHP()!=0) {
            charmander.attack(squirtle);
            if (squirtle.getHP()!=0) {
                squirtle.attack(charmander);
                if (charmander.getHP()==0) break; 
            } 
            else break;      
        }
        System.out.println("----------------------------------------\n"); 
        charmander.restoreHealth();        
        squirtle.restoreHealth();

        
        //Water vs Grass
        System.out.println("Squirtle vs Bulbasaur"); 
        while (squirtle.getHP()!=0 || bulbasaur.getHP()!=0) {
            squirtle.attack(bulbasaur);
            if (bulbasaur.getHP()!=0) {
                bulbasaur.attack(squirtle);
                if (squirtle.getHP()==0) break; 
            } 
            else break;      
        }
        
        System.out.println("----------------------------------------\n"); 
        
        System.out.println("END OF PROGRAM"); 

    }
}
