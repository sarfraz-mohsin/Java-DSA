import java.util.Scanner;

public class ArrayInput{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array you want");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];
        System.out.println("Enter the array");
        for(int i=0; i<size; i++)
        {
             numbers[i]= sc.nextInt();
        }
        System.out.println("The array you entered is : ");
        for(int i=0; i<size;i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
