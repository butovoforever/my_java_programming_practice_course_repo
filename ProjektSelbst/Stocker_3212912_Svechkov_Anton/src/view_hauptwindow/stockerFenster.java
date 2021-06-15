package view_hauptwindow;
import javax.swing.*;

public class stockerFenster extends JFrame {
	public stockerFenster(){
		JFrame frame = new JFrame("Stocker_3212912_Svechkov_Anton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		JMenuBar hauptMenu = new JMenuBar();

		JMenu Datei = new JMenu("Datei");
		JMenu AktienSuche = new JMenu("Aktiensuche");
		JMenu Einstellungen = new JMenu("Einstellungen");
		JMenu Fenster = new JMenu("Fenster");
		
		JMenuItem DateiMenuItem1 = new JMenuItem("Beenden");
		
		JMenuItem FensterMenuItem1 = new JMenuItem("Watchlist");
		
		Datei.add(DateiMenuItem1);
		
		Fenster.add(FensterMenuItem1);

		hauptMenu.add(Datei);
		hauptMenu.add(AktienSuche);
		hauptMenu.add(Einstellungen);
		hauptMenu.add(Fenster);
		
		frame.setJMenuBar(hauptMenu);

		frame.setVisible(true);
		
		
		
		
		
	}
}
