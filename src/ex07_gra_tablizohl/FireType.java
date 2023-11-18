
package ex07_gra_tablizohl;

public class FireType extends SimpleMonster {
    
    public FireType(String n, int m, int base) {
        super(n, "fire", "grass", "water", m, base);
        atk = 1.3*base;        
        def = 0.7*base;
    }

    @Override
    public void special() {
        atk += 2; 
        hp -= 0.1*this.getMaxHP();
        
        System.out.println(this.getName() + " used special! Atk was increased by 2, but HP was decreased by " + 0.1*this.getMaxHP()); 
    }
} 