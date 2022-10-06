import java.util.Scanner;
class Process{
    Process(int no){
    int number=no;
    int result=0;
    while(number>0){
        int rem=number%10;
        result=result*10+rem;
        number=number/10;
    }
    System.out.println(result);
    }
    
    }
public class ReveresedNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int no=sc.nextInt();
        Process p=new Process(no);
    sc.close();
    }    
}
