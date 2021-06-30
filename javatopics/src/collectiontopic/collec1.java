package collectiontopic;

import java.util.*;
import java.lang.Integer;

public class collec1 {
   public static void main(String args[]) {
	  // Collection<Integer> a=new ArrayList<>();
	   List<Integer> a=new ArrayList<>();
	  
	   a.add(0,45);
	   a.add(1,23);
	   a.add(2,67);
	   System.out.println(a);
	   System.out.println("***********");
	   Iterator<Integer> it=a.iterator();
	   System.out.println(it.next());
	   System.out.println(it.next());
	   System.out.println("***********");
	   for(int i=0;i<a.size();i++) {
		   System.out.println(a.get(i));
	   }
   }
}
