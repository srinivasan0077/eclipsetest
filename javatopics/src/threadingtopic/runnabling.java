package threadingtopic;
import java.lang.*;
//using interface Runnable

class Cpack implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HIII");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
class Dpack implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("HELLO");
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}
public class runnabling {
	public static void main(String args[])throws Exception {
   	  Runnable a=new Cpack();
   	  Runnable b=new Dpack();
   	  Thread t1=new Thread(a);
   	  Thread t2=new Thread(b);
   	  
   	  t1.start();
      Thread.sleep(1000);
      t2.start();
      t1.join();
      t2.join();
      System.out.println("Success");
    }
}
