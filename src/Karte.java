import java.util.Random;

/**
 * Beschreiben Sie hier die Klasse Karte.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Karte<Type>
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public int wert;
    public Karte<Type> next;

    /**
     * Konstruktor für Objekte der Klasse Karte
     */
    public Karte(int w)
    {
        wert=w;
        next=null;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int getWert()
    {
        return this.wert;
    }
    public static int randInteger(int min, int max)
    {
        Random r=new Random();
        return r.nextInt(15-1+1)+1;
    }
}
