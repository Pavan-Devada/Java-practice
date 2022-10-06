import java.util.Scanner;

public class SunnyNumber {
    static boolean findSquareRoot(int num){
        double value=Math.sqrt(num);
        return(value-Math.floor(value)==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        if(findSquareRoot(number+1)){
            System.out.println("Enter number "+number+" is Sunny number.");
        }
        else{
            System.out.println("Entered number "+" is not a Sunny number");
        }
    sc.close();
    }
}
