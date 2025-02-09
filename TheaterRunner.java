import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

 /* 2D array
 */
    String[][] artistName = {
      {"chaseAtlantic", "theNbhd"},
      {"lilPeep", "cocteauTwins"}
    };

    ImageFilter[][] artistImage = {
      { new ImageFilter("chaseAtlantic.png"), new ImageFilter("theNbhd.png") },
      { new ImageFilter("lilPeep.png"), new ImageFilter("cocteauTwins.png") },
    };

 /* MyStory object
 */
    MyStory scene = new MyStory(artistName, artistImage);
    
    // Call drawScene
    scene.playSound("ding.wav");
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}