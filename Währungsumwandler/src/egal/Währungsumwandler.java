package egal;
import java.awt.*;
import java.awt.event.*;

public class Währungsumwandler extends Frame implements ActionListener{

	double a,b;
	TextField t1,t2;
	Button b1,b2,b3;
	Label l1;
	
	public Währungsumwandler(){
		
		super("Euro in Dollar - Dollar in Euro");
		
		FlowLayout ansicht;
		ansicht=new FlowLayout();
		setLayout(ansicht);
		
		b1= new Button("Neue Eingabe");
		add(b1);
		
		t1= new TextField(5);
		add(t1);
		
		b2= new Button("€");
		add(b2);
		
		l1= new Label("entspricht");
		add(l1);
		
		t2= new TextField(5);
		add(t2);
		
		b3= new Button("$");
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Währungsumwandler w1= new Währungsumwandler();
		WindowListener wl= new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}};
		w1.addWindowListener(wl);
		w1.setLocation(20,100);
		w1.setSize(800,200);
		w1.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e){
		
		if(e.getSource()==b1){
			t1.setText("");
			t2.setText("");
		}
		if(e.getSource()==b2){
			a=Double.parseDouble(t1.getText());
			b=a*1.3294;
			t2.setText(String.valueOf(b));
		}
		if(e.getSource()==b3){
			a=Double.parseDouble(t2.getText());
			b=a/1.3294;
			t1.setText(String.valueOf(b));
		}
	}
}
