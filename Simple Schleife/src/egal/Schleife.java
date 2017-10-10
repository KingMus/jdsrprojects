package egal;
import javax.swing.*;
public class Schleife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s;
int i,n;
double x,produkt,fvonxundn;

s=JOptionPane.showInputDialog("Geben sie x ein");
x=Double.parseDouble(s);
s=JOptionPane.showInputDialog("Geben sie n ein");
n=Integer.parseInt(s);

produkt=1.0;
for (i=1;i<=n;i++)
	
{produkt=produkt*x;}

fvonxundn=produkt;
System.out.println(x+" hoch "+ n+" ist " + fvonxundn);

	}

}
