import java.util.*;

public class GCDNumbers {
    static int gcd1(int[] num){
        int a=num[0],b=num[1],rem=0;
        do{
            rem=b%a;
            b=a;
            a=rem;
        }while(rem!=0);
    return b;
    }
    static int gcd2(int[] num){
        int a=num[0],b=num[1],gcd=1;
        int i=0;
        for(i=1;i<=a&&i<=b;i++){
            if(a%i==0 &&b%i==0)
            gcd=i;
        }
    return gcd;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        String[] list=line.trim().split(" ");
        int[] numbers=new int[list.length];
        int i=0;
        for(String s: list){
            numbers[i]=Integer.parseInt(s);
            i++;
        }
        System.out.println(gcd1(numbers));
        System.out.println(gcd2(numbers));
    input.close();
    }
}
