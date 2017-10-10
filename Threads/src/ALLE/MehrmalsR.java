package ALLE;

public class MehrmalsR {
	public static void main(String[] args) {
		Runnable r1=new ABCRunnable(), r2=new ABCRunnable();
		Thread t1 = new Thread(r1), t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
class ABCRunnable implements Runnable{
	public void run(){
		for (char b='A';b<='Z';b++){
			System.out.print(b);
			MachMal.eineSekundenichts();
		}
	}
}

