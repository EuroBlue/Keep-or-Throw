package pack;
import pack.Stapel.StapelElement;
public class Spiel {
    public Stapel<Karte> gemischterStapel;
    public Stapel<Karte> keepStapel;
    public Stapel<Karte> throwStapel;
    public Spiel()
    {
        System.out.println("Neues Spiel, neues Glück");
        gemischterStapel=new Stapel<Karte>();
        keepStapel=new Stapel<Karte>();
        throwStapel=new Stapel<Karte>();
        for (int i=0;i<10; i++) 
        {
            gemischterStapel.push(new StapelElement<Karte>(new Karte(Karte.randInteger(1, 13))));
        }

    }
    public void betrachteNaechsteKarte()
    {
        Karte akktueleKarte=this.gemischterStapel.top().getValue();
        if(akktueleKarte!=null)
        {
            System.out.println("Die Naechste Karte hat den Wert: "+akktueleKarte.getWert());
        }
        else
        {
            System.out.println("Das gemischte Stapel ist leer.\nDas Spiel ist zu ende.");
        }
    }
    public void behalten()
    {
        if(!gemischterStapel.isEmpty())
        {
            StapelElement<Karte> abgehobeneKarte=this.gemischterStapel.pop();
            if (keepStapel.top().getValue()!=null||abgehobeneKarte.getValue().getWert()>keepStapel.top().getValue().getWert()) 
            {
                keepStapel.push(abgehobeneKarte);
                System.out.println("Karte wurde abgelegt");
            }
            else
            {
                gemischterStapel.push(abgehobeneKarte);
                System.out.println("Karte ist tu klein");
            }
        }
        else
        {
            System.out.println("Das gemischte Stapel ist leer.\nDas Spiel ist zu ende.");
        }
    }
    public void wegwerfen()
    {
        if(!gemischterStapel.isEmpty())
        {
            throwStapel.push(this.gemischterStapel.pop());
        }
        else
        {
            System.out.println("Das gemischte Stapel ist leer.\nDas Spiel ist zu ende.");
        }
    }
    public void auswerten()
    {
        Stapel<Karte> helpStapel=new Stapel<Karte>();
        int points=0;
        StapelElement<Karte> helpKarte=new StapelElement<Karte>();
        System.out.println("Wert von Karten in den Behalten Stapel");
        while(!keepStapel.isEmpty())
        {
            helpKarte=keepStapel.pop();
            System.out.println(helpKarte.getValue().getWert());
            points=points+helpKarte.getValue().getWert();
            helpStapel.push(helpKarte);
        }
        System.out.println("Du hast insgesamt "+points+"\n");
        while(!helpStapel.isEmpty())
        {
            keepStapel.push(helpStapel.pop());
        }
        System.out.println("Wert von Karten in den Behalten Stapel");
        while(!throwStapel.isEmpty())
        {
            helpKarte=throwStapel.pop();
            System.out.println(helpKarte.getValue().getWert());
            helpStapel.push(helpKarte);
        }
        while(!helpStapel.isEmpty())
        {
            throwStapel.push(helpStapel.pop());
        }
    }
}
