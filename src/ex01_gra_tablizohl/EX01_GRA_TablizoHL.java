
package ex01_gra_tablizohl;

/**
 *
 * @author TABLIZO
 */
public class EX01_GRA_TablizoHL {

    public static void main(String[] args) {
        String firstAnimeName = "Horimiya";
        int firstAnimeEp = 13; 
        double firstAnimeRating = 8.1;
        
        String secondAnimeName = "Summertime Rendering";
        int secondAnimeEp = 25; 
        double secondAnimeRating = 8.2; 
        
        String thirdAnimeName = "Hunter x Hunter";
        int thirdAnimeEp = 148; 
        double thirdAnimeRating = 9.0; 

        System.out.print("Total number of episodes: "); 
	System.out.println(firstAnimeEp + secondAnimeEp + thirdAnimeEp); 

	System.out.print("Horimiya has a higher rating than Summmertime Rendering: "); 
	System.out.println(firstAnimeRating > thirdAnimeRating); 

	System.out.print("Hunter x Hunter has the most number of episodes: "); 
	System.out.println(thirdAnimeEp > firstAnimeEp && thirdAnimeEp > secondAnimeEp); 
    }
    
}