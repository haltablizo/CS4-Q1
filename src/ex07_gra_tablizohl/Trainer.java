package ex07_gra_tablizohl;
import java.util.*;

public class Trainer extends Character {
    private SimpleMonster activeMonster;
    private ArrayList<SimpleMonster> team;

    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public SimpleMonster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<SimpleMonster> getTeam(){
        return team;
    }

    public void capture(SimpleMonster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(SimpleMonster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    
    public void inspect(Interactive i) {
        i.interact(); 
    }
}
