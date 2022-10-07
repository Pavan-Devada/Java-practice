import java.util.*;
public class AlternativePrimeNumber {
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
        List<Integer> list=new ArrayList<>();
        int number=sc.nextInt();
        int i=2;
        while(i<number){
            if(isPrime(i)){
                 list.add(i);
            }
            i++;
        } 
        for(int j=0;j<list.size();){
            System.out.println(list.get(j));
            j+=2;
        }
    sc.close();
    }
}
