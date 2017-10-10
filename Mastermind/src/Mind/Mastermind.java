package Mind;
import javax.swing.*;
public class Mastermind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahl1;
		int[] zahl2;
		int i = 1;
		boolean erraten;
		erraten=false;
		System.out.println("MASTERMIND");
		System.out.println();
		zahl1=findeZahl();
		do{
			System.out.println("Noch "+(11-i)+" Versuche!");
		zahl2=liesZahl(i);
			if(treffer(zahl1,zahl2)==true){
				erraten=true;}
			System.out.println(auswerten(zahl1,zahl2));
			System.out.println();
			i=i+1;
	        }
			while((i<11) && (!(erraten)));
				
			if(erraten==false){System.out.println("Sie haben leider verloren!");}
			else{System.out.println("Sie haben gewonnen!");}
					
	}
	
	  public static String zahl(int[] z) {
		    String res;
		    int i;
		    res=""; 
		    for (i=0;i<4;i++) 
		      res=z[i]+res;
		    return res;
		  }

		 
		  public static int[] ziffern(int z) {
		    int[] res;
		    int i;
		    
		    res=new int[4];
		    for (i=0;i<4;i++) {
		      res[i]=z%10; 
		      z=z/10; 
		    }
		    return res;
		  }

		  public static int[] bereiteAuf(int z) {
			  int[] res;
			  int i,j;
		    if (z<0 || z>9999)
		      return null;
		    res=ziffern(z);
		    for ( i=0;i<4;i++)
		      for (j=i+1;j<4;j++)
		        if (res[i]==res[j])
		          return null;
		    return res;
		  }

		  public static int[] findeZahl() {
		    int[] res;
		    res=null; 
		    int zahl;
		    while(res==null) {
		      zahl=(int)(9999*Math.random());
		      res=bereiteAuf(zahl);
		    }
		    return res;
		  }
		  
		  public static boolean treffer(int[] original,int[] versuch) {
		      int i;
			  for (i=0;i<4;i++)
		      if (original[i]!=versuch[i])
		        return false;
		    return true;
		  }

		  public static String auswerten(int[] original,int[] versuch) {
		    int direkt, indirekt,i,j;   
		    direkt=0;    
		    indirekt=0;  
		    for (i=0;i<4;i++)
		      for (j=0;j<4;j++)
		        if (original[i]==versuch[j]) {
		          if (i==j)
		            direkt++;
		          else
		            indirekt++;
		        }
		    return
		      "Direkte Treffer: "+direkt+"     "+
		      "Indirekte Treffer: "+indirekt;
		  }

		  public static int[] liesZahl(int versuch) {
		    String text;
		    int n;
		    int[] res;
		    do
		    {
		    text=JOptionPane.showInputDialog("Versuch Nr. "+versuch+": ");
		    n=Integer.parseInt(text);
		    res=bereiteAuf(n);
		    if (res==null)
		    	System.out.println("UNGUELTIGE ZAHL!");
		    }
		    while (res==null); 
		    
		    return res;
		  }

		 
}
