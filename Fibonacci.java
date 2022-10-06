import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-3;i++){
            int x=a+b;
            System.out.print(x+" ");
            a=b;
            b=x;
        }
    sc.close();    
    }
}
