package threadingtopic;
import java.lang.Thread;



class Apack extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HIII");
			try {Thread.sleep(2000);}catch(Exception e) {}
		}
	}
}
class Bpack extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HELLO");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class threading {
     public static void main(String args[]) {
    	 Thread a=new Apack();
    	 Thread b=new Bpack();
    	 a.start();
    	 try {Thread.sleep(1000);}catch(Exception e) {}
    	 b.start();
    	 
     }
}
