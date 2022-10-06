import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        System.out.print("Enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int s=n;
        int r=0;
        while(n!=0){
            int a=n%10;
            r=r*10+a;
            n=n/10;
        }
        if(s==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    sc.close();
    }
}
