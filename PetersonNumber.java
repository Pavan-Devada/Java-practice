import java.util.Scanner;

public class PetersonNumber {
    static int factorial(int fnum){
        int value=1;
        for(int i=1;i<fnum+1;i++){
            value*=i;
        }
    return value;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        int ref=number;
        int result=0;
        while(number>0){
           int fnum=number%10;
           result+=factorial(fnum);
           number=number/10;
        }
        if(ref==result){
            System.out.println("Entered number "+ref+" is Peterson number.");
        }
        else{
            
            System.out.println("Entered number "+ref+" is not a Peterson number.");
        }
    sc.close();
    }    
}
