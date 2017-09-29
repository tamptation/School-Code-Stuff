
/**
 * Write a description of class LoopingMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
        String lineOfText;
        int songNumber = 0;
        int totalRatings = 0;
        while ((lineOfText = MediaFile.readString()) != null) {
        String[] parts = lineOfText.split("[|]");
        String sTitle = parts[0];
        String sRating = parts[1];
        System.out.println("Title:" + sTitle);
        System.out.println("Rating: " + sRating);
        songNumber++;
        Integer tRatings = Integer.valueOf(sRating);
        totalRatings = totalRatings = tRatings;
        
       }
       System.out.println("There are " +songNumber + "songs.");
       double avgRating = (totalRatings / songNumber);
       System.out.println("The average rating of the songs is: " + avgRating);
    }
}
