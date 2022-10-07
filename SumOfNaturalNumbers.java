import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range=input.nextInt();
        int sum=range*(range+1)/2;
        System.out.println("sum of natural numbers in range is "+sum);
    input.close();
    }
}
