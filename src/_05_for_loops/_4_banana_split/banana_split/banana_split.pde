
void setup (){
  size(600,600);
}

void draw () {
  int yPos = 300;
  for (int i = 0; i < 3; i++){
    text("ice cream ", 300, yPos);
    yPos = yPos + 10;
  }
  text("banana ", 310, 330);
}
