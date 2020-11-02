 int ANGLE = 50;
  PImage pictureOfRecord; 
  void setup(){
    
                       //as member variable
        size(600,600);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
       
        
          pictureOfRecord.resize(600,600);     //in setup method
       
  
    }

    void draw(){
   if (mousePressed){   
 image(pictureOfRecord, 0, 0);  //in draw method

ANGLE += 5;
rotateImage(pictureOfRecord, ANGLE );
     image(pictureOfRecord, 0, 0);  //in draw method
    }
 
     
}
     void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
