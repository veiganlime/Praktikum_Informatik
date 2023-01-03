package aufg13003;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainPanel extends JPanel
{
  private static final long serialVersionUID = 700L;
  private JLabel lb_UntersuchendeZahl;
  private JLabel lb_Teilbar;
  private JLabel lb_Sechsstellig;
  private JTextField tf_AusgabeSechsst;
  private JTextField tf_AusgabeTeilbar;
  private JTextField tf_Eingabe;
  private JButton but_Untersuchung;

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
        "Teilbarkeit durch 7 - Aufgabe 3 Kap. 13\n"
            + "Nagiev",
        "",
        JOptionPane.INFORMATION_MESSAGE);
    setSize(new Dimension(400, 300));
    setPreferredSize(new Dimension(400, 300));
    setLayout(null);
    add(getLb_UntersuchendeZahl());
    add(getLb_Teilbar());
    add(getLb_Sechsstellig());
    add(getTf_AusgabeSechsst());
    add(getTf_AusgabeTeilbar());
    add(getTf_Eingabe());
    add(getBut_Untersuchung());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }

  protected JLabel getLb_UntersuchendeZahl()
  {
    if (lb_UntersuchendeZahl == null)
    {
      lb_UntersuchendeZahl = new JLabel("untersuchende Zahl:");
      lb_UntersuchendeZahl.setBounds(20, 20, 180, 20);
    }
    return lb_UntersuchendeZahl;
  }

  protected JLabel getLb_Teilbar()
  {
    if (lb_Teilbar == null)
    {
      lb_Teilbar = new JLabel("Zahl ist durch 7 teilbar:");
      lb_Teilbar.setBounds(20, 260, 180, 20);
    }
    return lb_Teilbar;
  }

  protected JLabel getLb_Sechsstellig()
  {
    if (lb_Sechsstellig == null)
    {
      lb_Sechsstellig = new JLabel("Zahl ist sechsstellig:");
      lb_Sechsstellig.setBounds(20, 220, 180, 20);
    }
    return lb_Sechsstellig;
  }

  protected JTextField getTf_AusgabeSechsst()
  {
    if (tf_AusgabeSechsst == null)
    {
      tf_AusgabeSechsst = new JTextField();
      tf_AusgabeSechsst.setBackground(Color.WHITE);
      tf_AusgabeSechsst.setEditable(false);
      tf_AusgabeSechsst.setBounds(215, 220, 25, 25);
      tf_AusgabeSechsst.setColumns(10);
    }
    return tf_AusgabeSechsst;
  }

  protected JTextField getTf_AusgabeTeilbar()
  {
    if (tf_AusgabeTeilbar == null)
    {
      tf_AusgabeTeilbar = new JTextField();
      tf_AusgabeTeilbar.setBackground(Color.WHITE);
      tf_AusgabeTeilbar.setCaretColor(Color.WHITE);
      tf_AusgabeTeilbar.setEditable(false);
      tf_AusgabeTeilbar.setBounds(215, 260, 25, 25);
      tf_AusgabeTeilbar.setColumns(10);
    }
    return tf_AusgabeTeilbar;
  }

  protected JTextField getTf_Eingabe()
  {
    if (tf_Eingabe == null)
    {
      tf_Eingabe = new JTextField();
      tf_Eingabe.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyPressed(KeyEvent arg0)
        {
          Verarbeitung.loescheausgabe(getMainPanel());
        }
      });
      tf_Eingabe.setBounds(215, 20, 146, 26);
      tf_Eingabe.setColumns(10);
    }
    return tf_Eingabe;
  }

  protected JButton getBut_Untersuchung()
  {
    if (but_Untersuchung == null)
    {
      but_Untersuchung = new JButton("Teilbarkeituntersuchungg durchf\u00FCren");
      but_Untersuchung.addMouseListener(new MouseAdapter()
      {
        @Override
        public void mouseClicked(MouseEvent arg0)
        {
          Verarbeitung.untersucheZahl(getMainPanel());
        }
      });
      but_Untersuchung.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyTyped(KeyEvent e)
        {
          Verarbeitung.untersucheZahl(getMainPanel());
        }
      });
      but_Untersuchung.setBounds(20, 114, 360, 29);
    }
    return but_Untersuchung;
  }
}
