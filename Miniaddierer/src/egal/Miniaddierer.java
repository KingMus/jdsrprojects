package egal;
import java.awt.*;
import java.awt.event.*;

public class Miniaddierer extends Frame implements ActionListener
{
	double a,b,c;
	TextField tf1,tf2,tf3;
	Label lb1,lb2;
	Button bt;


	public Miniaddierer()
	{
		super("Addition von zwei Zahlen");
		
		FlowLayout ansicht;
		ansicht=new FlowLayout();
		setLayout(ansicht);

		tf1= new TextField(5);
		add(tf1);
			
		lb1=new Label("+");
		add(lb1);
		
		tf2= new TextField(5);
		add(tf2);
				
		lb2=new Label("=");
		add(lb2);
		
		tf3= new TextField(5);
		add(tf3);
		
		bt=new Button("Rechne");
		add(bt);
			
		bt.addActionListener(this);

	}

	public static void main(String[] args)
	{
		Miniaddierer versuch = new Miniaddierer();
		WindowListener wl= new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}};

		versuch.addWindowListener(wl);
		versuch.setLocation(20,100);
		versuch.setSize(400,200);
        versuch.setVisible(true);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bt)
		{
			a=Double.parseDouble(tf1.getText());
			b=Double.parseDouble(tf2.getText());
			c=a+b;
			tf3.setText(String.valueOf(c));

		}}}