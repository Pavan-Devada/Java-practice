import java.util.Scanner;

public class TechNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int ref=num,digit=0;
        while(num>0){
            digit++;
            num/=10;
        }
        if(digit%2==0){
           int firsthalf=ref/(int)Math.pow(10,digit/2);
           int secondhalf=ref/(int)Math.pow(10,digit%2);
           if((firsthalf+secondhalf)*(firsthalf+secondhalf)==ref){
            System.out.println("Entered number"+ref+"is a Tech number.");
           }
           else{
            System.out.println("Entered number"+ref+"is not a Tech number.");
           }
        }
        else{
            System.out.println("Entered number"+ref+"is not a Tech number.");
        }
    sc.close();    
    }
}
