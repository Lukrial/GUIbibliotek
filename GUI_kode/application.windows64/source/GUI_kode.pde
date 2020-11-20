Button buttonTerning6 = new Button(10, 10, 150, 50, "Slå med 6s terning!");
Button buttonTerning10 = new Button(340, 10, 150, 50, "Slå med 10s terning!");
Button buttonTerning12 = new Button(10, 80, 150, 50, "Slå med 12s terning!");
Button buttonTerning20 = new Button(340, 80, 150, 50, "Slå med 20s terning!");

int sum;
int terningeKast;

void setup() {
  size(500, 300); 

  buttonTerning6.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 7));
      sum += terningeKast;
    }
  }
  );

  buttonTerning10.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 11));
      sum += terningeKast;
    }
  }
  );
  
  buttonTerning12.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 13));
      sum += terningeKast;
    }
  }
  );
  
  buttonTerning20.addAction(new Action() {   
    public void execute() {
      terningeKast = int(random(1, 21));
      sum += terningeKast;
    }
  }
  );
}

void draw() {
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

void mousePressed() {
  buttonTerning6.click();
  buttonTerning10.click();
  buttonTerning12.click();
  buttonTerning20.click();
}
