package pack;
import static org.junit.Assert.assertEquals;
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
        stapel1.push(new StapelElement<>());
        assertEquals(false, stapel1.isEmpty());
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
        StapelElement stapelElement1=new Stapel.StapelElement<>();
        StapelElement ex_top=stapel1.top;
        stapel1.push(stapelElement1);
        assertEquals(stapelElement1, stapel1.top);
        assertEquals(ex_top, stapel1.top.next);
    }
    @Test
    public void testPop()
    {
        Stapel stapel1=new Stapel();
        StapelElement karte1=new Stapel.StapelElement<>();
        stapel1.top=karte1;
        StapelElement ex_next=stapel1.top.next;
        stapel1.pop();
        assertEquals(ex_next, stapel1.top);
    }
    public static class StapelElementTest
    {
        /**
         * Konstruktor fuer die Test-Klasse KarteTest
         */
        public StapelElementTest()
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
        public void getValue()
        {
            String string1="Dies ist ein Stest string um nachzupruefen ob der Return und die Refferenzen bei dem StapelElement funtionieren";
            StapelElement<String> stapelElement1=new StapelElement<String>(string1);
            assertEquals(string1,stapelElement1.value, stapelElement1.getValue());
        }
    }
}