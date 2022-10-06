import java.util.Scanner;

public class EmirpNumber {
    public static int reverse(int num){
        int c=0;
        while(num>0){
            int x=num%10;
            c=c*10+x;
            num=num/10;
        }
    return c;
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(isPrime(number)&&isPrime(reverse(number))){
            System.out.println("Entered number is Emirp number");
        }
        else{
            System.out.println("Entered number is not a Emirp numuber");
        }
    sc.close();
    }
}
