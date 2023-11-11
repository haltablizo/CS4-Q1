
package ex06_gra_tablizohl;

public class WaterType extends SimpleMonster {
    
    public WaterType(String n, int m, int base) {
        super(n, "water", "fire", "grass", m, base);
        atk = 0.7*base;        
        def = 1.3*base;
    }
    
    @Override
    public void special() {
        def += 2; 
        hp -= 0.1*this.getMaxHP();
        System.out.println(this.getName() + " used special! Def was increased by 2, but HP was decreased by " + 0.1*this.getMaxHP()); 
    }
}
