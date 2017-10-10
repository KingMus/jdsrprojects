import java.awt.*;


import java.awt.event.*;

public class MyFrame extends Frame {

  protected Schloss einSchloss=new Schloss();

  protected Label label1 = new Label();
  protected Label ausgabe = new Label();
  protected TextField eingabe = new TextField();
  protected GridLayout gridLayout = new GridLayout();

  /** Konstruktor, wird beim Erzeugen der Klasse aufgerufen.*/
  public MyFrame() {
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

    this.setSize(new Dimension(400, 66));
    this.setTitle("Zahlenschloss");
    ausgabe.setFont(new java.awt.Font("SansSerif", 1, 20));
    ausgabe.setText(" zu");

    label1.setFont(new java.awt.Font("Dialog", 0, 18));
    label1.setText("nächste Zahl:");
    this.setLayout(gridLayout);

    eingabe.addKeyListener(new java.awt.event.KeyAdapter() {

      public void keyReleased(KeyEvent e) {
        eingabe_keyReleased(e);
      }
      public void keyPressed(KeyEvent e) {
        eingabe_keyPressed(e);
      }
    });
    add(label1, null);
    add(eingabe, null);
    add(ausgabe, null);

  }
  /** Die Methode wird aufgerufen, wenn der oben rechts x angeklickt wurde.
  * Die Verbindung des Mausklicks mit der Methode, wurde im Konstruktor MyFrame()
  * hergestellt.
  * @see <a HREF="MyFrame.html#MyFrame()">MyFrame()</a>
  * @param e Das Ereigniss, welches von der Maus ausgelöst wurde.
  */
  public void jMenuFileExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }

  /**Wird beim Verlassen des Programms aufgerufen*/
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      jMenuFileExit_actionPerformed(null);
    }
  }

  /** Diese Metode verarbeitet die Zeicheneingabe auf der Oberflaeche. 
   * Aufgerufen, wird sie nach loslassen des Zeichens auf der Tastatur.
   * Sie liest den Text ein, uebergibt ihn an den Automaten  und gibt 
   * das Ergebnis des Automaten auf der Oberflaeche aus
   */
  public void eingabe_keyReleased(KeyEvent e) {
      
    String ein=eingabe.getText();

    char ch[]={' '};
    //Das Zeichen in ein Array of char umwandeln
    ein.getChars(0,1,ch,0);

    if(einSchloss.ereignis(ch[0])==1)
      ausgabe.setText("offen");
    else
      ausgabe.setText("zu");
  }
/** Diese Methode wird beim Druecken eines Zeichens auf der Tastatur aufgerufen. 
 *  Sie loescht das letzte eingegebene Zeichen */
  public void eingabe_keyPressed(KeyEvent e) {
        eingabe.setText("");
  }
}