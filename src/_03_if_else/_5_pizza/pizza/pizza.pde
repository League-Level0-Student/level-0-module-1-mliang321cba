
void setup() {
    size(600,600);
     fill(#D8A22C);
  ellipse(300,300,300,300);
  fill(#CE3115);
  ellipse(300,300,275,275);
  fill(#FFF703);
  ellipse(300,300,270,270);
}
void draw() {

  if(mousePressed){
  PImage pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(300,300);
  image(pepperoni, 150,150);
  }
}
