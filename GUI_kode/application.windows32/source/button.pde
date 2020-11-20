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
  
  void addAction(Action a){
    this.a=a;
  }
  
  void display(){
    fill(255,0,0);
    rect(posX,posY,l,h);
    fill(255);
    text(text,posX,posY);
  }
  
  void click(){
    if((mouseX>posX)&&(mouseY>posY)&&(mouseX<posX+l)&&(mouseY<posY+h)){
      a.execute();
    }
  }
}
