package aufg13002;

import de.eikelberg.guitools.ESinglePanelFrame;

public class Programmstart
{

  public static void main(String[] args)
  {
    String titel = "Dreiecksberechnung - Aufgabe 2 kap. 13";
    
    MainPanel mp = new MainPanel();
    
    new ESinglePanelFrame(mp, titel);

  }

}
