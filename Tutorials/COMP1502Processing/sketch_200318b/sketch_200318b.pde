
int x;
int y;

void setup() {
 size(600, 400);
 background(255);
  
  x = 0;
  y = 0;
  
}

void draw() {
  //background(255);
  //fill(123, 200, 79);
  //rect (x, y, 100, 100);
  
  
  //x += 2;
  //y += 2;
  
  //x = x % 600;
  //y = y % 400;
  
  
  
}


void mouseClicked() {
  line(0, 0, mouseX, mouseY);
}
