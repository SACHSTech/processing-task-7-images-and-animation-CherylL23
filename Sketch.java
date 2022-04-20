import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
	
  //images variables
  PImage imgSlime;
  PImage imgBackground;

  //Image animaton variables
  float imageX = 50;
  float imageY = 40;
  float angle = 0;

  //rectangle icecube variables
  float iceX = 100;
  float iceY = 100;
  float ispeedX = 5;
  float ispeedY = 2;
  

  public void settings() {
    size(400, 400);
  }
 
  public void setup() {

    //background image
    PImage imgBackground;
    imgBackground = loadImage("Grass.png.png");
    imgBackground.resize(width, height);
    image(imgBackground, 0, 0);
  }

  public void draw() {

    //Redrawing background to clear out the previous drawings 
    imgBackground = loadImage("Grass.png.png");
    imgBackground.resize(width, height);
    image(imgBackground, 0, 0);

    //Icecube
    stroke(23, 26, 230);
    fill(23, 219, 230);
    rect(iceX, iceY, 20, 20);

    //shape animation
    iceX = ispeedX + iceX;
    iceY = ispeedY + iceY;

    //preventing the icecube from moving off the screen
    if(iceX < 0 || iceX > width - 20) {
     ispeedX = ispeedX * -1;
    }
    
    if( iceY < 200 || iceY < height) {
     ispeedY = ispeedY * -1;
    }

    //Image animation  
    translate(200, 180);
    angle += 0.05;
    rotate(angle);
    
    //Image
    PImage imgSlime;
    imgSlime = loadImage("RedSlime.png");
    imgSlime.resize(100, 100);
    image(imgSlime, imageX, imageY);
  }
}