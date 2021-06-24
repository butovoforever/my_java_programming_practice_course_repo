package view_mainWindow;
import javax.swing.*;
import controller_actionListeners.*;

public class mainWindow extends JFrame {

	//attributes, that are necessary to connect mainWindow, chartWindow and corresponding FensterChartMenuItem
	public JMenuBar hauptMenu;
	public JMenu Fenster;
	public JDesktopPane myPane;

	
//constructor #1, with name (String) in parameters
	public mainWindow(String name){
		
		
		this.setTitle(name);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		
		this.setVisible(true);
		
		//setting the pane of the mane window
		this.myPane = new JDesktopPane();
		this.setContentPane(myPane);
		
		
		//tuning of the menu bar
		this.hauptMenu = new JMenuBar();

		JMenu Datei = new JMenu("Datei");
		
		JMenuItem DateiMenuItem1 = new JMenuItem("Beenden");
		DateiMenuItem1.addActionListener(new beendenActionListener());
		Datei.add(DateiMenuItem1);
				
		
		JMenu AktienSuche = new JMenu("Aktiensuche");
		
		
		JMenu Einstellungen = new JMenu("Einstellungen");
		
		
		this.Fenster = new JMenu("Fenster");		
		JMenuItem FensterMenuItem1 = new JMenuItem("Watchlist");		
		Fenster.add(FensterMenuItem1);

		
		hauptMenu.add(Datei);
		hauptMenu.add(AktienSuche);
		hauptMenu.add(Einstellungen);
		hauptMenu.add(Fenster);
		
			
		
		this.setJMenuBar(hauptMenu);
		//tuning of menu bar completed
		
		


		
		

		this.setVisible(true);
		
		        
	}

	
	// methods of mainWindow class to add/delete chartWindow-related buttons
	// to/from Fenster menu of menu-bar in the main window
	public void addWatchlistToFenster (FensterChartJMenuItem FensterMenuItem) {
		this.Fenster.add(FensterMenuItem);
		
		this.setVisible(true);
		
		
	}
	
	public void deleteWatchlistFromFenster (FensterChartJMenuItem FensterMenuItem) {
		this.Fenster.remove(FensterMenuItem);
		
		this.setVisible(true);
		
		
	}
	
	
	
}
