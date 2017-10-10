package KoboldeundWelt;

import java.awt.*;
import java.awt.event.*;

public class myApplication {

	public myApplication() {
		Planet willisWelt = new Planet();
		willisWelt.setSize(800,570);
		willisWelt.setTitle("Willis Welt");
		willisWelt.setVisible(true);
	}
	
	public static void main(String[] args) {
		new myApplication();
	}
	}
	

