package mock.exam.q2;

public class IndieBand extends Band implements SelfPromoting{
    private String origin;
    
    public IndieBand(String s, int p, String o){
        super(s, p); 
        origin = o;
    }
    
    @Override
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            
            if(selectedVenue.getLocation().equals(origin)) {
                popularity += 10; 
            }
            else { 
                popularity += 5;
            }
            performances++;
        }
    }
    
    @Override 
    public void advertise(){
        popularity += performances / 10; 
    }
}