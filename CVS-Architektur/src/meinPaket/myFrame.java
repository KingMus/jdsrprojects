package meinPaket;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class myFrame extends JFrame {
  JPanel contentPane;
  JLabel statusBar = new JLabel();
  JTextArea suchtext = new JTextArea();
  JButton suchen = new JButton();

  BorderLayout borderLayout1 = new BorderLayout();
  Panel panel1 = new Panel();
  TextField dateiname = new TextField();
  Button laden = new Button();
  BorderLayout borderLayout2 = new BorderLayout();


  private Suchmaschine eineSuchmaschine=new Suchmaschine();

  /** Konstruktor, wird beim Erzeugen der Klasse aufgerufen.*/
  public myFrame() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
/**Initialisierung der Komponenten*/
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(borderLayout1);
    this.setSize(new Dimension(700, 475));
    this.setTitle("Maier_Suchmaschine");
    statusBar.setText(" ");
    suchtext.setText("Mayer - Maier - Meier - Meyer");
    suchtext.setToolTipText("");
    suchen.setText("suchen");
    suchen.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        suchen_actionPerformed(e);
      }
    });
    dateiname.setText("d:\\temp\\maier.txt");
    laden.setLabel("Datei laden");
    laden.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        laden_actionPerformed(e);
      }
    });
    panel1.setLayout(borderLayout2);
    contentPane.add(statusBar, BorderLayout.SOUTH);
    contentPane.add(suchtext, BorderLayout.CENTER);
    contentPane.add(panel1, BorderLayout.NORTH);
    panel1.add(dateiname, BorderLayout.CENTER);
    panel1.add(laden, BorderLayout.EAST);
    panel1.add(suchen, BorderLayout.SOUTH);
  }
  /**Wird beim Verlassen des Programms aufgerufen*/
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      System.exit(0);
    }
  }
  /** Die Methode wird aufgerufen, wenn der suchen-Button gedrueckt wurde.
  * Die Verbindung des Mausklicks mit der Methode, wurde im Konstruktor myFrame()
  * hergestellt 
  * @param e Das Ereigniss, welches von der Maus ausgelöst wurde.
  */
  public void suchen_actionPerformed(ActionEvent e) {
    int anzahl = eineSuchmaschine.suchen(suchtext.getText());
    statusBar.setText("gefunden: "+Integer.toString(anzahl));
  }
  
  /** Die Methode wird aufgerufen, wenn der laden-Button gedrueckt wurde.
  * Die Verbindung des Mausklicks mit der Methode, wurde im Konstruktor myFrame()
  * hergestellt 
  * @param e Das Ereigniss, welches von der Maus ausgelöst wurde.
  */
  public void laden_actionPerformed(ActionEvent e) {
    String datei = dateiname.getText();
    String text = eineSuchmaschine.laden(datei);
    if(text == "")
      dateiname.setText(datei+" nicht gefunden");
    else
      suchtext.setText(text);
  }
}
