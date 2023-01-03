package aufg13002;

import javax.swing.JOptionPane;

public class Verarbeitung
{
  private static final double GradNachBogenmass = Math.PI/(double)180;
  private static boolean ok = true;
  private Verarbeitung() 
  {
    
  }
  protected static void berechneFlaechenInhalt(MainPanel mp)
  {
    ok = true;
    
    String aText;
    aText = mp.getTfSeite_a().getText();
    double a = 0.0;
    a = wandleInDoubleZahl(mp, aText, "die Länge von Seite a");
    pruefeGroesseEingabeMax(mp, a, "die Länge von Seite a");
    pruefeGroesseEingabeMin(mp, a, "die Länge von Seite a");
    
    String bText;
    bText = mp.getTfSeite_a().getText();
    double b = 0.0;
    b = wandleInDoubleZahl(mp, bText, "die Länge von Seite a");
    pruefeGroesseEingabeMax(mp, b, "die Länge von Seite a");
    pruefeGroesseEingabeMin(mp, b, "die Länge von Seite a");
    
    String gammaText;
    gammaText = mp.getTfWinkel().getText();
    double gamma = 0;
    gamma = wandleInDoubleZahl(mp, gammaText, "den winkel gamma" );
    
    double gammaBogenmass;
    gammaBogenmass = GradNachBogenmass * gamma;
    
    //Flächenberechnung
    double f;
    f = 0.5*a*b*Math.sin(gammaBogenmass);
    //Flächeninhalt ist gleich dem Betrag
    f = Math.abs(f);
    //Ausgabe
    f = runde(f,12);
    String aus;
    aus = String.valueOf(f);
    if(ok)
      mp.getTfErgebnis().setText(aus);
    else 
      mp.getTfErgebnis().setText(" ");;
    
  }
  private static double wandleInDoubleZahl(MainPanel mp, String xText, String groessenBez)
  {
    double x = 0.0;
    try 
    {
      x = Double.parseDouble(xText);
    }
    catch(NumberFormatException e)
    {
      JOptionPane.showMessageDialog(
          mp,
          "Fehler - für "+groessenBez+"\n"+
          "wurde keine Gleitpunktzahl eingegeben",
          "Fehlermeldung",
          JOptionPane.ERROR_MESSAGE);
      ok = false;
    }
    return x;
  }
  private static void pruefeGroesseEingabeMax(MainPanel mp, double d, String groessenBez )
  {
    if (d>1000.0d)
    {
      JOptionPane.showMessageDialog(
          mp,
          "Fehler - für "+groessenBez+"\n"+
          "wurde eine Zahl größer als 1000 eingegeben",
          "Fehlermeldung",
          JOptionPane.ERROR_MESSAGE
      );
      ok = false;
      
    }
  }
  private static void pruefeGroesseEingabeMin(MainPanel mp, double d, String groessenBez )
  {
    if (d<0.0d)
    {
      JOptionPane.showMessageDialog(
          mp,
          "Fehler - für "+groessenBez+"\n"+
          "wurde eine Zahl kleine als 0 eingegeben",
          "Fehlermeldung",
          JOptionPane.ERROR_MESSAGE
      );
      ok = false;
      
    }
  }
  private static double runde(double d, int stellenZahl)
  {
    double y;
    y = d * Math.pow(10, stellenZahl);
    y = Math.round(y);
    y = y/Math.pow(10, stellenZahl);
    return y;
  }
  protected static void loescheAusgabe(MainPanel mp)
  {
    mp.getTfErgebnis().setText("");    
  }
  
    
  
  

}
