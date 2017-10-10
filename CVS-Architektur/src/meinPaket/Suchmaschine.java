package meinPaket;

public class Suchmaschine {
//Attribute der Klasse
    private Automat maiersucher = new Automat();

    private Speicher einSpeicher = new Speicher();

//Methoden der Klasse
    /** Der Text wird gescannt, jedes Zeichen wird an den Automaten uebergeben.
     * @pram text in Diesem Text wird gesucht.
     * @return Anzahl der gefundenen Stellen.
     */
    public int suchen(String text) {
    int zaehler=0;
    for(int i=0; i< text.length();i++) {
      char ch = text.charAt(i);
      if(maiersucher.ereignis(ch) == 1)
        zaehler++;
      }
    return zaehler;
    }

    /** Der Text aus der Datei mit dem Namen dateiname wird geladen und als
    * String zurueckgegeben.
    * @param dateiname Name der Datei, die geladen werden soll.
    * @return Inhalt der Datei als String.
    */
    public String laden(String dateiname) {
      return einSpeicher.lade(dateiname);
    }
}
