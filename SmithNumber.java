import java.util.Scanner;
public class SmithNumber {
    static int sumOfDigits(int num){
        int c=0;
        while(num>0){
            int mid=num%10;
            c+=mid;
            num=num/10;
        }
    return c;
    }
    static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
    }
    static int primeFactors(int num){
        int i=2;
        int c=0;
        while(i<num){
            if(num%i==0){
                if(isPrime(i)){
                    c+=sumOfDigits(i);
                }
            }
            i++;
        }
    return(c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int val1=sumOfDigits(number);
        int val2=primeFactors(number);
        if(val1==val2){
            System.out.println("Entered number is Smith number");
        }
        else{
            System.out.println("Entered number is not a smith number");
        }
    sc.close();
    }
}
