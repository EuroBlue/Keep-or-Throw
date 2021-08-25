/**
 * Beschreiben Sie hier die Klasse Stapel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Stapel<T>
{
    public Karte<T> top;
    /**
     * Konstruktor für Objekte der Klasse Stapel
     */
    public Stapel()
    {
        top=null;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public boolean isEmpty()
    {
        if(this.top==null)
        {
            return true;
        }
        return false;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @return        die oberste Karte
     */
    public Karte<T> top()
    {
        return this.top;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void push(Karte<T> k)
    {
        k.next=this.top;
        this.top=k;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public Karte<T> pop()
    {
        if(this.top==null)
        {
            return null;
        }
        Karte<T> ex_top=this.top;
        this.top=this.top.next;
        ex_top.next=null;
        return ex_top;
    }
}