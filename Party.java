


import java.util.Stack;

// A celebrity at a party is someone that is known by everyone, but knows nobody himself or herself.
// Task: Given a 2d matrix of acquaintances, find the celebrity.

public class Party {
    
    int[][] acquaintances;
    
    public Party(int[][] acquaintances) {
        // it's best if we make a defensive copy of the array we are given...
        int numPeople = acquaintances.length;
        this.acquaintances = new int[numPeople][numPeople];
        for (int i = 0; i < numPeople; i++) {
            for (int j = 0; j < numPeople; j++) {
                this.acquaintances[i][j] = acquaintances[i][j];
            }
        }
    }

    private boolean knows(int a, int b) {
        return ((acquaintances[a][b] == 1) ? true : false);
    }
    
    public int findCelebrity() {
        
        // TODO: Insert code here
        
        
        if (CelebrityIsHere()) 
	
	{
            
	Stack<Integer> Celebrity = new Stack<Integer>();
            
	int a = 0;
            
	int b = 0;
            
        Celebrity.push(0);
            
	while ((a < acquaintances.length - 1) && (b < acquaintances.length - 1)) 
            
	{
               
	Celebrity.push((a >= b ? a + 1 : b + 1));
                
	a = Celebrity.pop();
                
	b = Celebrity.pop();
                
                
	if (this.knows(a,b)) 

	{
                    
	Celebrity.push(b);

        } 

	else {
                    
	Celebrity.push(a);
                
	}
            
	}
            
	return Celebrity.pop();
        
	} 

	else {

        return -1;

        }

        }
            
	private boolean CelebrityIsHere()

	{
                
	int num = 0;

        boolean ans = false;
                
        for (int x = 0; x < acquaintances.length; x++) 

	{
                    
	for (int y = 0; y < acquaintances.length; y++)

	{
                        
	if (acquaintances[x][y] == 0) 

	{
                            
	num++;
                        
        }
                    
	}
                    
        if (num == acquaintances.length) 

	{
                        
	ans = true;
                        
        }
                   
	num = 0;
                
	}
             
	return ans;

        }
                
                
            

    public static void main(String[] args) {
        
        // the structure of the array below is that 
        // if acquaintances[a][b] == 1, then "a knows b"
        // if acquaintances[a][b] == 0, then "a does not know b"
        
        int[][] acquaintances = {{0,1,1,1},
                                 {1,0,1,0},
                                 {0,0,0,0},
                                 {1,0,1,0}};
        
        Party party = new Party(acquaintances);
        int celebrity = party.findCelebrity();
        
        if (celebrity == -1)
            System.out.println("No Celebrity");
        else 
            System.out.println("Celebrity ID = " + celebrity);
    }
}