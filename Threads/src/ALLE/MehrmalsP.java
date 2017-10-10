package ALLE;

public class MehrmalsP {
	public static void main(String[] args) {
		ABCPrinter p1 = new ABCPrinter(), p2=new ABCPrinter();
		p1.start();
		p2.start();
	}
}

class ABCPrinter{
	public void run(){
		for (char b='A';b<='Z';b++){
			System.out.print(b);
			MachMal.eineSekundenichts();
		}
	}
	public void start(){
		run();
	}}