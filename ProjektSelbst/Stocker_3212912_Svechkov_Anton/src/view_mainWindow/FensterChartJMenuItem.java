package view_mainWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import view_chartWindow.chartWindow;

public class FensterChartJMenuItem extends JMenuItem {
	

	// this constructor associates FensterChartJMenuItem with corresponding chartWindow, 
	// and adds it (FensterChartJMenuItem) as a name of the chart to Fenster menu of the mainWindow
	public FensterChartJMenuItem(chartWindow associatedChartWindow, mainWindow mainWindow) {
		
		
		// TODO Auto-generated constructor stub
		this.setText( associatedChartWindow.getTitle() );
		this.setVisible(true);
		
		// we add action listener to make associated chartWindow come to foreground,
		// when that FensterChartJMenuItem is clicked
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				associatedChartWindow.toFront();
			}
		});
		
		// we add the newly created FensterChartJMenuItem to Fenster menu of main window
		mainWindow.addWatchlistToFenster(this);
		mainWindow.setVisible(true);
		
		
		
	}

}
