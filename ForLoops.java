//Java class ForLoops.java
/**
 * Skeleton code for the for loops prctice day.
 * 
 * @author Roy Chncellor
 * @version 2/26/2019
 */
public class ForLoops
{
    public static void main ( String args[]){
        //variable declrations
        int i,j,n, cubed, odd,String, sumInt;
       
        //for loop to preform the task
        for(i=0; i<= 10; i++){
             cubed = i*i*i;
            System.out.println(i+ "\t" + cubed);
        }
        for(j=99; j>=1; j=j-2){
            odd= j;
            System.out.println ( odd);
        }
       
          String t = "The quick brown fox jumps over the lazy dog";
          
          int w= t.length();
          t.charAt(0);
          for( n=0; n < t.length(); n++) {
              
            System.out.println (t.charAt(n));
        }
          
          
          
          
            
  
        
    } //end main
}