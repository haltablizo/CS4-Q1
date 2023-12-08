
package mock.exam.q2;

public class BandTour {
    public static void main(String[] args) {

        Stadium s1 = new Stadium("SHB 316", "Pisay", 50); 
        IndieBand i1 = new IndieBand("asd", 50, "Pisay"); 
        Theater t1 = new Theater("SM", "QC", 80, 8); 
        i1.reserve(t1);
        i1.perform(); 
    }

}
