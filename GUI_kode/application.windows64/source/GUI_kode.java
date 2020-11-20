import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GUI_kode extends PApplet {

Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!");
Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!");
Button buttonTerning12 = new Button(10, 80, 150, 50, "Slå med 12s terning!");
Button buttonTerning20 = new Button(340, 80, 150, 50, "Slå med 20s terning!");

int sum;
int terningeKast;

public void setup() {
   

  buttonTerning6.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 7));
      sum += terningeKast;
    }
  }
  );

  buttonTerning10.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 11));
      sum += terningeKast;
    }
  }
  );
  
  buttonTerning12.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 13));
      sum += terningeKast;
    }
  }
  );
  
  buttonTerning20.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 21));
      sum += terningeKast;
    }
  }
  );
}

public void draw() {
  clear();
  buttonTerning6.display();
  buttonTerning10.display();
  buttonTerning12.display();
  buttonTerning20.display();
  fill(255);
  textAlign(CENTER);
  text("Du har kastet " + terningeKast, width/2, 200);
  text("Samlet sum    " + sum, width/2, 250);
}

public void mousePressed() {
  buttonTerning6.click();
  buttonTerning10.click();
  buttonTerning12.click();
  buttonTerning20.click();
}
interface Action{
  public void execute();
}
class Button{
 int posX, posY;
 int l, h;
 String text;
 Action a;
 
  Button(int a, int b, int c, int d, String e){
    posX = a;
    posY = b;
    l = c;
    h = d;
    text = e;
  }
  
  public void addAction(Action a){
    this.a=a;
  }
  
  public void display(){
    fill(255,0,0);
    rect(posX,posY,l,h);
    fill(255);
    text(text,posX,posY);
  }
  
  public void click(){
    if((mouseX>posX)&&(mouseY>posY)&&(mouseX<posX+l)&&(mouseY<posY+h)){
      a.execute();
    }
  }
}
  public void settings() {  size(500, 300); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GUI_kode" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
