import java.util.Scanner;

public class StrongNumber {
    static int factorial(int num){
        int i=1,res=1;
        while(num>=i){
            res*=i;
            i++;
        }
    return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int c=0,ref=number;
        while(number>0){
            int rem=number%10;
            c+=factorial(rem);
            number=number/10;
        }
        if(c==ref){
            System.out.println("Entered number is Strong number");
        }
        else{
            System.out.println("entered number is not a Strong number");
        }
    sc.close();
    }
}
