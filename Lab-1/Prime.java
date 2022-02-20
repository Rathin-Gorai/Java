public class Prime {
    public static void main(String args[]){
        int a=13,flag=0;
        for(int i=2; i<=a/2; i++){
            if (a%i==0){
                System.out.println("Not a Prime Number");
                flag =1;
                break;
            }
    
        }
        if (flag==0){
            System.out.println("Prime Number");
        }
    }
    
}
