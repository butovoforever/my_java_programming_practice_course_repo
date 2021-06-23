package view_watchlistWindow;

import javax.swing.JInternalFrame;

public class watchlistWindow extends JInternalFrame {
	//Name und weitere Attributen sind noch durch Attributen spaeter zu bestimmen
	watchlistWindow() {
	
		JInternalFrame myInternalFrame = new JInternalFrame(("Internal frame"),true,true,true,true);
		myInternalFrame.setLocation(100, 100);
		myInternalFrame.setSize(100, 100);
		myInternalFrame.setVisible(true);
	
	}
}
