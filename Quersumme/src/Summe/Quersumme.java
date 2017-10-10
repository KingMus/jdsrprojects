package Summe;

import javax.swing.JOptionPane;

public class Quersumme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text;
int n,a,i;
text=JOptionPane.showInputDialog("Wie oft nach Zahl fragen?");
a=Integer.parseInt(text);
for(i=0;i<a;i++){
do
{
	text=JOptionPane.showInputDialog("Ihre dreistellige positive Zahl, bitte!");
	n=Integer.parseInt(text);

}while ((n<100)||(n>999));

System.out.println("Die Quersumme von "+n+" ist "+quersumme(ziffern(n)));
}
	}
public static int[] ziffern(int n){
	int[] res;
	res=new int[3];
	res[0]=n%10;
	n=n/10;
	res[1]=n%10;
	n=n/10;
	res[2]=n%10;
	
	return res;
}	
	       public static int quersumme(int[] z) {
	    	int i,s;
	    	s=0;
	    	for(i=0;i<z.length;i++){
	    		s=z[i]+s;
	    	}
	    		return s;
	    	   
	    	   
	       
	
	       }
}
