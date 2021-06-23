package view_chartWindow;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import view_mainWindow.FensterChartJMenuItem;
import view_mainWindow.mainWindow;

public class chartWindow extends JInternalFrame {
		

	//Name und weitere Attributen sind noch durch Attributen spaeter zu bestimmen
	//public chartWindow(String name, mainWindow mainWindow) {
	public chartWindow(String name) {
		
		//these settings are still to be reviewed when implementing charts and its features
		this.title = name;
		
		this.iconable = true;
        this.resizable = true;
        this.closable = true;
        this.maximizable = true;
        
		
        this.setLocation(100, 100);
        this.setSize(100, 100);
        this.setVisible(true);

	}


}
	
