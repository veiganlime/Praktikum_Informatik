package aufg13001;

import de.eikelberg.guitools.ESinglePanelFrame;

public class Programmstart
{

  public static void main(String[] args)
  {
// Startmeldung
    System.out.println(
        "\n  Aufgabe 1 Kapitel 13(Taschenrechner)"
        + "Nagiev 2022");
//Eine weitere Startmeldung erflogt mit einem JOptionPane-Meldungsfenster,
// geöffnet aus der Methode initialize() des Panels MainPanel
    
//Fensterbeschriftung
    String titel = "Taschenrechner - Aufg_1 Kap_13";
// Panel instanzieren
    MainPanel mp = new MainPanel();
    
//Fenster instanziieren und dabei Referenz auf das Panel sowie 
//die Fensterbeschriftung an den Konstruktor übergeben
    new ESinglePanelFrame(mp,titel);
  }

}
