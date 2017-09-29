
/**
 * Write a description of class ArrayMediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{
    public void main(){
        Song[] topTenSongs = {
                new Song("The Twist"),
                new Song("Smooth"), 
                new Song("Mack The Knife"), 
                new Song("How Do I live"), 
                new Song("Party Rock Anthem"), 
                new Song("I Gotta Feeling"), 
                new Song("Macarena"),
                new Song("Physical"),
                new Song("You Lght up My Life"), 
                new Song("Hey Jude") 
            };
        // change the array
        /*System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
        changeSong.setTitle("test");
        }
        // show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
        System.out.println(showSong.getTitle());*/
        for(Song price: topTenSongs ){
            for(int i = 0;i < 10; i++){
               while(i % 3) {
                   changeSong.setPrice(.99);
                }
            }
        }
    } 
}

