void setup() {
    size(500, 500);
}
void draw() {
    background(0, 0, 0);
    noStroke();
    fill(#FC5454);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#2E9D3A);
    rect(176, 103, 12, 32);
    if(mousePressed){
      fill(0,0,0);
      ellipse(75, 200, 30, 30);
    }
}
