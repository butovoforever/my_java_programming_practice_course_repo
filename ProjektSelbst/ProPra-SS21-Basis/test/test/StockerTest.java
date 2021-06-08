package test;


import stocker.IStockerTester;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Diese Klasse ist die abstrakte Super-Klasse für den geforderten JUnit-Test.
 * Von dieser Klasse muss eine eigene Klasse abgeleitet werden, in der lediglich
 * die Methode {@link #setUp()} zu überschreiben ist.
 * 
 * @author ProPra-Team FernUni Hagen
 */
public abstract class StockerTest {

	/** das Interface für das Testen */
	protected IStockerTester stockerTester;

	/**
	 * Die Methode {@link #setUp()} ist mit der <code>@BeforeEach</code>-Annotation
	 * ausgezeichnet. Das heißt, sie wird vor jedem einzelnen Testlauf aufgerufen.
	 * 
	 * <p>
	 * Diese Methode muss überschrieben werden, indem über die Setter-Methode
	 * {@link #setStockerTester(IStockerTester)} eine Instanz der Klasse zugewiesen
	 * wird, die das Interface {@link IStockerTester} implementiert.
	 * </p>
	 */
	@BeforeEach
	public abstract void setUp();

	/**
	 * Über diese Methode wird der {@link #stockerTester} gesetzt.
	 * 
	 * @param tester eine Instanz der Klasse, die das Interface
	 *               {@link IStockerTester} implementiert
	 */
	public void setStockerTester(IStockerTester tester) {
		stockerTester = tester;
	}

	@Test
	public void testWatchList() {

		stockerTester.clearWatchlist();
		assertEquals(0, stockerTester.getWatchlistStockIds().length);

		stockerTester.addWatchlistEntry("APPLE");
		stockerTester.addWatchlistEntry("APPLE");
		stockerTester.addWatchlistEntry("APPLE");
		stockerTester.addWatchlistEntry("TESLA");
		stockerTester.addWatchlistEntry("IBM");
		stockerTester.addWatchlistEntry("Facebook");
		assertEquals(4, stockerTester.getWatchlistStockIds().length);

		stockerTester.removeWatchlistEntry("Microsoft");
		assertEquals(4, stockerTester.getWatchlistStockIds().length);

		stockerTester.removeWatchlistEntry("IBM");
		assertEquals(3, stockerTester.getWatchlistStockIds().length);
		assertEquals("TESLA", stockerTester.getWatchlistStockIds()[1]);

		stockerTester.clearWatchlist();

	}

	@Test
	public void testAlarms01() {

		stockerTester.clearAllAlarms();
		stockerTester.addAlarm("APPLE", 130.3);
		stockerTester.addAlarm("APPLE", 210.89);
		stockerTester.addAlarm("TESLA", 23.90);

		assertEquals(2, stockerTester.getAlarms("APPLE").length);
	}

	@Test
	public void testAlarms02() {

		stockerTester.clearAllAlarms();
		stockerTester.addAlarm("APPLE", 130.3);
		stockerTester.addAlarm("APPLE", 210.89);
		stockerTester.addAlarm("TESLA", 23.90);

		assertEquals(1, stockerTester.getAlarms("TESLA").length);
	}

	@Test
	public void testAlarms03() {

		stockerTester.clearAllAlarms();
		stockerTester.addAlarm("APPLE", 130.3);
		stockerTester.addAlarm("APPLE", 210.89);
		stockerTester.addAlarm("TESLA", 23.90);

		assertEquals(0, stockerTester.getAlarms("Facebook").length);
	}

	@Test
	public void testAlarms04() {

		stockerTester.clearAllAlarms();
		stockerTester.addAlarm("APPLE", 130.3);
		stockerTester.addAlarm("APPLE", 210.89);
		stockerTester.addAlarm("TESLA", 23.90);

		assertEquals(2, stockerTester.getAlarms("APPLE").length);
		assertEquals(1, stockerTester.getAlarms("TESLA").length);

		stockerTester.clearAlarms("TESLA");
		assertEquals(0, stockerTester.getAlarms("TESLA").length);

		stockerTester.removeAlarm("APPLE", 210.89);
		assertEquals(1, stockerTester.getAlarms("APPLE").length);
		assertEquals(130.3, stockerTester.getAlarms("APPLE")[0]);
	}

	// --------------------------------------
	// Weitere Testfälle werden folgen.
	// Bitte beobachten Sie daher auch regelmäßig die Newsgroups.
	// --------------------------------------
}