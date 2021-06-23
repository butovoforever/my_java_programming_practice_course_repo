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
		
		
		this.myPane = new JDesktopPane();
		this.setContentPane(myPane);
		
		
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

//		frame.setVisible(true);
//		
//		JDesktopPane myPane = new JDesktopPane();
//		frame.setContentPane(myPane);
//		
//		

		this.setVisible(true);
		
		        
	}
	
	public void addWatchlistToFenster (FensterChartJMenuItem FensterMenuItem) {
		this.Fenster.add(FensterMenuItem);
		
		this.setVisible(true);
		
		
	}
	
	public void deleteWatchlistFromFenster (FensterChartJMenuItem FensterMenuItem) {
		this.Fenster.remove(FensterMenuItem);
		
		this.setVisible(true);
		
		
	}
	
	
	
}
