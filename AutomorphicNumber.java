import java.util.Scanner;

public class AutomorphicNumber {
    static String isAutomorphic(int num){
        int square=num*num;
        while(num>0){
            if(num%10!=square%10){
                return(" is not ");
            }
            num=num/10;
            square=square/10;
        }
        return(" is ");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        System.out.println(num+isAutomorphic(num)+"Automorphic number");
    sc.close();
    }
}
