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
if (UP) //Wenn Taster P3.2 nicht gedrückt
{
Ausgabe--; //P2 erhöhen bis 0 erreicht
if (Ausgabe == 0) 
{
Ausgabe = 10; // Wenn 0 erreicht auf 10 setzen
}
}
for (i=0x8fff;i!=0;i--); //Zeitschleife
} // Ende while(1)
} // Ende main 