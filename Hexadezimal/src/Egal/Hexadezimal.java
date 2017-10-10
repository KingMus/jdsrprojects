package Egal;

import javax.swing.*;
public class Hexadezimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
String s;

s=JOptionPane.showInputDialog("Geben sie eine Zahl zwischen 0 und 20 ein");
a=Integer.parseInt(s);

switch (a) {
case 0: System.out.println("Die Hexadezimalzahl lautet: 0");
break;
case 1: System.out.println("Die Hexadezimalzahl lautet: 1");
break;
case 2: System.out.println("Die Hexadezimalzahl lautet: 2");
break;
case 3: System.out.println("Die Hexadezimalzahl lautet: 3");
break;
case 4: System.out.println("Die Hexadezimalzahl lautet: 4");
break;
case 5: System.out.println("Die Hexadezimalzahl lautet: 5");
break;
case 6: System.out.println("Die Hexadezimalzahl lautet: 6");
break;
case 7: System.out.println("Die Hexadezimalzahl lautet: 7");
break;
case 8: System.out.println("Die Hexadezimalzahl lautet: 8");
break;
case 9: System.out.println("Die Hexadezimalzahl lautet: 9");
break;
case 10: System.out.println("Die Hexadezimalzahl lautet: A");
break;
case 11: System.out.println("Die Hexadezimalzahl lautet: B");
break;
case 12: System.out.println("Die Hexadezimalzahl lautet: C");
break;
case 13: System.out.println("Die Hexadezimalzahl lautet: D");
break;
case 14: System.out.println("Die Hexadezimalzahl lautet: E");
break;
case 15: System.out.println("Die Hexadezimalzahl lautet: F");
break;
case 16: System.out.println("Die Hexadezimalzahl lautet: 10");
break;
case 17: System.out.println("Die Hexadezimalzahl lautet: 11");
break;
case 18: System.out.println("Die Hexadezimalzahl lautet: 12");
break;
case 19: System.out.println("Die Hexadezimalzahl lautet: 13");
break;
case 20: System.out.println("Die Hexadezimalzahl lautet: 14");
break;
default: System.out.println("Sie haben keine Zahl zwischen 1 und 15 angegeben!");
}
	}

}
