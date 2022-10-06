import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String s=Integer.toBinaryString(number);
        int c=0;
        int bin=Integer.valueOf(s);
        while(bin>0){
            int rem=bin%10;
            if(rem==1){
                c+=1;
            }
            bin=bin/10;
        }
        if(c%2==0){
            System.out.println("Entered number is Evil number.");
        }
        else{
            System.out.println("Entered number is not a Evil number");
        }
    sc.close();
    }
}
