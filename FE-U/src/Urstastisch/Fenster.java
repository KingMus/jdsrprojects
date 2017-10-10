package Urstastisch;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fenster extends JFrame {
	
	

        public Fenster(int fensternummer,Spieler h,int gegnernummer,int hintergrund,int geldmultiplikator,int expmultiplikator){
        	
        	if(fensternummer==1){
        		JFrame Spiel=new JFrame();
        		
        		Spiel.setSize(486,410);
        		Spiel.setLocationRelativeTo(null);
        		Spiel.setResizable(false);
        		Spiel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
				Spiel.add(new Spielfeld());
				Spiel.setVisible(true);}
		
        	if(fensternummer==2){
        		JFrame Kampf=new JFrame();
			
        		Kampf.setSize(600,290);
        		Kampf.setLocationRelativeTo(null);
        		Kampf.setResizable(false);
        		Kampf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
        		Kampf.add(new Kampfbild(gegnernummer,hintergrund,geldmultiplikator,expmultiplikator,h));
        		Kampf.setVisible(true);}
        	
        	
			}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Fenster Spielfeld = new Fenster(1,null,0,0,0,0);
	}
	
}
