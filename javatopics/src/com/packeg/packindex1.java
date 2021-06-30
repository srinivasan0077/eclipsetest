package com.packeg;

import java.util.*;

public class packindex1 {
      public int i;
      public void print() {
    	  System.out.println(i);
      }
      public static void main(String args[]) {
   	   
   	          try {
   	        	  int i=8/0;
   	          }
   	          catch(Exception e) {
   	        	  System.out.println(e);
   	          }
   	          System.out.println("Hello");
   	          int i;
   	          Scanner a=new Scanner(System.in);
   	          i=a.nextInt();
   	          System.out.println(i);
   	          a.close();
      }
}
