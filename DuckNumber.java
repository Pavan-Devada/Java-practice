import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        String s=Integer.toString(number);
        int val=s.length();
        int firstDigit=(int)(number/Math.pow(10,val-1));
        if(firstDigit==0){
            System.out.println("Entered numuber is not a duck number");
        }
        else{
            boolean x=false;
            while(number>0){
                int mod=number%10;
                if(mod==0){
                   x=true;
                   break;
                }
                number=number/10;
            }
            if(x){
                System.out.println("Entered number is a duck number");
            }
            else{
                System.out.println("Entered number is not a duck number");
            }
            
        }
    sc.close();
    }
}
