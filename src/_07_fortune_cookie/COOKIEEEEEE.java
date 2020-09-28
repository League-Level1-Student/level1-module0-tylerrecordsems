package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
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
			// TODO Auto-generated method stub
			
		}
}