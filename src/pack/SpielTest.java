package pack;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pack.Stapel.StapelElement;
/**
 * Die Test-Klasse KarteTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SpielTest
{
    /**
     * Konstruktor fuer die Test-Klasse KarteTest
     */
    public SpielTest()
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
    public void testSpiel()
    {
        Spiel spiel1=new Spiel();
        assertNotNull(spiel1.gemischterStapel.top());
    }
    public void testBehalten()
    {
        Spiel spiel1=new Spiel();
        StapelElement<Karte> ex_top=spiel1.gemischterStapel.pop();
        spiel1.keepStapel.push(ex_top);
        assertNotEquals(ex_top, spiel1.gemischterStapel.top());
        assertEquals(ex_top, spiel1.keepStapel.top());
    }
    public void testWegwerfen()
    {
        Spiel spiel1=new Spiel();
        StapelElement<Karte> ex_top=spiel1.gemischterStapel.pop();
        spiel1.throwStapel.push(ex_top);
        assertNotEquals(ex_top, spiel1.gemischterStapel.top());
        assertEquals(ex_top, spiel1.throwStapel.top());;
    }
}