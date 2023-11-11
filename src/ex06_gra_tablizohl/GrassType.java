
package ex06_gra_tablizohl;

public class GrassType extends SimpleMonster {
    
    public GrassType(String n, int m, int base) {
        super(n, "grass", "water", "fire", m, base);
    }
    
    @Override
    public void special() {
        hp -= 0.2*this.getMaxHP();
        System.out.println(this.getName() + " used special! HP was increased by " + 0.2*this.getMaxHP()); 
    }
}
