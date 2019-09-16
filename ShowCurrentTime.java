

import java.util.Scanner;


public class ShowCurrentTime
   {
      public static void main(String[] args)
      {
   	 long nMillis;                       // We need long for accuracy !!!    
   	 long n, hours, minutes, seconds;
    
   	 nMillis = System.currentTimeMillis();
    
   	 n = nMillis/1000;        // Total # Second;                
    
   	 seconds = n % 60;        // Seconds
   	 n = n / 60;              // Total # minutes;        
   	 minutes = n % 60;        // Minutes
   	 n = n / 60;              // Total # hours;
   	 hours = n % 24;	  // Hours
    
    if(hours < 10){
        System.out.print("0" + hours);
        System.out.print(":");
     }
     
     else{
        
   	 System.out.print(hours);
   	 System.out.print(":");
        
    if(minutes < 10){
        System.out.print("0" + minutes);
        System.out.print(":");
     }
     
     else{
         
     System.out.print(minutes);
   	 System.out.print(":");
     }
        
    if(seconds < 10){
        System.out.print("0" + seconds);
        System.out.println(" GMT");
     }
     
     else{
   	
   	 System.out.print(seconds);
   	 System.out.println(" GMT");
   	 
      }
     }
    }
   }
   
