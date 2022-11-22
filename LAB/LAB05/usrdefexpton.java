
import java.util.*;
public class usrdefexpton {
    static void balance(int amt){
        if(amt<500)
        throw new ArithmeticException("Insuficent Balance");
        else
        System.out.println("Proceed");
    }
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        usrdefexpton u= new  usrdefexpton();
        System.out.println("Enter the Amount : ");
        int amt= s.nextInt();
        balance(amt);
        
    } 
}
