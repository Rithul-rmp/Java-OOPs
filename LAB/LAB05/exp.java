import java.io.*;
class exp
{
    public static void main(String args[]){
        int a[]= new int [9];
        try
        {
            int h=50/0;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException is handled");
            try{ a[100]=60;}
            catch(ArrayIndexOutOfBoundsException exception){
                System.out.println("Exception is handled");
            }

        }

    }
}