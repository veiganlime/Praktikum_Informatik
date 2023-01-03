package aufg13001;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainPanel extends JPanel
{
  private static final long serialVersionUID = 700l;
  private JTextField tf_Operand1;
  private JTextField tf_Operand2;
  private JTextField tf_Ergebnisse;
  private JButton but_Plus;
  private JButton but_Minus;
  private JButton but_Div;
  private JButton but_Mult;
  private JLabel lb_Operand1;
  private JLabel lb_Operand2;
  private JLabel lb_Ergebniss;

  /**
   * Create the panel.
   */
  public MainPanel()
  {

    initialize();
  }

  private void initialize()
  {
    setSize(new Dimension(300, 200));
    setPreferredSize(new Dimension(300, 200));
    setLayout(null);
    add(getTf_Operand1());
    add(getTf_Operand2());
    add(getTf_Ergebnisse());
    add(getBut_Plus());
    add(getBut_Minus());
    add(getBut_Div());
    add(getBut_Mult());
    add(getLb_Operand1());
    add(getLb_Operand2());
    add(getLb_Ergebniss());
  }

  private MainPanel getMainPanel()
  {
    return this;
  }

  protected JTextField getTf_Operand1()
  {
    if (tf_Operand1 == null)
    {
      tf_Operand1 = new JTextField();
      tf_Operand1.addKeyListener(new KeyAdapter()
      {
        public void keyPressed(KeyEvent e)
        {
          Verarbeitung.loescheAusgabe(getMainPanel());
        }
      });
      tf_Operand1.setBounds(165, 20, 115, 20);
      tf_Operand1.setColumns(10);
    }
    return tf_Operand1;
  }

  protected JTextField getTf_Operand2()
  {
    if (tf_Operand2 == null)
    {
      tf_Operand2 = new JTextField();
      tf_Operand2.addKeyListener(new KeyAdapter()
      {
        public void keyPressed(KeyEvent e)
        {
          Verarbeitung.loescheAusgabe(getMainPanel());
        }
      });
      tf_Operand2.setBounds(165, 50, 115, 20);
      tf_Operand2.setColumns(10);
    }
    return tf_Operand2;
  }

  protected JTextField getTf_Ergebnisse()
  {
    if (tf_Ergebnisse == null)
    {
      tf_Ergebnisse = new JTextField();
      tf_Ergebnisse.setBackground(Color.WHITE);
      tf_Ergebnisse.setEditable(false);
      tf_Ergebnisse.setBounds(165, 160, 115, 20);
      tf_Ergebnisse.setColumns(10);
    }
    return tf_Ergebnisse;
  }

  protected JButton getBut_Plus()
  {
    if (but_Plus == null)
    {
      but_Plus = new JButton("+");
      but_Plus.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyTyped(KeyEvent arg0)
        {
          Verarbeitung.berechne(getMainPanel(), '+');
        }
      });
      but_Plus.addMouseListener(new MouseAdapter()
      {
        @Override
        public void mouseClicked(MouseEvent arg0)
        {
          Verarbeitung.berechne(getMainPanel(), '+');
        }
      });
      but_Plus.setBounds(20, 100, 45, 45);
    }
    return but_Plus;
  }

  protected JButton getBut_Minus()
  {
    if (but_Minus == null)
    {
      but_Minus = new JButton("-");
      but_Minus.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyTyped(KeyEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '-');
        }
      });
      but_Minus.addMouseListener(new MouseAdapter()
      {
        @Override
        public void mouseClicked(MouseEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '-');
        }
      });
      but_Minus.setBounds(80, 100, 45, 45);
    }
    return but_Minus;
  }

  protected JButton getBut_Div()
  {
    if (but_Div == null)
    {
      but_Div = new JButton("/");
      but_Div.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyTyped(KeyEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '/');
        }
      });
      but_Div.addMouseListener(new MouseAdapter()
      {
        public void mouseClicked(MouseEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '/');
        }
      });
      but_Div.setBounds(235, 100, 45, 45);
    }
    return but_Div;
  }

  protected JButton getBut_Mult()
  {
    if (but_Mult == null)
    {
      but_Mult = new JButton("*");
      but_Mult.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyTyped(KeyEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '*');
        }
      });
      but_Mult.addMouseListener(new MouseAdapter()
      {
        @Override
        public void mouseClicked(MouseEvent e)
        {
          Verarbeitung.berechne(getMainPanel(), '*');
        }
      });
      but_Mult.setBounds(175, 100, 45, 45);
    }
    return but_Mult;
  }

  protected JLabel getLb_Operand1()
  {
    if (lb_Operand1 == null)
    {
      lb_Operand1 = new JLabel("Operand 1:");
      lb_Operand1.setBounds(20, 20, 115, 20);
    }
    return lb_Operand1;
  }

  protected JLabel getLb_Operand2()
  {
    if (lb_Operand2 == null)
    {
      lb_Operand2 = new JLabel("Operand 2:");
      lb_Operand2.setBounds(20, 50, 115, 20);
    }
    return lb_Operand2;
  }

  protected JLabel getLb_Ergebniss()
  {
    if (lb_Ergebniss == null)
    {
      lb_Ergebniss = new JLabel("Ergebniss:");
      lb_Ergebniss.setBounds(20, 160, 69, 20);
    }
    return lb_Ergebniss;
  }
}
