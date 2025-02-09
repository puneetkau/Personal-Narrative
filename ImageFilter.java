import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {



 public ImageFilter(String filename) {
    super(filename); 
  }

  
  public void colorize() {
    
      Pixel[][] pixels = getImagePixels();
      /*
   * gets the  pixels from the image and puts them into the Pixel array, giving us the rows and columns
   */
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
           /* helps us traverse through each element of the Pixel array
        traverses by row
   */
        Pixel currentPixel = pixels[row][col];
        
     /* currentPixel == the pixels array we created at its current position
      this loops / repeats for each index throughout the array
   */
        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3; 
        
            /* calculates the average of the red, green, and blue of each pixel
        does this by adding the amounts and dividing by 3.
   */
        if (grayValue < 85) {
          currentPixel.setRed(180);
          currentPixel.setGreen(0);
          currentPixel.setBlue(0);
        }
        
   /* if the pixels are dark (< 85), it boosts up the red to the max.
   */
        else if (grayValue < 100) {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(180);
        }
          
  /* middle ground -- boosts up blue if the pixels are bigger than 85 but smaller than 100.
   */
        else {
          currentPixel.setRed(50);
          currentPixel.setGreen(180);
          currentPixel.setBlue(0);
          
   /* otherwise, if it's bright it boosts up the green and balances it with red.
   */
        }
      }
    }
    return;
  }

    public void grayscale() {
    
      Pixel[][] pixels = getImagePixels();
       /* gets the  pixels from the image and puts them into the Pixel array, giving us the rows and columns
   */
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        /*helps us traverse through each element of the Pixel array
traverses by row */

      
        Pixel currentPixel = pixels[row][col];
        /* currentPixel == the pixels array we created at its current position
        this loops / repeats for each index throughout the array */
        
        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3; 
        /* calculates the average of the red, green, and blue of each pixel
        does this by adding the amounts and dividing by 3. */

        
        if (grayValue < 85) {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(0);
        }
        /* if the pixels are dark (< 85), it turns all colors to 0. */

        else if (grayValue < 170) {
          currentPixel.setRed(255);
          currentPixel.setGreen(255);
          currentPixel.setBlue(255);
        }
          /* boosts up every color to the max */
        else {
          currentPixel.setRed(100);
          currentPixel.setGreen(100);
          currentPixel.setBlue(100);
          /* middle ground for every color (gray) */
        }
      }
    }
    return;
  }

      public void purpleTint() {
    
      Pixel[][] pixels = getImagePixels();
    
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {

        Pixel currentPixel = pixels[row][col];

        
        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3; 
        /* calculates the average of the red, green, and blue of each pixel
        does this by adding the amounts and dividing by 3.*/
     
        if (grayValue < 170) {
          currentPixel.setRed(255);
          currentPixel.setGreen(0);
          currentPixel.setBlue(255);
        }
        /* if the pixels are < 170, it boosts up the red and blue to the max to make purple.*/

       
      }
    }
    return;
  }
  
    public void coolTone() {
    
      Pixel[][] pixels = getImagePixels();

    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
      
        Pixel currentPixel = pixels[row][col];

        int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
        grayValue /= 3; 

        
        if (grayValue < 85) {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(100);
        }
        /* if the pixels are dark (< 85), it boosts up the blue a little less than halfway.*/

        else if (grayValue < 170) {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(150);
        }
          /*middle ground -- boosts up blue a bit darker*/
        else {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(255);
          /*otherwise, if it's bright the blue is darkest.*/
        }
      }
    }
    return;
  }
  
}