import java.util.Scanner;

public class NthPrimeNumber {
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
        int c=0,i=2,val=0;
        while(c<number){
            if(isPrime(i)){
                c++;
                val=i;
            }
            i++;
        }
        System.out.println(val);
    sc.close();    
    }
}
