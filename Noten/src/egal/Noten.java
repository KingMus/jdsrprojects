package egal;
	import java.awt.*;
import java.awt.event.*;

public class Noten extends Frame implements ActionListener{
	
	TextField t1;
	Button b1,b2,b3,b4;
	
	public Noten() {
		
		super("Drueck den Knopf 1");
		
		FlowLayout ansicht;
		ansicht=new FlowLayout();
		setLayout(ansicht);
		
		b1=new Button("1");
		add(b1);
		b2=new Button("2");
		add(b2);
		b3=new Button("3");
		add(b3);
		b4=new Button("4");
		add(b4);
		t1=new TextField(10);
		add(t1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
			
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Noten n1 = new Noten();
		WindowListener wl= new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}};
		n1.addWindowListener(wl);
		n1.setLocation(20,100);
		n1.setSize(400,200);
		n1.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText("sehr gut");
		}
		
		if(e.getSource()==b2)
		{
			t1.setText("gut");
		}
		
		if(e.getSource()==b3)
		{
			t1.setText("befriedigend");
		}
		
		if(e.getSource()==b4)
		{
			t1.setText("unbefriedigend");
		}
	}
}
