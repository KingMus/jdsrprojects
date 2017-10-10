#include <at89c5131.h> //Initialisierung
sfr at P2 Ausgabe;
sbit at P3_2 UP;
unsigned int i; //Variablendeklaration
void main (void) //----------- Hauptprogramm ---------------------------------
{
Ausgabe = 0;
while(1)
{
if (!UP) //Wenn Taster P3.2 gedrückt
{
Ausgabe++; //P2 erhöhen bis 10 erreicht
if (Ausgabe == 10) 
{
Ausgabe = 0; // Wenn 10 erreicht auf 0 setzen
}
}
for (i=0x8fff;i!=0;i--); //Zeitschleife
} // Ende while(1)
} // Ende main 

/*
Aufgabe 1.1

Variable "UP" entspricht P3.2
Variable "Ausgabe" entspricht P2

Sobald P3.2 gedrückt ist, soll Ausgabe erhöht werden und somit auch der Wert der an P2 anliegt.
Erreicht er 10 soll er auf 0 gesetzt werden
Die for-Schleife dient als Zeitverzögerungsprogramm

Aufgabe 1.4

Man muss "i" verringern um die Zeitschleife kürzer zu machen

Aufgabe 1.5

Siehe Programm "Programm_Aufgabe_1_V"

Aufgabe 1.6

s ist gleich b oder 15

Aufgabe 1.7

Wenn "taster"=0 und "a"=3 soll "b" auf sieben gesetzt werden

Aufgabe 1.8

Verschiebe c um zwei nach rechts

Aufgabe 1.9

Solange b und 0F gleich 0 sind soll a hochgezählt werden (?)

*/