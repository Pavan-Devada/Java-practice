import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int lastDigit=number%10;
        if(lastDigit==7||number%7==0){
            System.out.println("Entered number is Buzz Number");
        }
        else{
            System.out.println("Entered numuber is not a Buzz Number");
        }
    sc.close();
    }
}
