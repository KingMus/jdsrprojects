package Ey2;
import java.awt.*;
import java.awt.event.*;



public class myApplication {

  
  public myApplication() {
   
    Planet willisWelt = new Planet();
    
    willisWelt.setSize(800,550);
    willisWelt.setTitle("Willis Welt");
    willisWelt.setVisible(true);
  }

   
  public static void main(String[] args) {
    new myApplication();
  }
}