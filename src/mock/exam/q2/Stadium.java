
package mock.exam.q2;

public class Stadium extends Venue {
    private boolean reserved;

    public Stadium(String n, String l, double v){
        super(n, l, v); 
        reserved = false;
    }

    @Override
    public boolean checkAvailability() {
        return reserved; 
    }

    @Override 
    public void reserve() {
        reserved = true; 
    }
    
    @Override 
    public void hostEvent() {
        reserved = false; 
    }
}