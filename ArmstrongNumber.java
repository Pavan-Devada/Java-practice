import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int a=n;
        int r=0;
        String s=String.valueOf(n);
        int p=s.length();
        while(a!=0){
            int x=a%10;
            r+=(Math.pow(x,p));
            a=a/10;
        }
        if(n==r){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number is not a palindrome.");
        }
    sc.close();
    }
    
}
