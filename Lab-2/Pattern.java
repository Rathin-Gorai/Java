/* Write a Java program to print star pattern.
        *
       * *
      * * *
     * * * *
    * * * * * 
*/
public class Pattern {
    public static void main(String args[]){
        int i, j;
        for(i=0; i<5; i++) {
            for(j=0; j<=i; j++)
                {
                    for(int k=4;k>=0;k--){
                     System.err.print(" ");   
                    }
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}
