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

Button buttonTerning100 = new Button(10,150,150,50,"Slå med 100s terning!",this);
Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!",this);
Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!",this);
Button buttonTerning12 = new Button(10, 80, 150, 50, "Slå med 12s terning!",this);
Button buttonTerning20 = new Button(340, 80, 150, 50, "Slå med 20s terning!",this);

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
  
    buttonTerning100.addAction(new Action() {   
    public void execute() {
      terningeKast = PApplet.parseInt(random(1, 7));
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
  PApplet p;
 int posX, posY;
 int l, h;
 String text;
 Action a;
 
  Button(int a, int b, int c, int d, String e,PApplet p){
    posX = a;
    posY = b;
    l = c;
    h = d;
    text = e;
    this.p = p;
  }
  
  public void addAction(Action a){
    this.a=a;
  }
  
  public void display(){
    p.fill(255,0,0);
    p.rect(posX,posY,l,h);
    p.fill(255);
    p.text(text,posX,posY);
  }
  
  public void click(){
    if((p.mouseX>posX)&&(p.mouseY>posY)&&(p.mouseX<posX+l)&&(p.mouseY<posY+h)){
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
