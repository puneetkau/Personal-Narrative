import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

 /* Instance variables
 */
  private String[][] artistName;
  private ImageFilter[][] artistImage;
  
 /* Constructor
 */
  public MyStory(String[][] artistName, ImageFilter[][] artistImage) {
    this.artistName = artistName;
    this.artistImage = artistImage;
  }

 /* Calls each scene of the animation in order
 */
  public void drawScene() {
    drawExampleScene();
    drawFirstScene();
    drawSecondScene();
  }

  public void drawExampleScene() {
 /* draws background as beige
 */
clear("beige");
    /* sets text style to Sans BOLD
 */
setTextStyle(Font.SANS, FontStyle.BOLD);
     /* Writes title screen and locates the text
 */
drawText("Favorite Artists ♫", 120, 200);
     /* Pause
 */
    pause(2.0);
  }

  public void drawFirstScene() {
     /* Makes background beige and clears the previous screen
 */
    clear("beige");

     /* For each index of the artistName array, it makes the name all lowercase and then draws it spread 
     out equally on all 4 corners of the screen.
 */
    for (int row = 0; row < artistName.length; row++) {
      for (int col = 0; col < artistName[0].length; col++) {
         String evenName = artistName[row][col].toLowerCase();
         drawText(evenName, 50 + col * 200, 100 + row * 200);
        pause(0.5);
      }
    }

    pause(1.0);
  }
  public void drawSecondScene() {
    clear("beige");
    
     /* Applies different filters on the images by calling them by index.
 */
    artistImage[0][0].grayscale();
    artistImage[0][1].coolTone();
    artistImage[1][0].purpleTint();
    artistImage[1][1].colorize();

         /* For each index of the artistImage array, it draws the images spread 
     out equally on all 4 corners of the screen.
 */
    for (int row = 0; row < artistImage.length; row++) {
      for (int col = 0; col < artistImage[0].length; col++) {
        drawImage(artistImage[row][col], col * 200, row * 200, 200);
        pause(0.5);
      }
    }

    pause(5.0);
  }

  
}