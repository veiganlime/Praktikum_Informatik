package aufg13001;

import javax.swing.JOptionPane;

public class Verarbeitung
{
  private Verarbeitung(){}
  
  public static void berechne (MainPanel mp, char rechenZeichen)
  {
    //Vorheriges Rechnenergebnis löschen
    mp.getTf_Ergebnisse().setText(" ");
    //Einlesen
    String ein1, ein2;
    ein1 = mp.getTf_Operand1().getText();
    ein2 = mp.getTf_Operand2().getText();
    //Umwandeln
    double op1, op2;
    op1 = konvertiere(mp,ein1);
    op2 = konvertiere(mp,ein2);
    //Berechnung
    if (!String.valueOf(op1).equals("NaN")&
        !String.valueOf(op2).equals("NaN")
        )
    {
      double result = 0.0d;
      switch (rechenZeichen)
      {
      case '+':
        result = op1 + op2;
        break;
      case '-':
        result = op1 - op2;
        break;
      case '/':
        result = op1 / op2;
        break;
      case '*':
        result = op1 * op2;
        break;
      }
      //Ausgabe
      String aus;
      aus = String.valueOf(result);
      //Infinity und NaN abfragen
      if (aus.equals("Infinity "))
        JOptionPane.showMessageDialog(
            mp,
            "Fehler: Teilen durch Null ist nicht erlaubt!",
            "Fehlermeldung",
            JOptionPane.ERROR_MESSAGE
         );
      else if (aus.equals("NaN"))
        JOptionPane.showMessageDialog(
            mp,
            "Fehler: Teilen Null durch Null ist nicht erlaubt!",
            "Fehlermeldung",
            JOptionPane.ERROR_MESSAGE
         );
      else 
        mp.getTf_Ergebnisse().setText(aus);
      
    }
  }
  public static void loescheAusgabe(MainPanel mp)
  {
    mp.getTf_Ergebnisse().setText(" ");
  }
  private static double konvertiere(MainPanel mp, String txt)
  {
    double d;
    try
    {
      d = Double.parseDouble(txt);
    }
    catch (NumberFormatException e)
    {
      JOptionPane.showMessageDialog(mp,"Fehler: nicht numerischer Operand eingegeben!", "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
      d = 0.0d/0.0d; //NaN zurückgeben
    }
    return d;
  }

}
