
package ex03_gra_tablizohl;

public class Song {
    private String name; 
    private String artist; 
    private int streams; 
    private boolean explicit; 
    
    public Song (String n, String ar, int s, boolean ex) {
        name = n; 
        artist = ar; 
        streams = s; 
        explicit = ex; 
    }
    
    public String getName() {
        return name; 
    }
    
    public String getArtist() {
        return artist; 
    }
    
}
