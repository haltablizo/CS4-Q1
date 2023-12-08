
package mock.exam.q2;

public class Band {
    private String name;
    protected Venue selectedVenue;
    protected int popularity, performances;

    public Band(String s, int p){
        name = s;
        popularity = p;
        performances = 0;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            popularity += 5;
            performances++;
        }
    }
}
