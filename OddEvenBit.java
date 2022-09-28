import java.util.Scanner;

public class OddEvenBit {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= sc.nextInt();
        //Program to check if a number is odd or even using bitwise operators
        //always remember bitwise right and left shifts works one when we have to divide the number by 2 or multiply by 2.
        if((n&1)==0)
        {
            System.out.println("Number is ever");
        }
        else
            System.out.println("number is odd");
        //program to swap 2 numbers without using 3rd variable or using bitwise oreprator
        int a= sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The numbers before swap are "+a+" "+b);
        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println("Numbers after swap are "+a+" "+b);
    }
}
