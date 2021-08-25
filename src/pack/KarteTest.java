package pack;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Die Test-Klasse KarteTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KarteTest
{
    /**
     * Konstruktor fuer die Test-Klasse KarteTest
     */
    public KarteTest()
    {
    }
    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     * @throws InterruptedException
     */
    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void testGetWert()
    {
        int x=Karte.randInteger(1, 15);
        Karte karte1=new Karte(x);
        assertEquals(x, karte1.getWert());
    }
}