//LCD.h 

extern void initlcd (void);													// Initialisierung
extern void loeschenlcd (void);	                                 // LCD löschen
extern void textlcd (unsigned char *text, unsigned char zeile);	// Textausgabe in Zeile 1 bis 4
extern void definierelcdsymbol (unsigned char pixelprozeile [8],unsigned char adr);
														                       // Definition von max 7 eigenen Zeichen Adr 1 bis 7
extern void LCDbefehl (unsigned char befehl);		              // Ausgabe von Befehlen laut Datenblatt
extern void charlcd (unsigned char zeichen);		                 // Ausgabe eines Zeichens an die aktuelle Cursorposition
extern void cursorpos (unsigned char position);	                 // Setzen der Cursorposition
