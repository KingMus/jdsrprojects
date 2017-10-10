package Laser;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Mauslauscher {


	public int Mausklicken(MouseEvent e,int BM){
		
		
		if(BM==3 && e.getX()>60 && e.getX()<180 && e.getY()>430 && e.getY()<470){
			return BM=0;
		}//Mouslistener-Aktionen im Logbuch
		
		
		
		if(BM==4 && e.getX()>95 && e.getX()<185 && e.getY()>335 && e.getY()<385){
			return BM=0;
		}//Mouslistener-Aktionen im Optionsmenü
			
		
		if(BM==0 && e.getX()>25 && e.getX()<205 && e.getY()>410 && e.getY()<480){
			return BM=90;
		}
		if(BM==0 && e.getX()>300 && e.getX()<450 && e.getY()>410 && e.getY()<440){
			return BM=3;
		}
		if(BM==0 && e.getX()>300 && e.getX()<450 && e.getY()>453 && e.getY()<483){
			return BM=4;
		}//Mouslistener-Aktionen im Hauptmenü
		
		return BM;
		
	}
	
	
	
}
