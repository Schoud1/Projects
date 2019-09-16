


public class HW10 {
   
      
     public int InnerProd(int[]i, int[]j) {
      
     
     if(i.length != j.length) { // if the conditions are met, then it will 
                                // print the statement and return -1.


     System.out.println("ERROR: VECTORS HAVE DIFFERENT LENGTHS"); // print statement


     return -1; // value will be returned


      }

      
      int num = 0;


      for(int a = 0; a < i.length; a++){ // if the conditions are met, 
                                         // then it will proceed


      num = num + (i[a] * j[a]); 


      }

      
      return num; // will return the inner product


      }


   


   public boolean orthog(int[]i, int[]j){ 

      
      if(InnerProd(i, j) == 0){ // if the condition is met, then it will return true


      return true;


      } else {


      return false; // otherwise it will return false


       }


       }
   


   
   public int[][] MatrixMultiplication( int[][] i, int[][] j ){

      
      int[][] multiplication = new int[i.length][i.length];
      
    
      for(int a = 0; a < i.length; a++){ // conditions to be met to proceed


      for(int b = 0; b < i.length; b++){ // conditions to be met to proceed


      for(int c = 0; c < i.length; c++){ // conditions to be met to proceed

              
      multiplication[a][b] = multiplication[a][b] + (i[a][c] * j[c][b]);  
             
      }  
          
      }

      }
      
      
      return multiplication; // will return value

      }
   
   
   

    public int[][] transpose(int[][]i){

    
       int[][] transpose = new int[i.length][i.length];
      
    
       for(int a = 0; a < i.length; a++){ // conditions to be met to proceed


       for(int b = 0; b < i.length; b++){ // conditions to be met to proceed  

           
       transpose[b][a] = i[a][b];   
   
       }

       }
      
       return transpose; // will return its transpose
  
       }
   
       }


