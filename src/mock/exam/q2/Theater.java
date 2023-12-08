
package mock.exam.q2;

public class Theater extends Venue{
    private int numStages;

    public Theater(String n, String l, double v, int num){
        super(n, l, v); 
        numStages = num;
    }
    
    @Override 
    public boolean checkAvailability() {
        return numStages > 0; 
    }
    
    @Override 
    public void reserve() {
        numStages -= 1; 
    }
    
    @Override 
    public void hostEvent() {
        numStages += 1; 
    }
}

