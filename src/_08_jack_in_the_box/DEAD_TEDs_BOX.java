package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DEAD_TEDs_BOX implements ActionListener {
int score = 0;
	public void showPicture(String fileName) {
	     try {
	          
	    	 JLabel imageLabel = createLabelImage("jackInTheBox.png");
	          JFrame frame = new JFrame();
	          
	         


              
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
public void numnum() {
	JFrame frame = new JFrame();
	 JButton button = new JButton();
     frame.add(button);
     button.addActionListener(this);
	   frame.setVisible(true);
  frame.pack();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(score ==4) {
			new DEAD_TEDs_BOX().showPicture("jackInTheBox.png");
		}
		score += 1;
			
		
	}
	}



