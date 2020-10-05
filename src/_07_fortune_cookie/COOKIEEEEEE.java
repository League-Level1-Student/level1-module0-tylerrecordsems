package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class COOKIEEEEEE implements ActionListener {
        public void showButton() {
            System.out.println("Button clicked");
           
            JFrame frame = new JFrame();
        	JPanel panel = new JPanel();
        	   frame.setVisible(true);
        	   JButton button = new JButton();
               frame.add(button);
               frame.pack();
               button.addActionListener(this);
               
      
       



        
        }

		@Override
		public void actionPerformed(ActionEvent e) {
			Random ran = new Random();
            int num = ran.nextInt(4); 
	if(num== 0) {
        JOptionPane.showMessageDialog(null, "You will die O_o");
        } if(num== 1) {
            JOptionPane.showMessageDialog(null, "You wont die O_o                  (but your dog will)");
            } if(num== 2) {
                JOptionPane.showMessageDialog(null, "DEATH BY SHARK O_o");
            } else if (num== 3) {
                JOptionPane.showMessageDialog(null, "DEATH BY CHICKEN O_o   #EAT MORE COWS!");
            }
	// TODO Auto-generated method stub
			
		}
}