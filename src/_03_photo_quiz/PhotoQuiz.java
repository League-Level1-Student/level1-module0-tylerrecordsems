package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
	String axolotl ="https://images.fineartamerica.com/images/artworkimages/mediumlarge/1/axolotl-face-warren-photographic.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component pic;
		// 3. use the "createImage()" method below to initialize your Component
	pic = createImage(axolotl);
		// 4. add the image to the quiz window
quizWindow.add(pic);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer=JOptionPane.showInputDialog("What animal is this");
		// 7. print "CORRECT" if the user gave the right answer
if (answer.equals ("axolotl")) {
	JOptionPane.showMessageDialog(null,"CORRECT");
}else {
	JOptionPane.showMessageDialog(null,"INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(pic);

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window
String puppy ="https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12231413/Labrador-Retriever-MP.jpg";


		// 12. pack the quiz window
Component pics;
pics = createImage(puppy);
quizWindow.add(pics);
quizWindow.pack();

		// 13. ask another question
String answers=JOptionPane.showInputDialog("Do you want a dog now?");
if (answers.equals ("yes")) {
	JOptionPane.showMessageDialog(null,"CORRECT");
}else {
	JOptionPane.showMessageDialog(null,"INCORRECT");
}



		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
