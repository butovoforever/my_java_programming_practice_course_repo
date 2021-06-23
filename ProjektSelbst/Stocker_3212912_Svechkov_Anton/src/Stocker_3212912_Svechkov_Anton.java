import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import view_chartWindow.chartWindow;
import view_mainWindow.FensterChartJMenuItem;
import view_mainWindow.mainWindow;

public class Stocker_3212912_Svechkov_Anton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainWindow haupt = new mainWindow("Stocker_3212912_Svechkov_Anton");
		
		
		/*
		 Experiment (begin) - creating chart window (inner to mainWindow) and(!!!)
		 connecting(!!!) it with FensterChartJMenuItem, while adding FensterChartJMenuItem to "Fenster" menu
		 
		 Later, it will be implemented, while selecting a specific "ticker"-chart from watchlist
		  */
		JMenuItem experimentChartWindow = new JMenuItem("experimentChartWindow");
		

		//new chart Window is not added to the Pane, and it's name is not shown in Fenster menu
		experimentChartWindow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				chartWindow chartWindow = new chartWindow ("ExperimentChart");
				
				FensterChartJMenuItem associatedFensterChartJMenuItem = new FensterChartJMenuItem(chartWindow, haupt);
				
				//we need to add action listener "onclose", so that after chartWindow is closed
				//associated FensterChartJMenuItem is deleted from "Fenster" menu of mainWindow
				chartWindow.addInternalFrameListener(new InternalFrameListener() {
					
					@Override
					public void internalFrameClosing(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						haupt.deleteWatchlistFromFenster(associatedFensterChartJMenuItem);
					}
					
					@Override
					public void internalFrameClosed(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void internalFrameDeactivated(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					
					@Override
					public void internalFrameOpened(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void internalFrameIconified(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void internalFrameDeiconified(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void internalFrameActivated(InternalFrameEvent e) {
						// TODO Auto-generated method stub
						
					}
					
						
					}
				
				);

				//haupt.myPane.add(chartWindow = new chartWindow ("ExperimentChart", haupt));
				haupt.myPane.add(chartWindow);
				
				haupt.setVisible(true);
			}
		});

		
		haupt.Fenster.add(experimentChartWindow);
		
		haupt.setJMenuBar(haupt.hauptMenu);
		
		
		/*Experiment(end)*/
		
		haupt.setVisible(true);

	}

}
