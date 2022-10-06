import java.util.Scanner;

public class ISBNNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        long mul=1,c=0;
        while(number>0){
            long rem=number%10;
            c+=mul*rem;
            mul++;
            number/=10;
        }
        if(c%11==0){
            System.out.println("Entered number is a legal ISBN number.");
        }
        else{
            System.out.println("Entered number is not a legal ISBN number.");
        }
    sc.close();
    }
}
