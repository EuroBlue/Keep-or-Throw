import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
/**
 * Die Test-Klasse KarteTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class StapelTest
{
    /**
     * Konstruktor fuer die Test-Klasse KarteTest
     */
    public StapelTest()
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
    public void testIsEmpty()
    {
        Stapel stapel1=new Stapel();
        assertEquals(true, stapel1.isEmpty());
    }
    @Test
    public void testTop()
    {
        Stapel stapel1=new Stapel();
        assertEquals(stapel1.top, stapel1.top());
    }
    @Test
    public void testPush()
    {
        Stapel stapel1=new Stapel();
        Karte karte1=new Karte(Karte.randInteger(1,15));
        Karte ex_top=stapel1.top;
        stapel1.push(karte1);
        assertEquals(karte1, stapel1.top);
        assertEquals(ex_top, stapel1.top.next);
    }
    @Test
    public void testPop()
    {
        Stapel stapel1=new Stapel();
        Karte karte1=new Karte(Karte.randInteger(1,15));
        stapel1.top=karte1;
        Karte ex_next=stapel1.top.next;
        stapel1.pop();
        assertEquals(ex_next, stapel1.top);
    }
}