/**
 * Beschreiben Sie hier die Klasse Stapel.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
package pack;
public class Stapel<T>
{
    public StapelElement<T> top;
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
    public StapelElement<T> top()
    {
        return this.top;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void push(StapelElement<T> sE)
    {
        sE.next=this.top;
        this.top=sE;
    }
    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public StapelElement<T> pop()
    {
        if(this.top==null)
        {
            return null;
        }
        StapelElement<T> ex_top=this.top;
        this.top=this.top.next;
        ex_top.next=null;
        return ex_top;
    }
    public static class StapelElement<Type>
    {
        // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
        public StapelElement<Type> next;
        public Type value;
        /**
         * Konstruktor für Objekte der Klasse StapelElement
         */
        public StapelElement(Type obj)
        {
            value=obj;
            next=null;
        }
        public Type getValue() 
        {
            return this.value;
        }
        public StapelElement() {
        }
}

}