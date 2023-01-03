package aufg13002;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPanel extends JPanel
{
  private static final long serialVersionUID = 700L;
  private JLabel lbSeite_a;
  private JLabel lbSeite_b;
  private JLabel lbWinkel;
  private JLabel lbFlcheninhalt;
  private JTextField tfSeite_a;
  private JTextField tfSeite_b;
  private JTextField tfWinkel;
  private JTextField tfErgebnis;
  private JButton butBerechne;

  /**
   * Create the panel.
   */
  public MainPanel()
  {

    initialize();
  }

  private void initialize()
  {

    JOptionPane.showMessageDialog(
        this.getMainPanel(),
        "Dreiecksberechnung - Aufgabe 2 Kapitel 13\n"
            + " 2022 Nagiev",
        "",
        JOptionPane.INFORMATION_MESSAGE);

    setSize(new Dimension(500, 300));
    setPreferredSize(new Dimension(500, 300));
    setLayout(null);
    add(getLbSeite_a());
    add(getLbSeite_b());
    add(getLbWinkel());
    add(getLbFlcheninhalt());
    add(getTfSeite_a());
    add(getTfSeite_b());
    add(getTfWinkel());
    add(getTfErgebnis());
    add(getButBerechne());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }

  protected JLabel getLbSeite_a()
  {
    if (lbSeite_a == null)
    {
      lbSeite_a = new JLabel("L\u00E4nge der Seite a in FE:");
      lbSeite_a.setBounds(20, 20, 250, 20);
    }
    return lbSeite_a;
  }

  protected JLabel getLbSeite_b()
  {
    if (lbSeite_b == null)
    {
      lbSeite_b = new JLabel("L\u00E4nge der Seite b in FE:");
      lbSeite_b.setBounds(20, 60, 250, 20);
    }
    return lbSeite_b;
  }

  protected JLabel getLbWinkel()
  {
    if (lbWinkel == null)
    {
      lbWinkel = new JLabel("Gr\u00F6\u00DFe des Winkels in Gradma\u00DF:");
      lbWinkel.setBounds(20, 100, 250, 20);
    }
    return lbWinkel;
  }

  protected JLabel getLbFlcheninhalt()
  {
    if (lbFlcheninhalt == null)
    {
      lbFlcheninhalt = new JLabel("Fl\u00E4cheninhalt des Dreiecks in FE:");
      lbFlcheninhalt.setBounds(20, 260, 250, 20);
    }
    return lbFlcheninhalt;
  }

  protected JTextField getTfSeite_a()
  {
    if (tfSeite_a == null)
    {
      tfSeite_a = new JTextField();
      tfSeite_a.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyPressed(KeyEvent arg0)
        {
          Verarbeitung.loescheAusgabe(getMainPanel());
        }
      });
      tfSeite_a.setBounds(290, 20, 190, 20);
      tfSeite_a.setColumns(10);
    }
    return tfSeite_a;
  }

  protected JTextField getTfSeite_b()
  {
    if (tfSeite_b == null)
    {
      tfSeite_b = new JTextField();
      tfSeite_b.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyPressed(KeyEvent e)
        {
          Verarbeitung.loescheAusgabe(getMainPanel());
        }
      });
      tfSeite_b.setBounds(290, 60, 190, 20);
      tfSeite_b.setColumns(10);
    }
    return tfSeite_b;
  }

  protected JTextField getTfWinkel()
  {
    if (tfWinkel == null)
    {
      tfWinkel = new JTextField();
      tfWinkel.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyPressed(KeyEvent e)
        {
          Verarbeitung.loescheAusgabe(getMainPanel());
        }
      });
      tfWinkel.setBounds(290, 100, 190, 20);
      tfWinkel.setColumns(10);
    }
    return tfWinkel;
  }

  protected JTextField getTfErgebnis()
  {
    if (tfErgebnis == null)
    {
      tfErgebnis = new JTextField();

      tfErgebnis.setBackground(Color.WHITE);
      tfErgebnis.setEditable(false);
      tfErgebnis.setBounds(290, 260, 190, 20);
      tfErgebnis.setColumns(10);
    }
    return tfErgebnis;
  }

  protected JButton getButBerechne()
  {
    if (butBerechne == null)
    {
      butBerechne = new JButton("Fl\u00E4cheninhalt des Dreiecks berechnen");
      butBerechne.addMouseListener(new MouseAdapter()
      {
        @Override
        public void mouseClicked(MouseEvent arg0)
        {
          Verarbeitung.berechneFlaechenInhalt(getMainPanel());
        }
      });
      butBerechne.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent arg0)
        {
          Verarbeitung.berechneFlaechenInhalt(getMainPanel());
        }
      });
      butBerechne.setBounds(20, 175, 460, 50);
    }
    return butBerechne;
  }
}
