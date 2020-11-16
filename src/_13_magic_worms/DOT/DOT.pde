int p = 5;
int t = 10;
int x = 5;
int y = 5;
void setup (){
  size (500,500);
  background(#00FFF0);
}
void draw (){
     for (int i = 0; i < 300; i++) {
fill(y,p,x);
       ellipse(getWormX(x),getWormY(y),5,5);
   x =(int) random(0,500);
          y =(int) random(0,500);
             p =(int) random(0,500);
y+=5;
x+=5;
//if(y==495){
 // y=5;
//  x += t;
//}
makeMagical();

   }
}
 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
