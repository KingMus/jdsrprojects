#include <at89c5131.h> //Initialisierung
#include "lcd.c"
#include "stdio.h"

unsigned int anzahl=19;

void main (void)
{

while(1){
sprinf(buf,"TGI-J2, %2d",anzahl)
initlcd();
textlcd(buf,1);
}

} // Ende main 
