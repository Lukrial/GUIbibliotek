GUI_kode bib = new GUI_kode();

GUI_kode.Button buttonTerning100 = bib.new Button(195, 150, 100, 33, "Slå med 100s terning!", this);

GUI_kode.Button buttonTerning6 = bib.new Button(10, 10, 150, 50, "Slå med 6s terning!", this);
GUI_kode.Button buttonTerning10 = bib.new Button(340, 10, 150, 50, "Slå med 10s terning!", this);
GUI_kode.Button buttonTerning12 = bib.new Button(10, 80, 150, 50, "Slå med 12s terning!", this);
GUI_kode.Button buttonTerning20 = bib.new Button(340, 80, 150, 50, "Slå med 20s terning!", this);

int sum;
int terningeKast;

void setup() {
  size(500, 300); 

  buttonTerning6.addAction(new GUI_kode.Action() {   
    public void execute() {
      terningeKast = int(random(1, 7));
      sum += terningeKast;
    }
  }
  );

  buttonTerning10.addAction(new GUI_kode.Action() {   
    public void execute() {
      terningeKast = int(random(1, 11));
      sum += terningeKast;
    }
  }
  );

  buttonTerning12.addAction(new GUI_kode.Action() {   
    public void execute() {
      terningeKast = int(random(1, 13));
      sum += terningeKast;
    }
  }
  );

  buttonTerning20.addAction(new GUI_kode.Action() {   
    public void execute() {
      terningeKast = int(random(1, 21));
      sum += terningeKast;
    }
  }
  );

  buttonTerning100.addAction(new GUI_kode.Action() {   
    public void execute() {
      terningeKast = int(random(1, 101));
      sum += terningeKast;
    }
  }
  );
}

void draw() {
  clear();
  buttonTerning100.display();
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
  buttonTerning100.click();
  buttonTerning6.click();
  buttonTerning10.click();
  buttonTerning12.click();
  buttonTerning20.click();
}
