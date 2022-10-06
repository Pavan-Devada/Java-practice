import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String s=Integer.toString(number);
        int[] intArray=new int[100];
        int index=s.length()-1,ref=number;
        while(number>0){
            int mod=number%10;
            intArray[index]=mod;
            index--;
            number=number/10;
        }
        int val=0,ad=0;
        index=s.length();
        do{
            ad=intArray[val]+intArray[val+1]+intArray[val+2];
            intArray[index]=ad;
            index++;
            val++;
            if(ad==ref){
                System.out.println("Entered number is keith number.");
            }
        }
        while(ad<ref);
        if(ad!=ref){
            System.out.println("Entered number is not a keith number.");
        }
    sc.close();
    }
    
}
