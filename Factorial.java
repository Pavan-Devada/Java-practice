import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
        int r=1;
        while(n!=0){
            r=r*n;
            n=n-1;
        }
        System.out.println("factorial of "+a+" is "+r);
    sc.close();    
    }
}
