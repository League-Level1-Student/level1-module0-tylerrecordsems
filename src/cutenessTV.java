import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	JButton Duck = new JButton();
	JButton frog = new JButton();
	JButton fluffy = new JButton();
public void showButton(){
	   JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		   frame.add(panel);
		frame.setVisible(true);
		   panel.add(Duck);
		   panel.add(frog);
		   panel.add(fluffy);
		 Duck.setText("DUCK!");
		 frog.setText("FROG!");
		 fluffy.setText("FLUFFY!");
		   Duck.addActionListener(this);
		   frog.addActionListener(this);
		   fluffy.addActionListener(this);
		  frame.pack();
	       
}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton button = (JButton) arg0.getSource();
		 if (button == Duck) {
showDucks();
System.out.println("sup");
		 }else if (button == frog) {
			 showFrog();
		 }else if (button == fluffy) {
			 showFluffyUnicorns();
		 }
	}
	
}
