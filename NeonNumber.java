import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int square=number*number;
        int c=0;
        while(square>0){
            int rem=square%10;;
            c+=rem;
            square=square/10;
        }
        if(c==number){
            System.out.println("Entered number is Neon number.");
        }
        else{
            System.out.println("Entered number is not a neon number.");
        }
    sc.close();        
    }
    
}
