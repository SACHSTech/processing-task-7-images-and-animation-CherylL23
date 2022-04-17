import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

 
  public void setup() {
    //background image
    PImage imgBackground;
    imgBackground = loadImage("Grass.png.png");
    imgBackground.resize(width, height);
    image(imgBackground, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //Redrawing background to clear out the previous drawings 
    PImage imgBackground;
    imgBackground = loadImage("Grass.png.png");
    imgBackground.resize(width, height);
    image(imgBackground, 0, 0);

    //Image animaton variables
    PImage imgSlime;  
    imgSlime = loadImage("RedSlime.png");
    imgSlime.resize(200, 200);
    image(imgSlime, 0, 0);


    //Shape animation variables 



  }
  
  // define other methods down here.
}