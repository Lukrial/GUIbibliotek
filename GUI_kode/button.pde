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
  
  void addAction(Action a){
    this.a=a;
  }
  
  void display(){
    p.fill(255,0,0);
    p.rect(posX,posY,l,h);
    p.fill(255);
    p.text(text,posX,posY);
  }
  
  void click(){
    if((p.mouseX>posX)&&(p.mouseY>posY)&&(p.mouseX<posX+l)&&(p.mouseY<posY+h)){
      a.execute();
    }
  }
}
