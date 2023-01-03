package aufg13003;

import javax.swing.JOptionPane;
import java.awt.Color;


public class Verarbeitung
{
  private static boolean ok = true;
  
  private Verarbeitung() { }
  
  public static void untersucheZahl(MainPanel mp)
  {
// Eingabe
    String ein;
    ein = mp.getTf_Eingabe().getText();
    long zahl = 0;
    try
    {
      zahl = Long.parseLong(ein);
      ok = true;
    }
    catch (NumberFormatException e)
    {
      JOptionPane.showMessageDialog(
          mp,
          "Fehler - es wurde keine ganze Zahl eingegeben\n"+
          "oder die eingegebene Zahl ist zu groß!",
          "Fehlermeldung",
          JOptionPane.ERROR_MESSAGE
      );
      ok = false;
    }
    
// Verarbeitung  
    boolean sechsstellig = true;
    boolean teilbar7 = true;
    boolean gut = true;
    if (ok)
    {  
// Stellenzahl der Zahl untersuchen
      sechsstellig = ((zahl >= 100000) & (zahl < 1000000));

// Teilbarkeit untersuchen
      long rest7;
      rest7 = zahl % 7;
      teilbar7 = (rest7 == 0);

// Gesamtergebnis
      gut = sechsstellig & teilbar7;
    }
    
// Ausgabe
    if (ok)
    {
      if (sechsstellig)
      {
        mp.getTf_AusgabeSechsst().setBackground(Color.GREEN);
      }
      else
      {
        mp.getTf_AusgabeSechsst().setBackground(Color.RED);
      }
      if (teilbar7)
      {
        mp.getTf_AusgabeTeilbar().setBackground(Color.GREEN);
      }
      else
      {
        mp.getTf_AusgabeTeilbar().setBackground(Color.RED);
      }
      if (gut)
        JOptionPane.showMessageDialog(
            mp,
            "Die eingegeben Zahl ist sechsstellig\n"+
            "und durch 7 teilbar!",
            "Erfolgsmeldung",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    else
      loescheausgabe(mp);
  }
  
  public static void loescheausgabe(MainPanel mp)
  {
    mp.getTf_AusgabeSechsst().setText("");
    mp.getTf_AusgabeSechsst().setBackground(Color.WHITE);
    mp.getTf_AusgabeTeilbar().setText("");
    mp.getTf_AusgabeTeilbar().setBackground(Color.WHITE);
  }

}
