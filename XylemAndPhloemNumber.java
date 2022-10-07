import java.util.Scanner;

public class XylemAndPhloemNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n=number,c1=0,c2=0;
        while(number>0){
            if(number==n||number<10){
                c1+=number%10;
            }
            else{
                c2+=number%10;
            }
            number/=10;
        }
        if(c1==c2){
            System.out.println("Entered number is Xylem number");
        }
        else{
            System.out.println("Entered number is phloem number");
        }
    sc.close();
    }
}
