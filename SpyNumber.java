import java.util.Scanner;

public class SpyNumber {
    public String isSpyNumber(int num){
        int firstVal=0,secondVal=1;
        while(num>0){
            int rem=num%10;
            firstVal+=rem;
            secondVal*=rem;
            num=num/10;
        }
        if(firstVal==secondVal){
            return("is ");
        }
        else{
            return("is not ");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        SpyNumber spy=new SpyNumber();
        System.out.println("Entered number "+spy.isSpyNumber(number)+"a spy number.");
    sc.close();
    }
}
