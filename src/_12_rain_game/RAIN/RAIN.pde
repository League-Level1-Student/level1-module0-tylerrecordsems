int score = 0;
int t = 500;
int x = 100;
 int y = 100;
 void setup (){
 size(600, 600);
 }
 void draw(){
  background(75, 0, 0);
     fill(0, 0, 50);
    stroke(0, 50, 0);
    ellipse(x, y, 100, 100);
    y += 5;
       rect(t , 490, 100, 100);
       t=mouseX;
   for (int i = 0; i < 600; i++) {

   }
   
    if (y==550){
    y = 80;
     x =(int) random(1,600);
    }
   
 }
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
            fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    }
