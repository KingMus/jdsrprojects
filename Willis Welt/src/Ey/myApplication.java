package Ey;

import java.awt.*;
import java.awt.event.*;



public class myApplication {

  public myApplication() {
    Planet willisWelt = new Planet();
    willisWelt.setSize(1250,950);
    willisWelt.setTitle("Willis Welt");
    willisWelt.setVisible(true);
  }

  public static void main(String[] args) {
    new myApplication();
  }
}
