package meinPaket;
import java.io.*;


public class Speicher {
//Attribute der Klasse
//Methoden der Klasse
    /** Die Datei mit dem Namen dateinamen wird geladen und als String
    * zurueckgegeben
    * @param dateiname Diese Datei wird geladen
    * @return Inhalt der Datei mit dateinamen
    */
    public String lade(String dateiname) {
      String text="", dummy;
      try {
        RandomAccessFile in = new RandomAccessFile(dateiname, "r");
        dummy = in.readLine();
        while(dummy != null) {
          text=text+dummy+"\n";
          dummy=in.readLine();
          }
        in.close();
        }
      catch (FileNotFoundException e) {
        //Bei einem Fehler, z.B. Datei nicht vorhanden
        text="";
        }
      catch (IOException e) {
        text="";
      }
      return text;
   }
}


